import java.util.ArrayList;

public class Hotel {

    private String hotelName;
    private int setNumberOfBedRooms;
    private ArrayList<Bedroom> bedRooms;

    public Hotel(String hotelName, int setNumberOfBedRooms) {
        this.hotelName = hotelName;
        this.setNumberOfBedRooms = setNumberOfBedRooms;
        this.bedRooms = new ArrayList<Bedroom>();
    }

    public String getHotelName() {
        return this.hotelName;
    }

    public int getSetNumberOfBedRooms() {
        return this.setNumberOfBedRooms;
    }

    public int getBedroomCount(){
        return this.bedRooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        if (bedRooms.size() < setNumberOfBedRooms) {
            this.bedRooms.add(bedroom);
        }
    }
}

