//public class Bedroom extends Room {
public class Bedroom {

    private int roomNumber;
    private BedRoomType bedRoomType;

    public Bedroom(int roomNumber, BedRoomType bedRoomType){
        this.roomNumber = roomNumber;
        this.bedRoomType = bedRoomType;
//        //  TODO super list & overide capacity with enum
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public BedRoomType getBedroomType() {
        return this.bedRoomType;
    }
}
