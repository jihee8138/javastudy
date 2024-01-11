package practice05_Bakery;

public class Bakery {
  
  public final static int PRICE = 500; // 빵 가격
  private int count; // 빵의 갯수
  private int money; // 돈
  
  // constructor
  public Bakery() {
    // TODO Auto-generated constructor stub
  }

  /**
   * @param count
   * @param money
   */
  public Bakery(int count, int money) {
    super();
    this.count = count;
    this.money = money;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }
  
  // 전달 받는 인자 : 돈, 주문(구매할 빵 개수)
  // 되돌려 줄 반환 : 잔돈, 구매한 빵 개수 ->BreadChange 객체
  // 반환할 인자가 2개이기 때문에 객체화 시켜 하나의 객체에 잔돈과 빵을 집어넣어 반환하기
  
  // 판매 구현 method
  public BreadChange sell (int money, int count) {
    
    // 판매가 불가능한 상황
    
    // 판매할 빵이 없다. (재료소진)
    if(this.count < count) {  // 판매 가능한 빵이 주문한 빵보다 적은 경우
      System.out.println("빵이 부족하다");
      return null;  // 구매자에게 줄 게 없다. 빵과 잔돈 모두 돌려주지 않는다.
    }
    
    // 잔돈이 부족하다. (구매자에게 돌려줄 잔돈이 부족하다.)
    if(this.money < money - (count * PRICE)) {  // 내 잔돈이 돌려줘야할 잔돈보다 적은 경우 
      System.out.println("잔돈이 부족하다");    // 구매자의 돈에서 갯수와 가격을 곱한 값을 뺀다.
      return null;
    }
    
    // 고객이 낸 돈이 부족하다.
    if(count * PRICE > money) {  // 고객 돈이 빵 갯수와 가격을 곱한 가격보다 적은 경우
      System.out.println("돈 더 주세요");
      return null;
    }
    
    // 판매 처리하기
    this.money += count * PRICE;  // 돈은 늘리고
    this.count -= count;  // 갯수는 줄이고
    
    // 반환
    return new BreadChange(count, money - (count * PRICE)); // 무엇을 ? 빵과 잔돈을
    // count = 고객이 주문한 빵 갯수
    // money - (count * PRICE) = 잔돈
  }

  
}
