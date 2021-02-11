import java.util.ArrayList;

public abstract class Room {

    private int capacity;

//    Came unstuck with this guy!
//    private ArrayList<Guest> guests;
//    TODO make code DRY with Generics https://discourse.processing.org/t/using-inheritance-with-arraylist/4246

    public Room(int capacity) {

       this.capacity = capacity;
//       this.guests = new ArrayList<Guest>();

    }


    public int getCapacity(){
        return this.capacity;
    }
}
