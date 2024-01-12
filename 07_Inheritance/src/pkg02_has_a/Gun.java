package pkg02_has_a;

public class Gun {
  public final static int MAX_BULLET = 20; // 이 총 안에는 총알이 최대 20개 들어간다.
  private int bullet;  // 실제 들어있는 총알의 수
  
  public Gun() {
    bullet = 10; // 기본 10개는 들어있음
  }

  public int getBullet() {
    return bullet;
  }

  public void setBullet(int bullet) {
    this.bullet = bullet;
  }
  
  public void shoot () {
    
    // 총알이 없을 때
    if(bullet == 0) {
      System.out.println("총알이 없습니다.");
      return;
    }
    
    // 총을 쐈을 때
    System.out.println("빵야! 현재 총알 : " + --bullet + "개");
    
  }
  public void reload(int bullet) { // 총알을 받아와서 장전
    
    // 장전이 안 되는 경우
    
    //총알이 없을 때
    if(bullet <= 0) {
      System.out.println("정상적으로 총알을 넣으세요.");
      return;
    }
    
    // 현재 총알에 장전할 총알을 더했는데 맥스보다 클 때
    if(this.bullet + bullet > MAX_BULLET) {
      System.out.println("총알이 너무 많습니다.");
      return;
    }
    
    this.bullet += bullet;
    System.out.println(bullet + "발 장전 완료. 현재" + this.bullet + "발 있음");
    
  }

}
