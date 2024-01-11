package practice05_Bakery;

public class Customer {
  
  // field
  private int money;
  private int count;
  
  // constructor
  public Customer() {
    // TODO Auto-generated constructor stub
  }

  // 생성자 만들기
  /**
   * @param money
   * @param count
   */
  public Customer(int money, int count) {
    super();
    this.money = money;
    this.count = count;
  }

  //method
  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
  
  // 구매
  // 인자 : 구매할 가게, 구매할 빵 개수, 구매할 때 낼 돈
  // 반환 : 없음(구매행위가 끝났으므로 고객이 가게에게 줘야할 것은 없음.) 
  
  public void buy(Bakery bakery, int count, int money) {
    
    // 구매가 불가능한 상황 
    // (붕어빵 집에서 판매를 못 하기때문에 구매가 불가능하다는 상황은 고려하지 않는다.)
    // 이미 bakery class에서 구현했기 때문에
    
    // 가진 돈이 부족하다.
    if(this.money < money) {
      System.out.println("가진 돈이 부족합니다.");
      return;
    }
    
    
    // 구매 (곧 bakery의 판매를 의미한다.)
    BreadChange breadChange = null; // 스코프 조정 (BreadChange가 밖에 있어야 한다.)
    if(bakery != null) {
      breadChange = bakery.sell(money, count);// 빵집의 판매 갯수와 돈의 정보를 가져온다.
    }
   
    // 구매 결과 처리
    // 구매가 실패했을 때 breadChange는 null값을 반환하기 때문에 if문을 사용하여 null값이 오지 못하게 함.
    if(breadChange != null) {
      count += breadChange.getBread();
      money += breadChange.getChange();
      this.money -= money; // 구매할 때마다 내가 가지고 있는 돈이 줄어든다.
      
    }
    
  }
  
}
