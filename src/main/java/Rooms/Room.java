package Rooms;

import Guest.Guest;

import java.util.ArrayList;

public abstract class Room {

    protected int capacity;
    protected ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }
    public void addGuestToRoom(Guest guest){
        this.guests.add(guest);
    }
    public void removeGuestFromRoom(Guest guest) {
        if (this.guests.contains(guest)) {
            this.guests.remove(guest);
        }
    }

    public int getTotalGuests(){
        return this.guests.size();
    }
    public void checkInGuestToRoom(Guest guest){
        if (this.capacity > getTotalGuests()){
            addGuestToRoom(guest);
        }
    }
}
