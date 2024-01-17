package practice03_Club;

public class MainClass {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Club club = new Club();
    
    club.enterClub(new Person("1"));
    club.enterClub(new Person("2"));
    club.enterClub(new Person("3"));
    club.enterClub(new Person("3"));
    club.enterClub(new Person("3"));
    club.enterClub(new Person("4"));
    club.enterClub(new Person("5"));
    club.enterClub(new Person("6"));
    club.enterClub(new Person("6"));
    
    club.leaveClub(new Person("p1"));
    club.leaveClub(new Person("p2"));
    club.leaveClub(new Person("p3"));
    club.leaveClub(new Person("p3"));
    club.leaveClub(new Person("p3"));
    club.leaveClub(new Person("p4"));
    club.leaveClub(new Person("p5"));
    
  }

}

