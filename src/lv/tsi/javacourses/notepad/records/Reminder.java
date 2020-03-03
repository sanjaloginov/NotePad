package lv.tsi.javacourses.notepad.records;

import lv.tsi.javacourses.notepad.Asker;
import lv.tsi.javacourses.notepad.StringDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reminder extends Alarm implements Expirable {
    private LocalDate date;
    private boolean dismissed;

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
    public boolean contains(String substr) {
        return super.contains(substr)
                || StringDateTime.dateToString(date).contains(substr);
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

    @Override
    public boolean isExpired() {
        if (dismissed) {
            return false;
        }
        var now = LocalDateTime.now();
        var dt = LocalDateTime.of(date, getTime());
        return now.isAfter(dt);
    }

    @Override
    public void dismiss() {
        dismissed = true;
    }
}
