package lv.tsi.javacourses.notepad.records;

import lv.tsi.javacourses.notepad.Asker;
import lv.tsi.javacourses.notepad.StringDateTime;

import java.time.LocalDate;

public class Reminder extends Alarm {
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public void askInfo() {
        date = Asker.askDate("Note date");
        super.askInfo();
    }

    @Override
    public String stringContent() {
        return super.stringContent() +
                " date='" + StringDateTime.dateToString(date) + '\'';
    }

    @Override
    protected String type() {
        return "Reminder";
    }
}
