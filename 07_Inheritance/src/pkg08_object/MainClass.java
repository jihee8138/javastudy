package pkg08_object;

public class MainClass {

  public static void main(String[] args) {
 // Object 타입의 Book 객체
    Object obj = new Book("979-11-6224-187-5", "혼자 공부하는 자바");

 // Object 타입의 Book 객체를 Book 타입으로 캐스팅한 뒤 메소드 호출하기
    System.out.println(((Book) obj).getIsbn());
    System.out.println(((Book) obj).getTitle());
    
 // Object obj 와 내용이 동일한 Book 객체
    Book book = new Book("979-11-6224-187-5", "혼자 공부하는 자바");
    System.out.println(obj.equals(book)); // 객체 obj와 객체 book의 참조값이 동일하면 true 반환
                                          // 참조값을 비교하기 때문에 false가 나옴
    System.out.println(book.toString());  // 객체명@참조값 을 반환
    System.out.println(book);             // toString() 메소드 호출은 생략할 수 있다.
    System.out.println();
    
    ////////////////////////////////////////////////////////////////////////////////////////////
    
    Student student1 = new Student(10101, "고길동");
    Student student2 = new Student(10101, "고길동");
    
    System.out.println(student1.equals(student2));
    
    // 참조값으로 출력하지 않고 원하는 값으로 출력하기 위해서는 
    // student 클래스에서 object 클래스의 toString 메소드 오버라이드 해야함.
    System.out.println(student1);  //toString이 생략된 상태
    
    student1.addBook(new Book("979-11-6224-187-5", "혼자 공부하는 자바"));
    student1.addBook(new Book("979-11-6224-187-6", "혼자 공부하는 꽃꽂이"));
    student1.addBook(new Book("979-11-6224-187-7", "혼자 공부하는 피파"));
    student1.addBook(new Book("979-11-6224-187-8", "혼자 공부하는 수영"));
    student1.addBook(new Book("979-11-6224-187-9", "혼자 공부하는 조경"));
    
    for(Book b : student1.getBooks()) {
      if(b != null) {
        System.out.println(b);  // Book 클래스에  Object 클래스의 toString 메소드 오버라이드        
      }
    }
    
    student1.removeBook(new Book("979-11-6224-187-5", "혼자 공부하는 자바"));
    
    for(Book b : student1.getBooks()) {
      if(b != null) {
        System.out.println(b);  // Book 클래스에  Object 클래스의 toString 메소드 오버라이드        
      }
    }
    
    
    
    
    
    
    
    
  }

}
