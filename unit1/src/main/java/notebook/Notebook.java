package notebook;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Notebook {
    private Note[] notes;

    public Notebook() {
        this.notes = new Note[]{};
    }

    /**
     * Метод позволяет добавить запись
     *
     * @param note запись которую мы хотим сохранить
     */
    public void addNote(Note note) {
//        if (notes.length == 0) {
//            notes = new Note[]{note};
//        } else {
            Note[] newArray = Arrays.copyOf(notes, notes.length + 1);

            newArray[newArray.length - 1] = note;
            notes = newArray;
//        }
    }

    /**
     * Метод позволяет удалить запись
     *
     * @param indexOfNote индекс по которому запись удаляется
     */
    public void deleteNote(Integer indexOfNote) {
        if (indexOfNote > notes.length - 1) {
            throw new Error("noteNumber is out of notes bounds");
        } else {
            Note[] newArray = new Note[notes.length - 1];

            Integer index = 0;
            for (Integer i = 0; i < notes.length; i++) {
                if (indexOfNote == i) {
                    continue;
                }

                newArray[index] = notes[i];
                index++;
            }
            notes = newArray;
        }
    }

    /**
     * Метод позволяет редактировать запись
     *
     * @param indexOfNote индекс записи для редактирования
     * @param note        сама запись на которую нужно поменять
     */
    public void editNote(Integer indexOfNote, String note) {
        if (indexOfNote > notes.length) {
            new IndexOutOfBoundsException("File with index - " + indexOfNote +  " isn't exist");
        } else {
            notes[indexOfNote] = new Note(note);
        }
    }

    /**
     * Метод позволяет посмотреть все записи
     *
     * @return
     */
    public Note[] getNotes() {
        return notes;
    }


}
