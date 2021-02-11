package rooms;

public enum BedRoomType {
    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3),
    FAMILY(4);

    //    final because hard coded in, can't or won't be changed.
    private final int value;

    //    in effect a constructor
    BedRoomType(int value){
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
