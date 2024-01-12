package pkg03_constructor;

public class Person {
  
  // field
  private String name;
  
  //constructor
  public Person() {  // 디폴트 형식의 생성자(필드값을 가지지 않는 생성자)
  }

  public Person(String name) {
    super(); // Person의 부모는 없는데 왜 super...? 사실은 있지롱 (object class)
    this.name = name;
  }
  
  // method
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  
  

}
