package pkg05_marker_interface;

// 먹을 수 있는 음식

public class PineApple implements Food, Eatable {
  
  @Override
  public void eat() {
    System.out.println("파인애플을 먹는다.");
    
    
  }

}
