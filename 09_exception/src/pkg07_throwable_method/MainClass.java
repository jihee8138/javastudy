package pkg07_throwable_method;

public class MainClass {
  
  public static void method1() {
    
    // 예외 메시지 확인하기 (기본 예외 메시지)
    // 예외마다 다른 기본 예외 메시지가 준비되어있음 
    
    try {
      
     // int a = 5 / 0;
     Integer.parseInt("12.5");
      
    } catch (Exception e) {
      
      System.out.println(e.getMessage()); 
    }
    
    
  }
  
  public static void method2() {
    
    // 예쇠 메시지 확인하기 (사용자 예외 메시지)
    
    try {
      int a = 5;
      int b = 0;
      
      if(b == 0) { 
        throw new RuntimeException("0으로 나눌 수 없습니다.");
      }
      System.out.println(a / b);
      
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }
    
    
    
  }
  
  public static void method3() {
    
    // 예외 추적하기 : 개발할 때 사용
    
    
    try {
      int[] numbers = new int[] {1, 2, 3, 4, 5};
      int total = 0;
      
      for(int i = 1; i <= 5; i++) { // 0 ~ 4까지 써야하는데 1 ~ 5까지 씀
        total += numbers[i];
      }
      System.out.println(total);  
      
    } catch (Exception e) {
      // system.out 에 넣지 않음.
      e.printStackTrace(); // 어느 포인트에서 문제가 발생하는지 알려줌
    }
    
  }
  
  public static void main(String[] args) {
    
    method3();

  }

}
