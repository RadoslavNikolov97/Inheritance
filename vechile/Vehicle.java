package vechile;

public class Vehicle {
    private final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsepower;

    public Vehicle(double fuel, int horsepower) {
        this.fuel = fuel;
        this.horsepower = horsepower;
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);

    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }


    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
    public void drive(double kilometers){
        double fuelNeeded = kilometers * fuelConsumption;
        if (this.fuel >= fuelNeeded){
            this.fuel -= fuelNeeded;
        }

    }
}
