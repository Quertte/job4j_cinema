package ru.job4j.cinema.service;

import org.springframework.stereotype.Service;
import ru.job4j.cinema.model.Session;
import ru.job4j.cinema.persistance.SessionStore;

import java.util.ArrayList;
import java.util.List;

@Service
public class SessionService {

    private final SessionStore sessionStore;

    public SessionService(SessionStore sessionStore) {
        this.sessionStore = sessionStore;
    }

    public List<Integer> amountRows() {
        return sessionStore.amountRows();
    }

    public List<Integer> amountCells() {
        return sessionStore.amountCells();
    }

    public List<Session> getAllSessions() {
        return sessionStore.getAllSessions();
    }
}
