package pkg02_generic_type;

public class MainClass {

  public static void main(String[] args) {
    
    // Integer 타입 저장용 Container 객체 생성
    Container <Integer> container1 = new Container<Integer>();
    // T 타입이 Integer로 구체화되어 설정된 값 10을 저장
    container1.setItem(10);
    System.out.println(container1.getItem());
    
    // String 타입 저장용 Container 객체 생성
    Container <String> container2 = new Container<>();
    // T 타입이 String으로 구체화되어서 설정된 값 "hello"를 저장
    container2.setItem("hello");
    System.out.println(container2.getItem());
    
    
  }

}
