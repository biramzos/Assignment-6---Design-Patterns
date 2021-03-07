package Builder;

public class CarManualBuilder implements Builder {
    private Manual manual;
    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSeats(int numberofseats) {
        manual.seats = numberofseats;
    }

    @Override
    public void setEngine(String engine) {
        manual.engine = engine;
    }

    @Override
    public void setTripComputer(boolean systeofnavigation) {
        manual.navigation = systeofnavigation;
    }

    @Override
    public void setGPS(boolean location) {
        manual.location = location;
    }
    public Manual getResult(){
        return manual;
    }
}
