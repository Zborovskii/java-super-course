package notebook;

public class Main {

    public static void main(String[] args) {
        //Task - Notebook

        Notebook notebook = new Notebook();
        Note note1 = new Note("first note");
        Note note2 = new Note("second note");
        Note note3 = new Note("third note");

        notebook.addNote(note1);
        notebook.addNote(note2);
        notebook.addNote(note3);

        notebook.deleteNote(2);
        notebook.editNote(1, "another Note");
        notebook.getNotes();

    }
}
