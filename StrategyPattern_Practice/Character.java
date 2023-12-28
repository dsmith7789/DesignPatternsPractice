public abstract class Character {
    WeaponBehavior weaponBehavior;

    public Character() {}

    public abstract void display();

    public void fight() {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior wb) {
        weaponBehavior = wb;
    }
}