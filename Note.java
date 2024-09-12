package main;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Note {
    private LocalDateTime noteTime;
    private String content;
    private UniversityClass universityClass;
    private ArrayList<Link> links;

    public LocalDateTime getNoteTime() {
        return noteTime;
    }

    public void setNoteTime(LocalDateTime noteTime) {
        this.noteTime = noteTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public UniversityClass getUniversityClass() {
        return universityClass;
    }

    public void setUniversityClass(UniversityClass universityClass) {
        this.universityClass = universityClass;
    }

    public ArrayList<Link> getLinks() {
        return links;
    }

    public void setLinks(ArrayList<Link> links) {
        this.links = links;
    }

    public void assignUniversityClass(ArrayList<UniversityClass> universityClasses) {
        for (UniversityClass uc : universityClasses) {
            if(uc.dateTimeMatches(noteTime)){
                universityClass = uc;
                break;
            }
        }

    }

    public void parseContent() {

    }

}
