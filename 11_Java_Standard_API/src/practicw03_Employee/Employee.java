package practicw03_Employee;

public class Employee {
  
  // field
  private int empNo;
  private String name;
  
  // concstructor
  public Employee() {
    // TODO Auto-generated constructor stub
  }

  public Employee(int empNo, String name) {
    super();
    this.empNo = empNo;
    this.name = name;
  }
  
  public int getEmpNo() {
    return empNo;
  }

  public void setEmpNo(int empNo) {
    this.empNo = empNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public void info() {
    System.out.println("사원번호 : " + empNo);
    System.out.println("사원명 : " + name);
  }
  
  

}
