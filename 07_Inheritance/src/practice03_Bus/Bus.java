package practice03_Bus;

public class Bus {
  
  // field
  private Seat[] seats;  // seats는 Seat 객체들을 담는 배열
  private int numOfPerson;  // 현재 탑승한 사람의 수
  
  //constructor
  public Bus() {  // 버스가 생성될 때 
    seats = new Seat[25];  // seats 배열을 선언하고 크기를 25개로 지정하여 25개의 좌석을 만든다.
    for(int i = 0; i < seats.length; i++) {  // 각 좌석에 대한 초기화 수행 i(변수) = 배열의 인덱스
      seats[i] = new Seat();  // seats 배열의 각 인덱스에 새로운 Seat 객체를 생성하여 할당
    }
  }
  
  // method
  
  // 버스 타기 (앞 자리부터 채우는 방식으로 얹기)
  public void on(Person person) {  // on 메서드를 정의 (사람이 버스에 탑승하는 역할)
    if(numOfPerson >= seats.length ) {  // numOfPerson가 버스의 총 좌석 수보다 크거나 같으면
      System.out.println("만석입니다. 버스에 탈 수 없습니다.");
      return;
    }
    for(int i = 0; i < seats.length; i++) {  // 빈 좌석을 찾아 사람 앉히는 과정 역할
      if(seats[i].getPerson() == null) {  // seats[i] (= 현재 확인 중인 좌석)에 아무도 앉아있지 않는 경우
        seats[i].setPerson(person);  // 빈 좌석에 사람을 앉힘. seats[i]에 사람(person) 설정
        numOfPerson++;
        break;
      }
    } 
  }
  
  // 버스 내리기
  public void off(int seatNo) {
    if(seatNo <= 0 || seatNo > seats.length ) {
      System.out.println("좌석 번호가 잘못 전달되었습니다.");
      return;
    }
    seats[seatNo - 1].setPerson(null);
    numOfPerson--;
  }
  
  // 버스 탑승 명단
  public void info () {
    System.out.println("===== 탑승자 목록 확인 =====");
    for(int i = 0; i < seats.length; i++) {
      // 각 좌석에 앉아 있는 사람
      Person person = seats[i].getPerson();
      if(person == null) {
        System.out.println(String.format("%02d", i + 1) + "번 좌석 : 비어 있음");
      } else {
        System.out.println(String.format("%02d", i + 1) + "번 좌석 : " + person.getName());
      }
    }
    
  }

}
