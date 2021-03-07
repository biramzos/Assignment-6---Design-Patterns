package Builder;

public class CarBuilder implements Builder{
    private Car car;
    @Override
    public void reset() {
        car = new Car();
    }
    @Override
    public void setSeats(int numberofseats) {
        car.seats = numberofseats;
    }
    @Override
    public void setEngine(String engine) {
        car.engine = engine;
    }
    @Override
    public void setTripComputer(boolean systeofnavigation) {
        car.navigation = systeofnavigation;
    }
    @Override
    public void setGPS(boolean location) {
        car.location = location;
    }
    public Car getResult()
    {
        return car;
    }
}
