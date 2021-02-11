import java.util.ArrayList;

public class Hotel {

    private String hotelName;
    private int setNumberOfBedRooms;
    private int setNumberOfConferenceRooms;
    private ArrayList<Bedroom> bedRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String hotelName, int setNumberOfBedRooms, int setNumberOfConferenceRooms) {
        this.hotelName = hotelName;

        this.setNumberOfBedRooms = setNumberOfBedRooms;
        this.bedRooms = new ArrayList<Bedroom>();

        this.setNumberOfConferenceRooms = setNumberOfConferenceRooms;
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
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

    public int getSetNumberOfConferenceRooms() {
        return setNumberOfConferenceRooms;
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        if (conferenceRooms.size() < setNumberOfConferenceRooms) {
            this.conferenceRooms.add(conferenceRoom);
        }
    }

    public int getConferenceRoomCount(){
        return this.conferenceRooms.size();
    }
}

