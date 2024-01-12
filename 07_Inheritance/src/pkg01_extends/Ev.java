package pkg01_extends;

// 부모자식 만드는 방법 : 자식 class에서 자식클래스 + extecds + 부모클래스
// 따로 메서드를 적지 않아도 부모 클래스에 있는 메서드의 정보를 가지고 있음
// class 자식 extends 부모 { }
// class 서브(자식) extends 슈퍼(부모) { }  
public class Ev extends Car {
  
  public void charge() {
    System.out.println("충전");
    // System.out.println(model);
    System.out.println(maker);
    
  }
  


}
