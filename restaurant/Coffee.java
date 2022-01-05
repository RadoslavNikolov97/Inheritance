package restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage{
    private static final double COFFEE_MILLILITERS = 50;
    private static final BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);
    private double caffeine;

public Coffee(String name, BigDecimal price, double milliliters,double caffeine) {
        super(name, price, milliliters);
        this.caffeine = caffeine;
    }

    public Coffee(String name, BigDecimal price,double caffeine) {
        super(name, price, COFFEE_MILLILITERS);
        this.caffeine = caffeine;
    }

    public Coffee(String name, double milliliters,double caffeine) {
        super(name, COFFEE_PRICE, milliliters);
        this.caffeine = caffeine;
    }

    public Coffee(String name,double caffeine) {
        super(name, COFFEE_PRICE, COFFEE_MILLILITERS);
        this.caffeine = caffeine;
    }

    public double getCaffeine() {
        return caffeine;
    }
}
