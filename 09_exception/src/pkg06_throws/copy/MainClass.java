package pkg06_throws.copy;

public class MainClass {

  public static void main(String[] args) {
    
    int a = 5;
    int b = 0;
    
    // Calculator class 에서 throws 문으로 여기로 예외 던짐 여기서 try ~ catch 처리 해야함
    try {
      Calculator calculator = new Calculator();
      calculator.addition(a, b);
      calculator.subtraction(a, b);
      calculator.multiplication(a, b);
      calculator.division(a, b);
      
    } catch (ArithmeticException e) {
      System.out.println("산술 연산 예외가 발생했습니다.");
    }

  }

}
