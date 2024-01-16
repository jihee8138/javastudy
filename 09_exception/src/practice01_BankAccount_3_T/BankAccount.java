package practice01_BankAccount_3_T;

public class BankAccount {

//field
  private String accNo; // 계좌번호
  private long balance; // 잔액
  
  // constructor
  public BankAccount () {
  }


  /**
   * @param accNo
   * @param balance
   */
  public BankAccount(String accNo, long balance) {
    super();
    this.accNo = accNo;
    this.balance = balance;
  }
  
  //method
  public String getAccNo() {
    return accNo;
  }

  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }
  
  
  // 메소드 안에서 트라이캐치 하기
  // 메소드 호출부로 트라이캐치하기
  
  
  public void deposit(long money) throws RuntimeException { // deposit 호출하는 곳
    
    try {
      if(money <= 0) {
        // catch 블록으로 던진다.
        throw new DepositException(1001);
      }
      
      balance += money;
      
    } catch (DepositException e) { // 예외 사유, 예외 원인 객체가 들어있다.
      // DepositException e : 예외 원인 객체(cause)
      
      // deposit 메소드를 호출한 곳으로 던진다.
      throw new RuntimeException(money + "원 입금불가", e); // RuntimeException(메시지, 예외 원인객체)
      
    }
    
  }
  
  public long withdrawal(long money) throws RuntimeException {
    
    try {
      
      if(money <= 0) {
        throw new WithdrawalException(2001);
      }
      if(money > balance) {
        throw new WithdrawalException(2002);
      }
      
      balance -= money;
      
    } catch (WithdrawalException e) {  // 예외 원인 객체
        
      String message = null;
        switch(e.getErrorCode()) {
        case 2001 : 
          message = money + "원 출금불가";
        break;
        case 2002 :
          message = "잔액부족";
        break;
        }
        
        throw new RuntimeException(message, e);
    }
    
    return money;
  }

  public void transfer(BankAccount account, long money) throws RuntimeException {
    
    // 내 통장에서 출금 -> 출금된 금액이 반환 -> 네 통장에 입금
    
    // 내 통장에서 출금
    // long a = withdrawal(money);
    // long b = this.withdrawal(money);
    
    // 네 통장에 입금
    // account.deposit(a);
    
    
    // 1. 살신성인해서 트라이캐치하기
    // 2. 나도 시렁 다시 던져잇
    account.deposit(withdrawal(money));
    
  }
}