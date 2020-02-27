package lv.tsi.javacourses.notepad.records;

import lv.tsi.javacourses.notepad.Asker;

public class Bus extends PublicTransport {
    private String engineType;
    private String licensePlate;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public void askInfo() {
        super.askInfo();
        engineType = Asker.askString("Engine Type");
        licensePlate = Asker.askString("License Plate Number");
    }

    @Override
    public String stringContent() {
        return super.stringContent() +
                ", engineType=" + engineType + '\'' +
                ", licensePlate='" + licensePlate + '\'';
    }

    @Override
    protected String type() {
        return "Bus";
    }
}
