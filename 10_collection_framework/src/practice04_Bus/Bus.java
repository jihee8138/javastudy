package practice04_Bus;

import java.util.ArrayList;
import java.util.List;

public class Bus {
  
  // field
  private List<Seat> seats;  // Seat 객체들을 담는 List
  public static final int LIMIT = 25;
  private int numOfPerson; // 버스에 사람이 있는 게 아니라 의자가 있기 때문에 의자에 앉아있는 사람의 명수를 체크해야하기 때문에 필요
  
  //constructor
  public Bus() {  // 버스가 생성될 때 
    seats = new ArrayList<Seat>(LIMIT);  
    for(int i = 0; i < LIMIT; i++) {  
      seats.add(new Seat());  
      //ArrayList에 만들어진 25개의 좌석에 순차적으로 사람을 넣는 작업
    }
  }
  
  // method
  
  // 버스 타기 (앞 자리부터 채우는 방식으로 얹기)
  public void on(Person person) throws RuntimeException {
    // 지금 버스에 몇 명이 탔는지 체크
    
    if(numOfPerson >= LIMIT ) {  // numOfPerson가 버스의 총 좌석 수보다 크거나 같으면
      throw new RuntimeException("만석입니다. 버스에 탈 수 없습니다.");
    }
    for(int i = 0; i < LIMIT; i++) {  // 빈 좌석을 찾아 사람 앉히는 과정 역할
      // 각 좌석을 의미
      Seat seat = seats.get(i);
      if(seats.get(i).getPerson() == null) {  // 현재 확인 중인 좌석에 아무도 앉아있지 않는 경우
        seat.setPerson(person);;  // 
        numOfPerson++;
        break;
      }
    } 
  }
  
  // 버스 내리기
  public void off(int seatNo) throws RuntimeException {  // 정수형 매개변수 seatNo를 받음
    if(seatNo <= 0 || seatNo > LIMIT ) { // 좌석번호가 0 이하이거나 좌석의 총 개수보다 크면
      throw new RuntimeException("좌석 번호가 잘못 전달되었습니다.");
    }
    seats.get(seatNo-1).setPerson(null);  // 내리려는 좌석 번호에 해당하는 좌석에서 현재 앉아있는 승객을 제거
    // 좌석번호는 1부터 시작하므로, 배열의 인덱스에 맞추기 위해 1 빼주고 해당 좌석에 아무도 앉아있지 않도록 설정(seatPerson(null))
    numOfPerson--; 
  }
  
  // 버스 탑승 명단
  public void info () {  // 버스에 탑승한 승객 정보를 확인
    System.out.println("===== 탑승자 목록 확인 =====");
    for(int i = 0; i < LIMIT; i++) {  // 반복문을 사용하여 버스의 모든 좌석을 확인 (i = 현재 확인 중인 좌석의 인덱스)
      // 각 좌석에 앉아 있는 사람 
      // 시트 하나당 앉아있는 사람
      Person person = seats.get(i).getPerson();  // 현재 확인 중인 좌석에 앉아있는 사람을 가져옴. 만약 해당 좌석에 아무도 앉아 있지 않으면 person은 null이 됨.
      if(person == null) {  // 만약 해당 좌석에 아무도 앉아있지 않으면
        System.out.println(String.format("%02d", i + 1) + "번 좌석 : 비어 있음");
      } else {
        System.out.println(String.format("%02d", i + 1) + "번 좌석 : " + person.getName());
      }
    }
    
  }

}
