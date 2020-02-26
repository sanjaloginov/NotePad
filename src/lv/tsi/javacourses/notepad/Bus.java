package lv.tsi.javacourses.notepad;

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
    public String toString() {
        return "Bus{" +
                "id=" + getId() +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", model='" + getModel() + '\'' +
                ", vin='" + getVin() + '\'' +
                ", year=" + getYear() +
                ", engineType=" + engineType + '\'' +
                ", length='" + getLength() + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", bortNumber='" + getBortNumber() + '\'' +
                ", route='" + getRoute() + '\'' +
                '}';
    }
}
