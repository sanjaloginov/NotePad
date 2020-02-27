package lv.tsi.javacourses.notepad.records;

import lv.tsi.javacourses.notepad.Asker;

public class Trolleybus extends PublicTransport {
    private String generatorType;

    public String getGeneratorType() {
        return generatorType;
    }

    public void setGeneratorType(String generatorType) {
        this.generatorType = generatorType;
    }

    @Override
    public void askInfo() {
        super.askInfo();
        generatorType = Asker.askString("Generator type");
    }

    @Override
    public String stringContent() {
        return super.stringContent() +
                ", generatorType='" + generatorType + '\'';
    }

    @Override
    protected String type() {
        return "Trolleybus";
    }
}
