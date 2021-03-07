package Builder;

public class Application {
    void MakeCar()
    {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        //Manual manual = builder.getResult();
        Car car = builder.getResult();
        CarManualBuilder manualbuilder = new CarManualBuilder();
        director.constructSportsCar(builder);
    }
}
