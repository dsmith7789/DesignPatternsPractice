public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.setQuackBehavior(new Squeak());
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly(); // delegates to "FlyNoWay"
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly(); // delegates to "FlyRocketPowered"
    }    
}
