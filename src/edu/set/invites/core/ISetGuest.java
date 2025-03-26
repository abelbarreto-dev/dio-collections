package edu.set.invites.core;

public interface ISetGuest {
    void addGuest(String name, int inviteCode);
    void removeGuestByInviteCode(int inviteCode);
    int countGuests();
    void showGuests();
}
