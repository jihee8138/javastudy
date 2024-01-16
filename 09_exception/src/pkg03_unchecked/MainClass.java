package pkg03_unchecked;

public class MainClass {

  public static void main(String[] args) {
    
    // unchecked exception : try ~ catch 문이 없어도 동작하는 예외 클래스로 RuntimeException 을 의미한다.
    // RuntimeException 의 후손들
    
    int mok = 5 / 2; // try ~ catch 문이 없어도 unchecked exception 으로 예외 처리함
    System.out.println(mok);
    
    // int mok = 5 / 0; -> 0으로 나눌 수 없기 때문에 오류 발생
  }

}

