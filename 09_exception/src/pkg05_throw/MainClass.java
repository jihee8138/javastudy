package pkg05_throw;

public class MainClass {

  public static void main(String[] args) {
    
    /*
     * throw
     * 1. 직접 예외 객체를 만들어서 던질 때 사용한다. (new 이용하여)
     * 2. 자바가 자동으로 던지지 않는 예외들은 throw 문으로 직접 던져야 한다.
     *    (자바가 생각했을 땐 예외가 아니지만 우리가 생각했을 땐 예외인 것들)
     */
    try { // 점수에 따른 학점 출력 코드
      int score = 100; // 0 ~ 100
      char grade;
      
      // score 범위가 0 ~ 100을 벗어난 경우 예외처리하기
      // if 문으로 예외상황을 조건식으로 작성
      if(score < 0 || score > 100) {
        // return 문으로 강제종료하는 것이 아닌 throw 문을 이용하여 catch 문으로 보내기
        throw new RuntimeException(); // 인자값 (보내는 곳) / catch 문의 매개변수로 감
      }
      
      if(score >= 90)  // 점수가 90점 이상이면
        grade = 'A';
      else if(score >= 80)
        grade = 'B';
      else if(score >= 70)
        grade = 'C';
      else if(score >= 60)
        grade = 'D';
      else 
        grade = 'F';
      
      System.out.println("점수 : " + score + "점, 학점 :" + grade + "학점");
      
      // Exception e = new RuntimeException(); -> 업캐스팅
    } catch (Exception e) {  // 매개변수 (받는 곳)
      System.out.println("잘못된 점수입니다.");
    }

  }

}
