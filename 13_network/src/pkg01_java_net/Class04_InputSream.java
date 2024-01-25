package pkg01_java_net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Class04_InputSream {

  public static void method1() {
    String spec = "https://www.google.com/";
    URL url = null;
    HttpURLConnection con = null;
    
    BufferedReader in = null;
    
    try {
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      if(con.getResponseCode() != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(spec + "접속 불가");
      }
      
     in = new BufferedReader(new InputStreamReader(con.getInputStream()));
     
     String line = null;
     
     StringBuilder builder = new StringBuilder();
     while((line = in.readLine()) != null) {
       builder.append(line).append("\n");
     }
     
     System.out.println(builder.toString());
     
     in.close();
       
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if(con != null)
        con.disconnect();
    }

  }  public static void method2() {
    
  }
    
   
    public static void main(String[] args) {
    
  }

}
