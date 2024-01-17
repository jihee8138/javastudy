package pkg01_wrapper_class;

public class MainClass {

  public static void main(String[] args) {
    
    // Auto Boxing (기본 타입 값 -> Wrapper 타입)
    Integer num = 10;
    
    // Auto Unboxing (Wrapper 타입 값 -> 기본 타입)
    int iNum = num;
    
    System.out.println(iNum);

  }

}


//Wrapper 클래스는 기본 데이터 타입(primitive data type)을 객체로 감싸는 역할을 합니다. 
// Wrapper 클래스들은 해당 기본 데이터 타입의 값을 갖는 객체를 생성하고 
// 다양한 유용한 메서드들을 제공합니다.

//Boolean - boolean
//Byte - byte
//Short - short
//Integer - int
//Long - long
//Float - float
//Double - double
//Character - char

//컬렉션 프레임워크: Wrapper 클래스를 사용하여 기본 데이터 타입을 컬렉션에 저장할 수 있습니다. 
// 예를 들어, ArrayList<Integer>와 같이 정수를 저장하는 리스트를 생성할 수 있습니다.

// 메서드 인자 전달: 메서드의 매개변수로 객체가 필요한 경우, 
// 기본 데이터 타입 대신 Wrapper 클래스를 사용할 수 있습니다.

//Null 허용: Wrapper 클래스는 객체이므로 null을 가질 수 있습니다. 
// 기본 데이터 타입은 null을 가질 수 없습니다.

//메서드 반환 값: 일부 메서드는 기본 데이터 타입 대신 Wrapper 클래스를 반환할 수 있습니다.

//Auto Boxing과 Auto Unboxing은 자바 5부터 도입된 기능으로, 
// 기본 데이터 타입과 Wrapper 클래스 간의 변환을 자동으로 처리해줍니다. 
// Auto Boxing은 기본 데이터 타입 값을 Wrapper 클래스로 자동으로 변환하고, 
// Auto Unboxing은 Wrapper 클래스의 값을 기본 데이터 타입으로 자동으로 변환합니다.