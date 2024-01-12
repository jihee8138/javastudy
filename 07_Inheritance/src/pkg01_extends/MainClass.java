package pkg01_extends;

public class MainClass {

  public static void main(String[] args) {
    
    Ev ev = new Ev();
    ev.charge(); 
    // System.out.println(model);  // 부모의 private에는 접근 불가
    // System.out.println(maker);     // 부모의 protected 에는 접근 가능
    System.out.println("충전");
    ev.forward();
    ev.reverse();
    ev.stop();
  }

}
