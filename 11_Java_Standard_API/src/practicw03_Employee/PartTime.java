package practicw03_Employee;

public class PartTime extends Employee {
  
  // field
  private int hourPay;

  /**
   * @param empNo
   * @param name
   */
  public PartTime(int empNo, String name) {
    super(empNo, name);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param empNo
   * @param name
   * @param hourPay
   */
  public PartTime(int empNo, String name, int hourPay) {
    super(empNo, name);
    this.hourPay = hourPay;
  }

  public int getHourPay() {
    return hourPay;
  }

  public void setHourPay(int hourPay) {
    this.hourPay = hourPay;
  }
  
  @Override
  public void info() {
    super.info();
    System.out.println("시급 : " + hourPay);
  }

}
