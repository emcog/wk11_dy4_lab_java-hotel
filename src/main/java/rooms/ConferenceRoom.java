package rooms;
import people.Guest;
import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;
    private ArrayList<Guest> guests;

//    constructor
    public ConferenceRoom(String name, int capacity) {
        super(capacity);

        this.guests = new ArrayList<Guest>();
        this.name = name;
    }

    public String getConferenceRoomName() {
        return this.name;
    }


}
