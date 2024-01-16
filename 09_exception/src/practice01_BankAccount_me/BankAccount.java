package practice01_BankAccount_me;

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
  
  public void deposit(long money) {
    
    try {
      if(money <= 0) {
        throw new Exception();
      }
    } catch (Exception e) {
      System.out.println(money + "원 입금 불가"); 
    }
    
    balance += money;
  }
  
  public long withdrawal(long money) {
    
    try {
      if(money <= 0) {
        throw new Exception();
      }
    } catch (Exception e) {
      System.out.println(money + "원 출금 불가");
    }
    
    try {
      if(money > balance) {
        throw new Exception();
      }
      
    } catch (Exception e) {
      System.out.println("잔액 부족");
    }

    balance -= money;
    return money;
  }

  public void transfer(BankAccount account, long money) {
    
    // 내 통장에서 출금 -> 출금된 금액이 반환 -> 네 통장에 입금
    
    // 내 통장에서 출금
    // long a = withdrawal(money);
    // long b = this.withdrawal(money);
    
    // 네 통장에 입금
    // account.deposit(a);
    
    account.deposit(withdrawal(money));
    
  }
}

