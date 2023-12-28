public class Troll extends Character {
    public Troll() {
        weaponBehavior = new AxeBehavior();
    }

    public void display() {
        System.out.println("Grrr... I am a troll");
    }
}
