import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom loveShack;
    ConferenceRoom iggyHall;
    Guest iggy;

    @Before
    public void before(){
        hotel = new Hotel("California", 6, 1);
        loveShack = new Bedroom(1, BedRoomType.TRIPLE);
        iggyHall = new ConferenceRoom("Iggy Hall", 20);
    }

    @Test
    public void hotelHasName(){
        assertEquals("California", hotel.getHotelName());
    }

    @Test
    public void hotelCanHaveBedrooms(){
        assertEquals(6, hotel.getSetNumberOfBedRooms());
    }

    @Test
    public void hotelCanAddABedroom(){
        hotel.addBedroom(loveShack);
        assertEquals(1, hotel.getBedroomCount());
    }

    @Test
    public void hotelCanNotExceedSetNumberOfBedrooms(){
            hotel.addBedroom(loveShack);
            hotel.addBedroom(loveShack);
            hotel.addBedroom(loveShack);
            hotel.addBedroom(loveShack);
            hotel.addBedroom(loveShack);
            hotel.addBedroom(loveShack);
            hotel.addBedroom(loveShack);



            assertEquals(6, hotel.getBedroomCount());
    }

    @Test
    public void hotelCanHaveConferenceRoom(){
        assertEquals(1, hotel.getSetNumberOfConferenceRooms());
    }

    @Test
    public void hotelCanAddConferenceRoom(){
        hotel.addConferenceRoom(iggyHall);
        assertEquals(1, hotel.getConferenceRoomCount());
    }

    @Test
    public void hotelCanNotExceedSetNumberOfConferenceRooms(){
        hotel.addConferenceRoom(iggyHall);
        hotel.addConferenceRoom(iggyHall);
        assertEquals(1, hotel.getConferenceRoomCount());
    }

    @Test
    public void hotelCanCheckGuestIn(){
        hotel.addGuest(iggy);
        assertEquals(1, hotel.getGuestCount());

    }

    @Test
    public void hotelCanCheckGuestOut(){
        hotel.removeGuest(iggy);
        hotel.addGuest(iggy);
        assertEquals(1, hotel.getGuestCount());

    }

    @Test
    public void hotelCanAssignGuestToRoom(){

    }
}