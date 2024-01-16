package practice01_BankAccount_3_T;

// 예외 클래스

public class BankException extends Exception {
  
  // field
  private int errorCode;
  
  // constructor
  public BankException(int errorCode) {
    super();
    this.errorCode = errorCode;
  }
  
  public BankException(String message, int errorCode) {
    super(message);
    this.errorCode = errorCode;
  }

  public int getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(int errorCode) {
    this.errorCode = errorCode;
  }
  
  

}
