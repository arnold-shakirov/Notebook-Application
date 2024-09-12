package main;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

        public static void main(String args[]) {

            Scanner in = new Scanner(System.in);

            UniversityClass math = new UniversityClass();
            UniversityClass science = new UniversityClass();
            UniversityClass writing = new UniversityClass();

            math.setName("Math");
            science.setName("Science");
            writing.setName("Writing");

            math.addClassDayAndTime("Wednesday", LocalTime.parse("11:00:00"), LocalTime.parse("11:50:00"));
            science.addClassDayAndTime("Wednesday", LocalTime.parse("12:00:00"), LocalTime.parse("12:50:00"));
            writing.addClassDayAndTime("Wednesday", LocalTime.parse("13:00:00"), LocalTime.parse("13:50:00"));

            //make array list of your classes from notebook class, add classes to list
            ArrayList<UniversityClass> classes = new ArrayList<>();
            classes.add(math);
            classes.add(science);
            classes.add(writing);

            Notebook notebook = new Notebook();

            // initialize the notebook
            notebook.clearNote();

            while (true) {
                System.out.println("Please type your note:");
                String noteText = in.nextLine();
                // put the note text in the note's content
                notebook.getCurrentNote().setContent(noteText);
                // set note's date time to the current local date time
                LocalDateTime time = LocalDateTime.now();
                notebook.getCurrentNote().setNoteTime(time);
                // tell note to assign its university class
                notebook.getCurrentNote().assignUniversityClass(classes);
                // clear the note so the next line is in a new note
                notebook.clearNote();

                // show all notes
                System.out.println("Your notes:");
                ArrayList<Note> notes = notebook.getNotes();
                int i = 1;
                for(Note n : notes) {
                    System.out.println("#" + i);
                    i = i + 1;
                    String s = n.getContent();
                    System.out.println(s);
                    LocalDateTime nt = n.getNoteTime();
                    System.out.println(nt);

                    // show which class the note belongs to?
                    UniversityClass c = n.getUniversityClass();
                    if(c != null) {
                        System.out.println(c.getName());
                    } else {
                        System.out.println("No class assigned to this note.");
                    }
                }

                System.out.println("Do you wish to delete a note? If yes, type a #, if no, type -1");
                System.out.print("Answer: ");
                int delete_answer = in.nextInt();
                in.nextLine();
                if(delete_answer != -1) {
                    // TODO: do the delete
                    // To do so, update the print note code above to show a # for each note.
                    // If the user types a bad # (no note with that number), ignore it.
                    // Look up ArrayList documentation for how to delete from it.
                    if(delete_answer >= 0 && delete_answer <= notes.size()) {
                        notes.remove(delete_answer - 1);
                    }
                }
            }
        }
    }




