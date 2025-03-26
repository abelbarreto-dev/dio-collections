package edu.set.invites.core;

import edu.set.invites.model.Guest;

import java.util.HashSet;
import java.util.Set;

public class SetGuest implements ISetGuest {
    private final Set<Guest> guests;

    public SetGuest() {
        this.guests = new HashSet<Guest>();
    }

    public Set<Guest> getGuests() {
        return guests;
    }


    @Override
    public void addGuest(String name, int inviteCode) {
        var guest = new Guest(name, inviteCode);

        this.getGuests().add(guest);

        System.out.println("Guest added!");
    }

    @Override
    public void removeGuestByInviteCode(int inviteCode) {
        if (this.getGuests().isEmpty()) {
            System.out.println("Set is Empty!");
            return;
        }

        Set<Guest> foundGuests = new HashSet<Guest>();

        for (Guest guest : this.getGuests()) {
            if (guest.getInviteCode() == inviteCode) {
                foundGuests.add(guest);
            }
        }

        if (foundGuests.isEmpty()) {
            System.out.println("This guest wasn't found!");
            return;
        }

        this.getGuests().removeAll(foundGuests);
        System.out.println("Guest Removed!");
    }

    @Override
    public int countGuests() {
        return this.getGuests().size();
    }

    @Override
    public void showGuests() {
        this.getGuests().forEach(System.out::println);
    }
}
