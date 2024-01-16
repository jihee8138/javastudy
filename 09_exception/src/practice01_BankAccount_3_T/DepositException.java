package practice01_BankAccount_3_T;

// 에러코드를 부모클래스가 가지고 있기 때문에 필드가 필요 없다.
// 클래스에 오류나는 이유 : 
// 부모가 뱅크익셉션인데 부모 생성자의 디폴트가 없어 자동으로 호출되지 않기 때문 
// 생성자 만들어서 해결하기

public class DepositException extends BankException {

 // 필드가 없을 때 생성자 만드는 방법
 // -> 슈퍼클래스의 필드로 생성자 만들기 (Source 메뉴 이용)
  public DepositException(String message, int errorCode) {
    super(message, errorCode);
  }
  
  public DepositException(int errorCode) {
    super(errorCode);
  }
  
// getter & setter 도 존재할 필요 없음 
// 왜 ? 필드가 없기 때문에

}
