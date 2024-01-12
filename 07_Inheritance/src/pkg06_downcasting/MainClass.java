package pkg06_downcasting;

public class MainClass {

  public static void main(String[] args) {
    
    /*
     * 다운캐스팅 (업캐스팅의 문제점 해결책 중 첫번째)
     * 1. (업캐스팅 된)부모 타입의 객체를 자식 타입으로 바꿀 수 있다.
     * 2. 강제로 변환해야 한다.
     * 3. 잘못된 캐스팅을 방지하기 위해서 instanceof 연산자를 사용할 수 있다.
     * instanceof 자동완성 강제변환된 코드를 적지 않아도 자동으로 완성 시켜줌
     * instance = 객체
     */
    
    // 업캐스팅 된 부모 타입의 자식 객체 (실제론 자식인데 타입만 부모인 업캐스팅 된 자식 객체)
    // 컴퓨터 타입인데 사실은 태블릿임.
    // 태블릿의 메소드를 부르지 못하는 상태임.
    Computer computer = new Tablet(); 
    
    //Tablet 타입으로 (강제)변환
    // ((Tablet)computer).screenTouch(); //tablet의 메소드 호출 가능한 상태
    // ((Tablet)computer).portable();

    
    // instanceof 이용한 다운캐스팅
    if(computer instanceof Tablet) { // 잘못된 캐스팅을 방지하기 위함 
      ((Tablet) computer).screenTouch(); // 강제 형 변환한 코드가 자동으로 만들어진다.
      ((Tablet) computer).portable();
    }
    
    // 잘못된 다운캐스팅 (Werable 타입으로 변환) - ClassCastExcepsion 예외 발생
    ((SmartWatch) computer).wearable();
    

  }

}
