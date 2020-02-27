package lv.tsi.javacourses.notepad.records;

import lv.tsi.javacourses.notepad.Asker;

public class PublicTransport extends AbstractRecord {
    private String manufacturer;
    private String model;
    private String vin;
    private int year;
    private String length;
    private String bortNumber;
    private String route;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getBortNumber() {
        return bortNumber;
    }

    public void setBortNumber(String bortNumber) {
        this.bortNumber = bortNumber;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void askInfo () {
        manufacturer = Asker.askString("Manufacturer");
        model = Asker.askString("Model");
        vin = Asker.askString("VIN");
        year = Asker.askInt("Year");
        length = Asker.askString("Length");
        bortNumber = Asker.askString("Bort Number");
        route = Asker.askString("Route");
    }

    @Override
    public String stringContent() {
        return super.stringContent() +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", year=" + year +
                ", length='" + length + '\'' +
                ", bortNumber='" + bortNumber + '\'' +
                ", route='" + route + '\'' +
                '}';
    }

    @Override
    protected String type() {
        return "PublicTransport";
    }
}
