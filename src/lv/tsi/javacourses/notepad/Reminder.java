package lv.tsi.javacourses.notepad;

public class Reminder extends Alarm {
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public void askInfo() {
        date = Asker.askString("Note date");
        super.askInfo();
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + getId() + " " +
                "date='" + date + '\'' + " " +
                "time='" + getTime() + '\'' + " " +
                "text='" + getText() + '\'' +
                '}';
    }
}
