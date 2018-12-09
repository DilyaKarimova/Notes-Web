package ru.itpark.notesweb.service;

import org.springframework.stereotype.Service;
import ru.itpark.notesweb.domain.Note;
import ru.itpark.notesweb.repository.NoteRepository;

import java.util.List;

@Service
public class NoteService {
    private final NoteRepository repository;

    public NoteService(NoteRepository repository) {
        this.repository = repository;
    }

    public void add(String name, String content){
        repository.add(new Note(name, content));
    }

    public List<Note> getAll(){
        return repository.getAll();
    }
}
