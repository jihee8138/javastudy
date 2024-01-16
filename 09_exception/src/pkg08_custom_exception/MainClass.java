package pkg08_custom_exception;

public class MainClass {

  public static void main(String[] args) {
    try {  // 자바가 자동으로 던지는 exception 은 myexception 을 던질 수 없음.
      
      throw new MyException("예외메시지", 1000);
      
      
    } catch (MyException e) {
      
      System.out.println(e.getMessage());
      System.out.println(e.getErrorCode());
      
    }

  }

}

// 사용자의 익셉션은 직접 만들어서 직접 던져야 하낟