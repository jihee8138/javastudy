package pkg02_FunctionalInterface;

public class MainClass {

  public static void main(String[] args) {
    
    // interface MyInterface1 {  void method();  }
    MyInterface1 my1 = ( ) -> System.out.println("Hello World!");
    // MyInterface1 my1 = (매개변수) -> System.out.println("Hello World!");
    my1.method1( );  // 메소드 호출 꼭 해줘야함
    
    // interface MyInterface2 {  String method();  }
    MyInterface2 my2 = ( ) -> "Hello World!";
    // return 문만 있기 때문에 return 생략 가능
    System.out.println(my2.method());  // 메소드 호출 꼭 해줘야함
    
    // interface MyInterface3 {  void method(String name);  }
    MyInterface3 my3 = (name) -> System.out.println(name + "님");
    my3.method("jessica");
    
    // interface MyInterface4 {  String method(String name);  }
    MyInterface4 my4 = (name) -> name + "님";
    System.out.println(my4.method("alex"));
    
    
    
    

  }

}
