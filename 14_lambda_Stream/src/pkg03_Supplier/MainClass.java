package pkg03_Supplier;

import java.util.function.Supplier;

public class MainClass {
  
  /*
   * java.util.function.Supplier
   * 1. 형식
   *    public interface Supplier<T> {
   *    T get();
   *    }
   *    2. 파라미터 X, 반환 0 형식의 get 메소드를 지원하면 함수형 인터페이스이다.
   */
  public static void method1() {
    Supplier<String> supplier = () -> "Hello World!";
    System.out.println(supplier.get());
  }
  
  public static void method2(Supplier<String> supplier) {
    System.out.println(supplier.get()); 
  }

  public static void method3(Supplier<Integer> supplier)  {
    System.out.println(supplier.get()); 
  }
  
  public static void main(String[] args) {
    
    method1();
    
    method2(() -> "Hello World!");
    
    // 호출할 때마다 1 ~ 10 사이 난수를 출력하는 method3
    method3(() -> (int)(Math.random() * 10 + 1));
    
    
    
  }

}
