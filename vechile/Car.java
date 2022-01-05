package vechile;

public class Car extends Vehicle{
    private final static double DEFAULT_FUEL_CONSUMPTION = 3.00;
    public Car(double fuel, int horsepower) {
        super(fuel, horsepower);
       super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);

    }



}
