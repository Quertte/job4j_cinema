package ru.job4j.cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.cinema.model.Session;
import ru.job4j.cinema.service.SessionService;

@Controller
public class IndexController {

    private final SessionService sessionService;

    public IndexController(SessionService sessionService) {
        this.sessionService = sessionService;
    }

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("films", sessionService.getAllSessions());
        model.addAttribute("rows", sessionService.amountRows());
        model.addAttribute("cells", sessionService.amountCells());
        return "index";
    }
}
