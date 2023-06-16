// Exercise 5B & C
public class Hotel {
  String hotel;
  Room[] theRooms;
  int roomsRented = 0;

  public Hotel(
    String hotel,
    int numRooms
  ) {
    this.hotel = hotel;
    this.theRooms = new Room[numRooms];
  }

  public double getTotalRentalSales() {
    double s = 0;
    for (int i = 0; i < roomsRented; i++) {
      s += theRooms[i].rent * theRooms[i].rentDays;
    }
    return s;
  }

  public double getAvgDays() {
    double s = 0;
    for (int i = 0; 0 < roomsRented; i++) {
      s += theRooms[i].rentDays;
    }
    return s / roomsRented;
  }

  public void printRentalList() {
    for (int i = 0; i < roomsRented; i++) {
      System.out.println(theRooms[i]);
    }
  }

  public void addReservation(Room a) {
    if (roomsRented < theRooms.length) {
      theRooms[roomsRented] = a;
      roomsRented++;
    } else System.out.println("Can not add more rooms");
  }

  public void findReservation(int n) {
    boolean flag = false;
    int x =- 1;
    for (int i = 0; i < roomsRented && !flag ; i++) {
      if(theRooms[i].roomNum == n) {
        flag = true;
        x = i;
      }
    }
    if(flag) {
      System.out.println("Found reservation for room number: "+ n + "\n"
      +"Room information:"+"\n"+theRooms[x]);
    } else System.out.println("Could not find reservation for this Room number: "+n);
  }

  public static void main(String[] args) {
    Hotel h = new Hotel("Montage",100);
    Room r1 = new Room("Blake", 123, 1, 123.50, 5);
    Room r2 = new Room("Smith", 222, 2, 144.50, 4);
    Room r3 = new Room("Joe", 352, 2, 155, 7);
    Room r4 = new Room("Jane", 333, 1, 140, 5);
    h.addReservation(r1);
    h.addReservation(r2);
    h.addReservation(r3);
    h.addReservation(r4);
    h.printRentalList();
    System.out.println("Average days rented out is: "+h.getAvgDays());
    System.out.println("Total rental income is: "+h.getTotalRentalSales());
    h.findReservation(222);
    h.findReservation(200);
  }
}
