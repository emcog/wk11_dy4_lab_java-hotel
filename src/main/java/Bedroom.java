public class Bedroom {

    private int roomNumber;
    private String bedroomType;

    public Bedroom(int roomNumber, String bedroomType){
        this.roomNumber = roomNumber;
        this.bedroomType = bedroomType;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public String getBedroomType() {
        return this.bedroomType;
    }
}
