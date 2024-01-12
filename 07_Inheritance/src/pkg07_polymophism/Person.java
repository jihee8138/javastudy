package pkg07_polymophism;

public class Person {
  
  // 전원을 켜는 대상이 달라도 하나의 메서드로 동작 가능하게 해보자
  public void powerOn(Elec elec) { 
    // Elec elec = new Tv() 또는 Elec elec = new Radio()
    
    /*
     * 1. 다운캐스팅으로 powerOn() 호출하기 -> 전자제품이 추가될 때마다 코드의 추가가 필요하다
     *    추천하지 않는 방법
     * if(elec instanceof Tv) {
     * ((Tv)elec).powerOn();
     * }
     * else if (elec instanceof Radio) {
     * ((Radio) elec).powerOn();
     * }
     * 
     * 2. Elec에 powerOn() 메서드를 추가하고 Tv나 Radio가 오버라이드 하기
     */
    
     elec.powerOn();
     
     /*
      * 다형성의 구현 (다형성 : 하나의 코드로 여러가지를 실행한다.)
      * 1. 업캐스팅 (부모로 자식을 다 저장하자)
      * 2. 부모의 메서드를 추가해주고 자식들은 다시 만들자
      *    1) 클래스들의 부모를 세운다.
      *    2) 부모에 자식들에게서 호출할 메서드를 다 집어넣는다.
      *    3) 그리고 자식들을 다시 만든다.
      * 부모 = 클래스들의 공통 타입을 가지고 있다는 특징이 있다.
      */
     
    
  }

}
