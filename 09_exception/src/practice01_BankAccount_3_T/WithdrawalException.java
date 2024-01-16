package practice01_BankAccount_3_T;

public class WithdrawalException extends BankException {

  public WithdrawalException(String message, int errorCode) {
    super(message, errorCode);
  }
  
  public WithdrawalException(int errorCode) {
    super(errorCode);
  }

  

}
