package pkg03_constructor;

/*
 * 자식 클래스의 생성자
 * 1. 반드시!!!! 부모 클래스를 가장 먼저 생성해야 한다.
 *      (부모가 태어나지 않았는데 자식이 존재할 수 있냐?
 *      자식이 메모리에 할당될 때 부모부터 먼저 만들어져야 한다.
 *      student 객체를 만들기 전에 person 먼저 만들어야 한다.)
 *    -> 부모 클래스의 생성자를 호출해야 한다.
 * 2. 부모 클래스의 생성자를 호출하지 않는 경우 JVM이 부모 클래스의 디폴트 생성자를 자동으로 호출한다.
 *    (JAVA가 알아서 디폴트 생성자를 호출)
 * 3. 부모 클래스에 디폴트 형식의 생성자가 없는 경우에는 개발자가 직접 부모 클래스의 생성자를 호출해야 한다.
 * 4. 부모 클래스의 생성자를 호출하는 방식 = super()
 *    자식 클래스에서 부모 클래스의 생성자를 호출할 때 super로 호출
 *    우리가 엄마, 아빠를 엄마, 아빠라고 부르지 이름으로 부르냐?
 *    
 */

// 학생은 사람이다.
// 부모 : person / 자식 : student
public class Student extends Person {
  
  //field
  private String school;
  
  //constructor
  public Student() {  
    super(null); // Person(null)
  }
  
  public Student(String name) {
    super(name); // super = Person / 상속관계가 아니였다면 Person(name)으로 호출
  }
  
  public Student(String name, String school) {
    super(name); // 반드시 super의 호출을 가장 먼저 할 것
    this.school = school;
    // super(name); <- 여기에 쓰면 오류나는 이유? 순서가 잘못되어있기 때문
  }

  // method
  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }
  
  

}
