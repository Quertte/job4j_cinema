package ru.job4j.cinema.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Session {

    private int id;
    private String name;
    private List<Ticket> tickets = new ArrayList<>();
    private int ticketId = 1;

    public Session() {
    }

    public Session(int id, String name) {
        this.id = id;
        this.name = name;
        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 13; j++) {
                tickets.add(new Ticket(ticketId++, i, j, id));
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Session session = (Session) o;
        return id == session.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
