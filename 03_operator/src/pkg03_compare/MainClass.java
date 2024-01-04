package pkg03_compare;

public class MainClass {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    // 비교 연산자
    // 연산 결과는 boolean 타입 -> true 또는 false
    
    int a = 10;
    int b = 20;
    
    System.out.println(a > b); // a > b이면 true
    System.out.println(a >= b); // a >= b이면 true
    System.out.println(a < b); // a < b이면 true
    System.out.println(a <= b); // a <= b이면 true
    System.out.println(a == b); // a와 b가 같으면 true
    System.out.println(a != b); // a와 b가 다르면 true
    
    // 문자열의 동등 비교는 사용을 금지한다.
    String s1 = "hello";
    String s2 = "hello";
    System.out.println(s1 == s2);
    

  }

}
