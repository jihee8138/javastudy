package practice02_Cup;

// 자식 클래스
public class Americano extends Coffee{
  
  // 똑같은 컵에 담겼지만 아메리카노와 카페라떼 구분하는 방법 
  
  @Override
  public void whoami() {
    System.out.println("아메리카노");
  }

}