package pkg08_custom_exception;

/*
 *  사용자 예외 클래스
 *  1. (java.lang.)Exception 클래스를 상속한다. (import 할 필요 X)
 *  2. 클래스명은 Exception 으로 끝나는 것이 좋다.
 */

public class MyException extends Exception {
  // Exception 에게 message 를 전달 -> Exception 이 Throwable 에게 전달 
  // -> Throwable 이 message 저장 -> 저장된 message 는 getMessage 로 호출
  
  // field
  private int errorCode;
  
  // constructor
  // 생성자에서 부모 클래스에게 값을 전달하는 방식은? 부모의 생성자를 부른다 super(메시지) 전달
  public MyException(String message, int errorCode) { // 예외 사유를 받아올 것, 에러 코드를 받아올 것
    super(message); // public Exception(String message) { } 생성자 호출
    this.errorCode = errorCode; 
  }

  // method
  public int getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(int errorCode) {
    this.errorCode = errorCode;
  }
  
  
  
  
  

}

//예외 메시지 관리를 넘어서 예외 코드 관리같은 추가관리를 하고 싶을 때
//데이터를 추가하는 용도로 예외 코드를 저장하고 관리할 수 있는 용도
