// Exercise 5A
public class Room {
  String guestName;
  int roomNum, bedNum, rentDays;
  double rent;

  public Room (
    String guestName,
    int roomNum,
    int bedNum,
    int rentDays,
    double rent
  ) {
    this.guestName = guestName;
    this.roomNum = roomNum;
    this.bedNum = bedNum;
    this.rentDays = rentDays;
    this.rent = rent;
  }

  public String toString() {
    String m = "Guest's Name: "+ guestName +"\n"
              +"Room Number: "+ roomNum +"\n"
              +"Room Beds: "+ bedNum +"\n"
              +"Rate: "+ rent +"\n"
              +"Rented For: "+ rentDays;
    return m;
  }
}
