package lv.tsi.javacourses.notepad.records;

import lv.tsi.javacourses.notepad.Asker;
import lv.tsi.javacourses.notepad.StringDateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class Alarm extends Note implements Expirable {
    private LocalTime time;
    private LocalDate dismissedDate;

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public void askInfo() {
        time = Asker.askTime("Note time");
        super.askInfo();
    }

    @Override
    public boolean contains(String substr) {
        return super.contains(substr)
                || StringDateTime.timeToString(time).contains(substr);
    }

    @Override
    public String stringContent() {
        return super.stringContent() +
                " time='" + StringDateTime.timeToString(time) + '\'';
    }

    @Override
    protected String type() {
        return "Alarm";
    }

    @Override
    public boolean isExpired() {
        if ( dismissedDate != null && dismissedDate.equals(LocalDate.now())) {
            return false;
        }
        var now = LocalTime.now();
        return now.isAfter(time);
    }

    @Override
    public void dismiss() {
        dismissedDate = LocalDate.now();
    }
}
