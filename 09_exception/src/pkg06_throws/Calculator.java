package pkg06_throws;

public class Calculator {
  
  public void addition(int a, int b) {
    System.out.println(a + "+" + b + "=" + (a + b));
  }
    
  public void subtraction(int a, int b) {
    System.out.println(a + "-" + b + "=" + (a - b));
  }
      
  public void multiplication(int a, int b) {
    System.out.println(a + "*" + b + "=" + (a * b));
  }
  
  /*
   * throws
   * 1. 메소드에서 발생한 예외를 메소드를 호출한 곳으로 던질 때 사용한다.
   * 2. 2개 이상의 예외를 던질 수 있다. (그래서 throws)
   * 3. 메소드를 호출한 곳에서는 예외처리 코드(try ~ catch)가 추가되어야 한다.
   */
  
  
  // 5 나누기 2를 실행하고 나서 예외가 발생하면 호출한 곳(MainClass)으로 던진다
  public void division(int a, int b) //실제로 예외가 발생하는 코드 
      throws ArithmeticException { 
    System.out.println(a + "/" + b + "=" + (a / b));
  }

}
