package ru.gb.Java_Spring_HW11.Repository;

import ru.gb.Java_Spring_HW11.Model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> getNoteByStatus(Note.Status status);
}