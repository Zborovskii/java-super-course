package notebook;

public class Note {
    private String name;

    public Note(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "notebook.Note{" +
                "name='" + name + '\'' +
                '}';
    }
}
