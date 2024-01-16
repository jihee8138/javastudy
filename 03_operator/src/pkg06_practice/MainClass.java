package pkg06_practice;

public class MainClass {
  
public static void method1() {
    
    int second = 90;  // 정수형 변수 second 선언, 90으로 초기값 설정
    int m = second / 60;  // 1   분 (second를 60으로 나눈 몫을 구해 m을 저장)
    int s = second % 60;  // 30  초 (second를 60으로 나눈 나머지를 구해 s에 저장)
    System.out.println(m);
    System.out.println(s);
    
  }
  
  public static void method2() {
    
    // x와 y의 값을 교환하기
    
    int x = 10;
    int y = 20;
    int temp;
    
    temp = x;
    x = y;
    y = temp;
    
    System.out.println(x);  // 20
    System.out.println(y);  // 10
    
  }

  public static void method3() {
    
    // 점수가 90점대이면 true 아니면 false
    int score = 95;
    
    // 90점 이상 그리고 100점 미만
    boolean result1 = score >= 90 && score < 100;
    System.out.println(result1);
    
    // 10으로 나눈 몫이 9인 수
    boolean result2 = (score / 10) == 9;
    System.out.println(result2);
    
  }
  
  public static void method4() {
    
    // 짝수/홀수 판단
    // 짝수 : 2로 나눈 나머지가 0인 수
    // 홀수 : 2로 나눈 나머지가 1인 수
    
    int n = 0;
    String result = n % 2 == 0 ? "짝수" : "홀수";
    System.out.println(result);
    
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
