package ru.job4j.cinema.persistance;

import org.springframework.stereotype.Repository;
import ru.job4j.cinema.model.Session;
import ru.job4j.cinema.model.Ticket;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class SessionStore {

    private final Map<Integer, Session> sessions = new ConcurrentHashMap<>();
    private final AtomicInteger id = new AtomicInteger();

    private final List<Integer> rows = Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
    private final List<Integer> cells = Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

    public SessionStore() {
        sessions.put(1, new Session(1, "Мстители"));
        sessions.put(2, new Session(2, "Человек-паук"));
        sessions.put(3, new Session(3, "Сплит"));
    }

    public List<Integer> amountRows() {
        return new ArrayList<>(rows);
    }

    public List<Integer> amountCells() {
        return new ArrayList<>(cells);
    }

    public List<Session> getAllSessions() {
        return new ArrayList<>(sessions.values());
    }
}
