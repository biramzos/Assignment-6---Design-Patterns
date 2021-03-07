package Builder;

public class Director {
    void constructSportsCar(Builder builder)
    {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine("SportEngine");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }
}
