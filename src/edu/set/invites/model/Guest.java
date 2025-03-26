package edu.set.invites.model;

import java.util.Objects;

public class Guest {
    private final String name;
    private final int inviteCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest guest)) return false;
        return this.getInviteCode() == guest.getInviteCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInviteCode());
    }

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
