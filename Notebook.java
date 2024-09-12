package main;

import java.util.ArrayList;

public class Notebook {
    private ArrayList<Note> notes;
    private Note currentNote;
    private String filename;

    public Notebook() {
        notes = new ArrayList<>();
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }

    public Note getCurrentNote() {
        return currentNote;
    }

    public void setCurrentNote(Note currentNote) {
        this.currentNote = currentNote;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    public void clearNote() {
        // make sure we don't add a "null" note to the notes list
        if(currentNote != null) {
            notes.add(currentNote);
        }
        currentNote = new Note();
    }

    public ArrayList<Note> searchNotes(String query) {
        ArrayList<Note> results = new ArrayList<>();
        // loop through every note, and check if that note's content contains the query
        // ...
        for (Note note: notes) {
            if (note.getContent() != null && note.getContent().contains(query)) {
                results.add(note);
                System.out.println(note);
            }
        }
        return results;
    }
}