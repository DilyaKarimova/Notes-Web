package ru.itpark.notesweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itpark.notesweb.service.NoteService;

@Controller
public class NoteController {
    private final NoteService service;

    public NoteController(NoteService service) {
        this.service = service;
    }

    @GetMapping
    public String index(Model model){
        model.addAttribute("items", service.getAll());
        return "index";
    }

    @PostMapping
    public String index(Model model, @RequestParam String name, @RequestParam String content){
        service.add(name, content);

        model.addAttribute("items", service.getAll());

        return "index";
    }
}
