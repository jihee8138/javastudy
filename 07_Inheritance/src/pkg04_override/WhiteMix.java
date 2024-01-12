package pkg04_override;

  /*
   * 메소드 오버라이드 (메소드 덮어쓰기, 또는 다시 만들기)
   * 1. 자식 클래스가 부모 클래스의 메소드를 다시 만드는 것
   *    부모의 메소드를 자식 클래스가 쓸 수 없기 때문에 오버라이드라고 부름
   * 2. 메소드 앞에 @Override annotation(= @)을 추가한다.
   * 3. 똑같이 (반환타입, 메소드명, 매개변수) 만들어야 한다.
   *    (public은 메소드 구성이 아님)
   */
public class WhiteMix extends Kanu {
  
  /*
   * Override를 추가하는 이유 
   * 1. 문법 체크를 하기 위해서
   *    Override한 메소드라고 JVM에게 알려줌으로써 JVM이 자동으로 문법 검사를 시행함.
   *    추가를 안 해도 동작에 오류는 없으나 추가함으로써 오류를 방지할 수 있음.
   * 2. 다른 개발자에게 알려주기 위해서
   */
  
  @Override 
  public void color() {
    System.out.println("커피색");
  }

}

