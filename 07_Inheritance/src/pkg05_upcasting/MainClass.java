package pkg05_upcasting;

public class MainClass {

  public static void main(String[] args) {
    
    /*
     * 업캐스팅 (캐스팅 : 강제 형 변환 (타입을 바꾸는 것))
     * 1. 자식 타입의 객체를 부모 타입으로 바꿀 수 있다.
     * 2. 자동으로 변환된다. (별도의 코드가 필요하지 않음)
     * 3. 부모가 가진 멤버만 호출할 수 있다.
     */
    
    // 부모 타입 선언
    Computer computer; 
    
    // 자식 타입 생성
    // 태블릿을 컴퓨터 타입에 생성했는데 오류가 안난다. 자동변환했기 때문에
    // 태블릿은 컴퓨터의 타입이 됨. (부모 타입이 됨.)
    // 타입은 부모인데 실제론 자식인 아수라백작같은 애매한 자식
    // 이게 업캐스팅된 부모타입의 객체
    computer = new Tablet();
    
    // 부모 타입으로 변환되면 부모의 메소드만 호출할 수 있다.
    computer.internet();
    computer.game();
  }

}
