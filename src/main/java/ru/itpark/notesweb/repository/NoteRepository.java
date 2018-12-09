package ru.itpark.notesweb.repository;

import org.springframework.stereotype.Repository;
import ru.itpark.notesweb.domain.Note;

import java.util.ArrayList;
import java.util.List;

@Repository
public class NoteRepository {
    private final List<Note> items = new ArrayList<>();

    public void add(Note item){
        this.items.add(item);
    }

    public List<Note> getAll() {
        return items;
    }

}
