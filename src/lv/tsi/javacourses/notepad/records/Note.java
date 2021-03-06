package lv.tsi.javacourses.notepad.records;

import lv.tsi.javacourses.notepad.Asker;

public class Note extends AbstractRecord {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void askInfo() {
        text = Asker.askString("Your note");
    }

    @Override
    public boolean contains(String substr) {
        var tmp = substr.toLowerCase();
        return super.contains(substr)
                || text.toLowerCase().contains(tmp);
    }

    @Override
    public String stringContent() {
        return super.stringContent() +
                " text='" + text + '\'';
    }

    @Override
    protected String type() {
        return "Note";
    }
}
