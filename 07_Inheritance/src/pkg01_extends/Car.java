package pkg01_extends;

public class Car {
  
  // 상속이여도 자식클래스에서는 부모클래스의 private 메서드는 쓸 수 없음.
  // protected는 private과 달리 자식클래스의 접근은 허용함.
  private String model;  // private는 자식도 못 본다.
  protected String maker;  // protected는 자식에서 오픈한다.
  
  public void forward() {
    System.out.println("앞으로");
  }
  
  public void reverse() {
    System.out.println("뒤로");
  }

  public void stop() {
    System.out.println("멈춤");
  }
  
  
}
