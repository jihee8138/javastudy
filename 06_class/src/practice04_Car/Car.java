package practice04_Car;

public class Car {
  
  //field
  /*
   * 스택틱 값으로 필드를 만들 때는 통상 공개한다.
   * 보통 값이 바뀌지 않기 때문에
   */
  private Driver driver;
  private int currSpeed;  // 현재 자동차의 속도
  private int fuel;
  public final static int MAX_SPEED = 100;  //final과 static의 순서는 상관 없음.


  // constructor
  public Car () {
    
  }

  public Car(Driver driver, int currSpeed, int fuel) {
    super();
    this.driver = driver;
    this.currSpeed = currSpeed;
    this.fuel = fuel;
  }
  
  //static은 클래스로 호출할 것 !!!!!!!!!!!!!!!!!
  
  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public int getCurrSpeed() {
    return currSpeed;
  }

  public void setCurrSpeed(int currSpeed) {
    this.currSpeed = currSpeed;
  }

  public int getFuel() {
    return fuel;
  }

  public void setFuel(int fuel) {
    this.fuel = fuel;
  }
  
  public void enginStart() {  //시동 실패와 성공의 함수
    if(driver == null || fuel == 0) { // 만약 운전자가 없거나 기름이 0일 경우
      System.out.println("시동 실패"); // 시동 실패
    } else { // 아니면
      System.out.println("시동 성공"); // 시동 성공
    }   
  }
  
  // 1초당 n씩 속도가 증가하는 accelerator (n : bestDriver는 10, 아니면 5)
  // 1초당 1씩 연료가 줄어드는 accelerator
  public void accelerator(int pushTime) {
    
    if(currSpeed == MAX_SPEED) { // 현재 속도가 최고 속도인 경우
      System.out.println("이미 최고 속도입니다.");
      return;
    }
    if(fuel == 0) { // 기름이 없는 경우
      System.out.println("연료가 없습니다.");
      return;
    }
    if(pushTime <= 0) { // 악셀 밟는 시간이 0보다 작은 경우
      System.out.println("accelerator를 잘 밟으세요.");
      return;
    }
    
    /*  
        ? = if / 10 : 5 = 10 아니면 5
        driver.isBestDriver() = 조건
        만약(if) driver.isBestDriver()가 참(true)이면 n = 10
        아니면(else), driver.isBestDriver()가 거짓(false)이라면, n = 5
    */ 
    int n = driver.isBestDriver() ? 10 : 5; // n 변수 선언 / 필드 driver, 메서드 isBestDriver 호출
    currSpeed += (pushTime * n); // 아무리 악셀을 오래 밟아도 맥스 스피드까지만 속도한정을 주겠다.
    if(currSpeed > MAX_SPEED) { // 만약 현재 속도가 맥스 스피드를 넘어설 경우
      currSpeed = MAX_SPEED; // 현재 속도는 맥스 스피드와 같다.
    }
    currSpeed = Math.min(currSpeed, MAX_SPEED); // 현재 스피드와 맥스 스피드 중 작은 값을 쓰겠다. (결국 맥스 스피드만 쓰겠다.)
    
    fuel -= pushTime; 
    fuel = Math.max(fuel, 0); // 기름은 현재 기름과 0중에 가장 큰 값을 쓰겠다. 결국 기름은 현재기름값만 쓰겠다.
    
    System.out.println("현재 연료량 :" + fuel + ", 현재 속도 : " + currSpeed); // 현재 연료량과 속도 알려줌
  }
  
   // 1초당 1씩 속도가 줄어드는 brake
  public void brake(int pushTime) {
    
    if(currSpeed == 0) { // 현재 속도가 0일 경우
      System.out.println("이미 멈춰있습니다.");
      return;
    }
    if(pushTime <= 0) { // 브레이크를 밟는 시간이 0보다 작은 경우
      System.out.println("brake를 잘 밟으세요.");
      return;
  }
  
  currSpeed -= (pushTime * 10); // 현재 속도는 밟는 시간 * 10
  currSpeed = Math.max(currSpeed, 0); // 현재 속도와 0 중에 더 큰 값을 쓰겠다. 결국 현재 속도값만 쓰겠다.
  
  System.out.println("현재 연료량 :" + fuel + ", 현재 속도 : " + currSpeed); 
  }
}  
  
