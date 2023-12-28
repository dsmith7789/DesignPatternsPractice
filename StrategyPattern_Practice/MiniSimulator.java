public class MiniSimulator {
    public static void main(String[] args) {
        Character king = new King();
        Character queen = new Queen();
        Character knight = new Knight();
        Character troll = new Troll();

        king.display();
        king.fight();
        
        queen.display();
        queen.fight();

        knight.display();
        knight.fight();

        troll.display();
        troll.fight();

        knight.setWeaponBehavior(new AxeBehavior());  // change behavior at runtime
        knight.display();
        knight.fight();
    }
}
