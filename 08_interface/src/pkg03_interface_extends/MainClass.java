package pkg03_interface_extends;

public class MainClass {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Elec elec = new SmartPhone();
    elec.powerOn();
    ((SmartPhone) elec).game();
    ((SmartPhone) elec).call();
    
    System.out.println();
    
    
    Computer computer = new SmartPhone();
    computer.game();
    ((SmartPhone) elec).powerOn();
    ((SmartPhone) elec).call();
    
    System.out.println();
    
    Phone phone = new SmartPhone();
    phone.call();
    ((SmartPhone) elec).powerOn();
    ((SmartPhone) elec).game();
    
    System.out.println();
    
    SmartPhone smartPhone = new SmartPhone();
    smartPhone.powerOn();
    smartPhone.game();
    smartPhone.call();
    

  }

}
