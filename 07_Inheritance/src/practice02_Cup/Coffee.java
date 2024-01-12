package practice02_Cup;

// 부모 클래스 (자식 : 아메리카노, 카페라떼)
public class Coffee {
  
  // whoami를 아메리카노와 카페라떼에 오버라이드해야 함
  // 호출은 커피의 후엠아이를 하지만 
  // 실행은 커피에 오버라이드 된 메서드(아메리카노, 카페라떼)로 바뀌어서 실행 됨
  // 호출은 부모꺼로 하고 실행은 자식꺼로
  
  public void whoami() {
    System.out.println("커피"); 
  // 오버라이드했기 때문에 호출 시 "커피"가 실행되면 잘못된 거임.
  }
  
}
