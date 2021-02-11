public class Bedroom {

    private int roomNumber;
    private BedRoomType bedRoomType;

    public Bedroom(int roomNumber, BedRoomType bedRoomType){
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
