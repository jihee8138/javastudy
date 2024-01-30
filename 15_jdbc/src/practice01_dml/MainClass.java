package practice01_dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;

public class MainClass {
  
  /*
   * TALK_T 테이블에 1행씩 삽입하시오.
   * TALK_T 구조
   *    TALK_NO      NUMBER (PK)
   *    TALK_CONTENT VARCHAR2(1000 BYTE)
   *    TALK_EDITOR  VARCHAR2(1000 BYTE)
   *    WRITEN_AT    TIMESTAMP (* 현재 날짜/시간 : CURRENT_TIMESTAMP)
   *  TALK_SEQ 시퀀스 존재함
   *  DB 서버 환경
   *     192.168.0.214
   *     GD/1111
   */
  
  public static void main(String[] args) {
    
    Connection con = null;
    PreparedStatement ps= null;
    
    try {
      
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      
      con = DriverManager.getConnection(url, user, password);
      
      String sql = "INSERT INTO TALK_T(TALK_NO, TALK_CONTENT, TALK_USER, WRITEN_AT) VALUES(TALK_SEQ.NEXTVAL, '안녕하세요', '정지희', CURRENT_TIMESTAMP)";
      
      ps = con.prepareStatement(sql);
      
      ps.executeUpdate();
      
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      //Connection, PreparedStatement 객체 닫기(반환)
      try {
        if(con != null) con.close();
        if(ps != null)  ps.close();
  
      } catch (Exception e) {
        e.printStackTrace();
      } 
    }
    
  }
  }