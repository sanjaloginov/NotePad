package lv.tsi.javacourses.notepad;

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
    public String toString() {
        return "Trolleybus{" +
                "id=" + getId() +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", model='" + getModel() + '\'' +
                ", vin='" + getVin() + '\'' +
                ", year=" + getYear() +
                ", generatorType='" + generatorType + '\'' +
                ", length='" + getLength() + '\'' +
                ", bortNumber='" + getBortNumber() + '\'' +
                ", route='" + getRoute() + '\'' +
                '}';
    }
}
