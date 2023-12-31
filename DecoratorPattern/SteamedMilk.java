public class SteamedMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Steamed Milk";
    }

    public double cost() {
        return 0.10 + this.beverage.cost();
    }
}
