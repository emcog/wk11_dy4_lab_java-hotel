package rooms;
import people.Guest;
import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {

       this.capacity = capacity;
       this.guests = new ArrayList<Guest>();

    }


    public int getCapacity(){
        return this.capacity;
    }

    public int getGuestCount(){
        return this.guests.size();
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }

}
