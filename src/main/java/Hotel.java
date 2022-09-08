import Guest.Guest;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;
import Rooms.Room;

import java.util.ArrayList;
import java.util.Arrays;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public int getTotalBedrooms(){
        return this.bedrooms.size();
    }

    public int getTotalConferenceRooms(){
        return this.conferenceRooms.size();
    }
//    public void bedroomCheckIn(Guest guest, Room room){
//        bedrooms.get(room);
//    }


    public void bedroomCheckIn(Bedroom bedroom, Guest guest){
        bedroom.checkInGuestToRoom(guest);
    }

    public void conferenceRoomCheckIn(ConferenceRoom conferenceRoom, Guest guest){
        conferenceRoom.checkInGuestToRoom(guest);
    }

}
