package practice02_Cup;

public class Carrier {

  // Cup 타입의 배열 cups를 선언
  private Cup[] cups;   // 캐리어에 컵 2개 이상 들어가므로 배열 주기
  private int idx;      // cups 배열의 인덱스
  
  // 생성자 메소드 
  // cupCount 라는 매개변수를 받아 Cup 배열인 cups를 해당 크기로 초기화
  public Carrier(int cupCount) {
    cups = new Cup[cupCount];
  }
  
  // 컵 담기
  public void addCup(Cup cup) {
    if(idx >= cups.length) {  // 현재 캐리어에 담긴 컵의 개수가 배열 크기 이상이라면
      System.out.println("캐리어가 가득 찼습니다.");
      return;
    }
    cups[idx++] = cup;  // 배열의 현재 인덱스 위치에 주어진 Cup 객체를 할당하고 인덱스를 1 증가시킴
    System.out.println("현재 컵 : " + idx + "개, 앞으로 " + (cups.length - idx) + "개 추가 가능");
  }
  
  // 캐리어 확인
  public void whoami() {
    for(int i = 0; i < idx; i++) {  // 현재까지 담긴 컵의 개수만큼 반복
      cups[i].whoami();  // 각 컵 객체의 whoami() 메소드를 호출하여 해당 컵의 정보를 출력
    }
  }
  
}