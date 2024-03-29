package pkg01_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Properties;

public class MainClass {
  
  /*
   * oracle.jdbc.OracleDriver (클래스)
   * 1. 오라클 데이터베이스에 접속하기 위해서 필요한 드라이버 클래스이다.
   * 2. 오라클에서 만들어서 배포한다.
   * 3. 18c XE 버전의 경우 C:\app\GD\product\18.0.0\dbhomeXE\jdbc\lib\ojdbc8.jar 파일을 프로젝트의 build path에 등록해야 한다.
   * 자바 입장에서 보면 이건 자바 표준 클래스가 아님
   * 오라클에서 따로 만들어서 배포한 것임
   * 모든 디비에 접속을 위해선 드라이버 클래스가 필요한데 모든 드라이버 클래스는 디비밴더가 제공한다
   * 오라클용 마이에스큐엘용 다 따로 있음
   * 오라클 폴더 lib = 각종 jar 파일들이 모여있는 곳
   */
  
  /*
   * java.sql.Connection
   * 1. 데이터베이스 접속 객체 타입의 인터페이스이다.
   * 2. java.sql.DriverManager 클래스가 데이터베이스 접속 객체를 생성한다.
   * 3. 형식
   *    Connection con = DriverManager.getConnection(); 
   */
  
  /*
   *  프로퍼티(Property, 속성)
   *  1. 운영체제의 정보나 자바 실행 정보 등을 가지고 있는 값이다.
   *  2. 사용자가 프로퍼티를 추가해서 사용할 수 있다.
   *  3. 프로퍼티 추가 방법
   *     1) [Run] -  [Run Configurations] -  [Arguments] -  [VM arguments]
   *     2) 프로퍼티 앞에 prefix 값으로 -D를 사용한다.
   *  4. github.com에 올릴 수 없는 민감 정보를 처리하는 용도로 사용한다.
   *  5. 프로퍼티로 등록한 값은 System.getProperty() 메소드를 이용해서 가져온다.
   */
  
  public static void method1() {
    
    // oracle/jdbc.OracleDriver 클래스 로드하기 (메모리에 올리기)
    try {
      Class.forName("oracle.jdbc.OracleDriver");
      System.out.println("oracle.jdbc.OracleDriver 클래스가 메모리에 로드되었습니다.");
      
    } catch (Exception e) {
      System.out.println("oracle.jdbc.OracleDriver 클래스를 찾을 수 없습니다.");
    }  
  }

  public static void method2() {
    
    // 접속을 위해서 필요한 정보 (주소, 계정정보)
    String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
    String user = "GD";
    String password = "1111";
        // @ 뒤에 나오는 것이 주소, 앞에는 찾아야할 대상
        //127.0.0.1 : 로컬호스트주소 뒤에는 포트번호
    
    // Connection 객체 선언
    Connection con = null;
    
    try {
      
      // Connection 객체 생성
      con = DriverManager.getConnection(url, user, password);
      System.out.println("데이터베이스에 접속되었습니다.");
      
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
       try {
        if(con != null) {
          con.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
        
    
  }
  
  public static void method3() {
    
    // 프로퍼티 파일을 읽어들이는 클래스
    Properties props = System.getProperties();  // 이미 등록되어 있는 모든 프로퍼티 다 가져오기
    
    Enumeration  enumeration = props.propertyNames();
    
    while(enumeration.hasMoreElements()) {
      String property = (String)enumeration.nextElement();
      System.out.println(property + "=" + props.getProperty(property));
    }
    
  }
  
  public static void method4() {
    
    // 사용자 프로퍼티 등록 (jdbc.url, jdbc.user, jdbc.password)
    // -Djdbc.url=jdbc:oracle:thin:@192.168.0.214:xe
    // -Djdbc.user=GD
    // -Djdbc.password=1111
    
    // 데이터베이스 접속 정보 (사용자 프로퍼티 가져오기)
    String url = System.getProperty("jdbc.url");
    String user = System.getProperty("jdbc.user");
    String password = System.getProperty("jdbc.password");
    
    Connection con = null;
    
    try {
      
      con = DriverManager.getConnection(url, user, password);
          System.out.println("데이터베이스에 접속되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(con != null) {
          con.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void main(String[] args) {
    

    method4();
    
  }

}
