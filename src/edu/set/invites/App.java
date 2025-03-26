package edu.set.invites;

import edu.set.invites.core.ISetGuest;
import edu.set.invites.core.SetGuest;

public class App {
    public static void main(String[] args) {
        ISetGuest setGuest = new SetGuest();

        setGuest.addGuest("abel", 123);
        setGuest.addGuest("abel", 123);

        setGuest.showGuests();

        setGuest.removeGuestByInviteCode(123);

        setGuest.showGuests();

        setGuest.addGuest("brenda", 456);
        setGuest.addGuest("paulo", 741);
        setGuest.addGuest("maria", 925);

        setGuest.showGuests();

        setGuest.removeGuestByInviteCode(924);

        setGuest.removeGuestByInviteCode(925);

        setGuest.showGuests();
    }
}
