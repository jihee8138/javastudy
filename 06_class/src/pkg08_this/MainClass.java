package pkg08_this;

public class MainClass {

  public static void main(String[] args) {
    
    Computer computer = new Computer();
    
  System.out.println(computer);
  computer.showThis();
  
  System.out.println(computer.model);
  computer.showModel();
  // 메인클래스에서의  this는 메인클래스를 뜻하므로 컴퓨터 객체의 이름을 이용해서 호출
  // 동일한 대상을 지정하는 호출방식의 차이
  }

}
