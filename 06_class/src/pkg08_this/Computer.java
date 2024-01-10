package pkg08_this;

public class Computer {
  
  String model;
  int price;
  
  // this() : 생성자를 호출하는 것 
  // this의 주된 사용은 필드 호출이다. 메소드도 잘 호출하지 않음. 필드는 매개변수와 이름이 동일한 경우가 잦기 때문에 필드 호출이 많음.
  // this.멤버 : 멤버(필드, 메소드)를 호출하는 것
  Computer() {
    this(null, 0); // 인자값(파라미터)이 2개인 생성자를 호출함. = Computer(String model, int price)을 호출한 것
  }
  
  
  Computer(String model) {
    this(model, 0); // = Computer(String model, int price)을 호출한 것
    
  }
  
  
  Computer(String model, int price) { // 
    this.model = model; // 앞에 있는 model = 필드값 , 뒤에 있는 model = 매개변수
    this.price = price; // this를 이용해서 멤버호출이 가능하기 때문에 this로 멤버와 매개변수를 구분할 수 있음.
    
  }
  void showThis() {
    System.out.println(this); // this : 현재 객체(showThis() 메소드를 호출한 객체)를 의미함.
    // 컴퓨터 클래스 안에서는 디스가 컴퓨터 객체
    // 같은 클래스 안에서는 같은 객체를 디스라고 부른다
    // 다른 클래스에서는 그 객체의 이름을 정해서 부른다.
  }
  
  void showModel() {
    System.out.println(this.model);    
  }
}
