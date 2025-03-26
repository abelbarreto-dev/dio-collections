package edu.set.invites.model;

public class Guest {
    private final String name;
    private final int inviteCode;

    public Guest(String name, int inviteCode) {
        this.name = name;
        this.inviteCode = inviteCode;
    }

    @Override
    public String toString() {
        return "Invite{" +
                "name='" + name + '\'' +
                ", inviteCode=" + inviteCode +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getInviteCode() {
        return inviteCode;
    }
}
