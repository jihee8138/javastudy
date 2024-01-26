package pkg01_lambda_expr;

public class MainClass {

  public static void main(String[] args) {
    
    GasStation station = new GasStation();
    station.setTotalOil(1000);  // 기름을 1000L 가지고 있고
    station.setChargePerLiter(1500);  // 리터당 1500원
    
    station.sellOil("모닝", 50);
    station.sellOil("소나타", 100);
    
    System.out.println("totalOil : " + station.getTotalOil());
    System.out.println("earning : " + station.getEarning());
    
    

  }

}
