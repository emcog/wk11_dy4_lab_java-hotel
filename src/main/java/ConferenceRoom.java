import java.util.ArrayList;

public class ConferenceRoom extends Room{

    private String name;

//    constructor
    public ConferenceRoom(String name, int capacity) {
        super(capacity);
        this.name = name;
    }

    public String getConferenceRoomName() {
        return this.name;
    }
}
