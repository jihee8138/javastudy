package pkg05_condition;

import java.nio.file.spi.FileSystemProvider;

public class MainClass {

  public static void main(String[] args) {
         
    /*
     *  조건 연산
     *  1. 조건식의 결과에 따라 반환 값이 다른 연산이다.
     *  2. 형식 
     *      expr ? if expr is true : if expr is false
     *      ----   ---------------   ----------------
     *      1항    2항               3항              -> 유일한 삼항 연산자
     */
    
    int hour = 11;  // 정수형 변수 hour를 선언하고 11을 초기값으로 설정
    
    String ampm = hour < 12 ? "오전" : "오후";  // 삼항 연산자를 사용하여 조건식을 평가
    // 만약 hour가 12보다 작으면 오전을, 그렇지 않으면 오후를 선택하여 ampm 변수에 저장
    System.out.println(ampm);
    
    int score = 50;  // 정수형 변수 score를 선언하고 50을 초기값으로 설정
    String result = score >= 60? "합격" : score >= 50? "재시험" : "불합격";  // 중첩된 삼항 연산자 사용
    // score >= 60 가 만약 참이면 합격 반환, 그렇지 않으면 다시 score >= 50을 평가
    // 만약 참이면 재시험, 거짓이면 불갑격 반환
    System.out.println(result);
    
    
    

  }

}
