package practice02_Watch;

public class Watch {
  
  private int hour; 
  private int minute;
  private int second;
  
  public Watch () {
  }

  /**
   * @param hour
   * @param minute
   * @param second
   */
  public Watch(int hour, int minute, int secoond) {
    super();
    this.hour = hour;
    this.minute = minute;
    this.second = secoond;
  }

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    this.minute = minute;
  }

  public int getSecoond() {
    return second;
  }

  public void setSecoond(int secoond) {
    this.second = secoond;
  }
  
  public void see() {
    System.out.printf("%02d:%02d:%02d", hour, minute, second);
  }

  public void addHour(int hour) {
    if(hour <= 0) {
      return;
    }
    this.hour += hour;
    this.hour %= 24; // 0 ~ 23 사이 값을 가지게 된다. (0시부터 23시)
  }
  
  public void addMinute(int minute) {
    if(minute <= 0) {
      return;
  }
    this.minute += minute;
    addHour(this.minute / 60);
    this.minute %= 60;
  }
  
  public void addSecond(int second) {
    if(second <= 0) {
      return;
  }
    this.second += second;
    addMinute(this.second / 60);
    this.second %= 60;
  }
 }  
