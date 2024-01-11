package practice04_Car;

public class MainClass {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
  
    Driver driver1 = new Driver("elsa", 5);
    System.out.println(driver1.isBestDriver());
    
    Driver driver2 = new Driver();
    driver2.setName("elsa");
    driver2.setCareer(20);
    System.out.println(driver2.isBestDriver());
    
    
    Car car = new Car(driver2, 0, 100); // 사람(사람을 빼겠다 = null 넣기), 현재속도, 기름량
    car.enginStart();
    car.accelerator(5);
    car.brake(50);
    

  }

}
