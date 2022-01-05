package vechile;

public class Main {
    public static void main(String[] args) {

    RaceMotorcycle racer = new RaceMotorcycle(30,150);
    CrossMotorcycle cross = new CrossMotorcycle(50,200);
    SportCar sportCar = new SportCar(50,405);
    FamilyCar familyCar = new FamilyCar(50,200);

        System.out.println(racer.getFuel());
        System.out.println(racer.getHorsepower());
        System.out.println(racer.getFuelConsumption());
        System.out.println(cross.getFuel());
        System.out.println(cross.getHorsepower());
        System.out.println(cross.getFuelConsumption());
        System.out.println(sportCar.getFuel());
        System.out.println(sportCar.getHorsepower());
        System.out.println(sportCar.getFuelConsumption());
        System.out.println(familyCar.getFuel());
        System.out.println(familyCar.getHorsepower());
        System.out.println(familyCar.getFuelConsumption());



        System.out.println();


    }
}
