package rooms;

//public class rooms.Bedroom extends rooms.Room {
public class Bedroom extends Room {

    private int roomNumber;
    private BedRoomType bedRoomType;

    public Bedroom(int capacity, int roomNumber, BedRoomType bedRoomType){
        super(capacity);
        this.roomNumber = roomNumber;
        this.bedRoomType = bedRoomType;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public BedRoomType getBedroomType() {
        return this.bedRoomType;
    }

}
