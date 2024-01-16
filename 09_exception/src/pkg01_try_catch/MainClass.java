package pkg01_try_catch;

public class MainClass {
  
  public static void method1() {
    
    // 예외 처리가 발생하는 상황
    
    String userInput = "12.3";
    
    int number = Integer.parseInt(userInput);
    System.out.println(number);
    
  }

  public static void method2() {
    
    // 예외 처리 : try ~ catch
    
    try {
      // 트라이 실행되는 영역 (예외를 catch 에게 던짐)
      String userInput = "12.3";
          
          int number = Integer.parseInt(userInput);  // 예외(NumberFormatException)가 발생되는 부분 
      System.out.println(number);
      
    } catch(NumberFormatException e) {  //catch(발생한 예외 파라미터 + e) e 또는 ex 로 예외를 줄여서 씀
      // 예외처리반 (try 블록에서 발생한 예외를 잡는다)
      // 발생된 예외를 받고 처리를 안 하면 예외가 발생해도 오류는 나지 않지만 정상적 실행이 되지 않음
      // catch 블록은 비워두지 않기
      System.out.println("정수만 입력하세요.");
    }
      
  }
  
  public static void method3() {
    
    String[] userInputs = {"10", "20", "1.5", "2.5", "30"};
    
    for(int i = 0; i < userInputs.length; i++) {  // 3번째 루프(1.5)에서 예외가 발생해서 for문 자체가 끝나버림
      
      try {
        int number = Integer.parseInt(userInputs[i]);
        System.out.println(number);
        
      } catch(NumberFormatException e) {  // 예외가 발생하더라도 for문이 끝까지 실행됨.
        System.out.println(userInputs[i] + "는 정수가 아닙니다.");
      }
    }
  }
  
  public static void method4() {
    
    // 다중 catch 블록 (try는 하나만, catch는 필요하다면 여러 개 불러올 수 있음)
    
    String[] userInputs = {"10", "20", "1.5", "2.5", "30"};
    
    try {  // try 안에 for문이 있는 경우
      
      for(int i = 0; i < userInputs.length; i++) {
        int number = Integer.parseInt(userInputs[i]);
        System.out.println(number);
      }
    } catch(NumberFormatException e) {  // 예외가 발생하면 "정수만 처리할 수 있습니다." 후 끝
      System.out.println("정수만 처리할 수 있습니다.");
    }
    
  }
  
  public static void method5() {
    
    // 다중 catch 블록 (try는 하나만, catch는 필요하다면 여러 개 불러올 수 있음)
    
    String[] userInputs = {"10", "20", "15", "25", "30"};
    
    try {  // try 안에 for문이 있는 경우
      
      for(int i = 0; i < 6; i++) {  // 배열의 크기가 5
        int number = Integer.parseInt(userInputs[i]);
        System.out.println(number);
      }
    } catch(NumberFormatException e) {  // 예외가 발생하면 "정수만 처리할 수 있습니다." 후 끝
      System.out.println("정수만 처리할 수 있습니다.");
      
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("사용할 수 없는 인덱스가 사용되었습니다.");
    }
    
  }
  
  public static void method6() {
    
    // 다중 catch 블록 (try는 하나만, catch는 필요하다면 여러 개 불러올 수 있음)
    
    String[] userInputs = {"10", "20", "15", "25", "30"};
    
    try {  // try 안에 for문이 있는 경우
      
      for(int i = 0; i < 6; i++) {  // 배열의 크기가 5
        int number = Integer.parseInt(userInputs[i]);
        System.out.println(number);
      }
      // RuntimeException이 ArrayIndexOutOfBoundsException의 부모
      // RuntimeException을 먼저 두면 오류 남
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("사용할 수 없는 인덱스가 사용되었습니다.");
      
    } catch(RuntimeException e) {  // 자식 타입을 위에, 부모 타입을 아래에 둔다.
      System.out.println("정수만 처리할 수 있습니다.");
    }
    
  }
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub

    method6();
  }

} 