package lv.tsi.javacourses.notepad.records;

public interface Expirable {
    boolean isExpired();

    void dismiss();
}
