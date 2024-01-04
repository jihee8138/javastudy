package pkg05_condition;

import java.nio.file.spi.FileSystemProvider;

public class MainClass {
  
  public static void method1( ) {
    
    int second = 90;
    int m = second / 60; // 1 분
    int s = second % 60; // 30 초   
    System.out.println(m);
    System.out.println(s);
        
  }
  
  public static void method2() {
  System.out.println("2");
  
  // x와 y의 값을 교환하기
  
  int x = 10;
  int y = 20;
  int temp;
  
  temp = x;
  x = y;
  y = temp;
  
  System.out.println(x); // 20
  System.out.println(y); // 10
  
  }
  
  public static void method3() {
    
    // 점수가 90점대이면 true 아니면 false
    int score = 90;
    
    // 90점 이상 그리고 100점 미만
    boolean result1 = score >= 90 && score < 100;
    System.out.println(result1);
    
    // 10으로 나눈 몫이 9인 수
    boolean result2 = (score / 10) == 9;
    System.out.println(result2);
    
  }
  
  public static void method4() {
    
    //짝수/홀수 판단
    // 짝수 : 2로 나눈 나머지가 0인 수
    // 홀수 : 2로 나눈 나머지가 1인 수
    
    int n = 3;
    String result = n % 2 == 0 ? "짝수" : "홀수";
    System.out.println(result);
    
    
  }

  public static void main(String[] args) {
    method1();
    method2();
    method3();
    method4();
        
    /*
     *  조건 연산
     *  1. 조건식의 결과에 따라 반환 값이 다른 연산이다.
     *  2. 형식 
     *      expr ? if expr is true : if expr is false
     *      ----   ---------------   ----------------
     *      1항    2항               3항              -> 유일한 삼항 연산자
     */
    
    int hour = 11;
    
    String ampm = hour < 12 ? "오전" : "오후";
    System.out.println(ampm);
    
    int score = 50;
    String result = score >= 60? "합격" : score >= 50? "재시험" : "불합격";
    System.out.println(result);
    
    
    

  }

}
