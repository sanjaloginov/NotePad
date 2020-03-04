package lv.tsi.javacourses.notepad.records;

import lv.tsi.javacourses.notepad.Asker;

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
    public boolean contains(String substr) {
        return super.contains(substr)
                || String.valueOf(gauge).contains(substr)
                || String.valueOf(unitCount).contains(substr);
    }

    @Override
    public String stringContent() {
        return super.stringContent() +
                ", gauge=" + gauge +
                ", unitCount=" + unitCount;
    }

    @Override
    protected String type() {
        return "Tram";
    }
}
