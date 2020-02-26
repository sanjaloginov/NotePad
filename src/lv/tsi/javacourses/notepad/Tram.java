package lv.tsi.javacourses.notepad;

public class Tram extends PublicTransport {
    private int gauge;
    private int unitCount;

    public int getGauge() {
        return gauge;
    }

    public void setGauge(int gauge) {
        this.gauge = gauge;
    }

    public int getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(int unitCount) {
        this.unitCount = unitCount;
    }

    @Override
    public void askInfo() {
        super.askInfo();
        gauge = Asker.askInt("Gauge");
        unitCount = Asker.askInt("Unit Count");
    }

    @Override
    public String toString() {
        return "Tram{" +
                "id=" + getId() +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", model='" + getModel() + '\'' +
                ", vin='" + getVin() + '\'' +
                ", year=" + getYear() +
                ", length='" + getLength() + '\'' +
                ", gauge=" + gauge +
                ", unitCount=" + unitCount +
                ", bortNumber='" + getBortNumber() + '\'' +
                ", route='" + getRoute() + '\'' +
                '}';
    }
}
