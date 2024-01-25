package pkg01_java_net;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Class05_URLEncoder {
  
  /*
   * URLEncoder 인코딩해주는 애 영문, 숫자 그대로 가고 특수문자, 한문 같은 것들은 인코딩 상태로 바뀜 
   */

  public static void main(String[] args) {
    
    try {
      
      String str = "http://www.google.com/";
      String encoded = URLEncoder.encode(str, "UTF-8");
      System.out.println(encoded);
      
      String decoded = URLDecoder.decode(encoded, "UTF-8");
      System.out.println(decoded);
      
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
    

  }

}
