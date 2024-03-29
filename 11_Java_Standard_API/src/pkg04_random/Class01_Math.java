package pkg04_random;

public class Class01_Math {

  public static void main(String[] args) {
    
    /*
     * Math.random()                  0.0 <= 난수 < 1.0 (0.0 이상 1.0 미만)
     * Math.random() * 5              0.0 <= 난수 < 5.0
     *  (int)(Math.random() * 5)        0 <= 난수 < 5
     *  (int)(Math.random() * 5 + 1)    1 <= 난수 < 6
     */
    
    // 5% 확률로 "대박"
    if(Math.random() < 0.05) {
      System.out.println("대박");
    } else {
      System.out.println("대박은 무슨");
    }

    // 주사위 던지기
    int dice  = (int)(Math.random() * 6 + 1);  // 1부터 6개 숫자 중 하나가 발생한다.
    System.out.println(dice);
  
  }
  
}
