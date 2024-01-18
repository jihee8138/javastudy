package pkg02_date_time;

import java.util.Date;

public class Class01_Date {

  public static void main(String[] args) {
    
    //Date.java.util java.1.0
    //Date.java.sql  java.1.1
    
    Date date1 = new Date();
    System.out.println(date1);
    
    // Date(long date) = 1970/01/01부터 시작 
    Date date2 = new Date(1000 * 60 * 60 * 24 * 30L);  // 1970/01/30
    System.out.println(date2);
    
    

  }

}
