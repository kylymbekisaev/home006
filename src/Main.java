public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(70);

        Weapon weapon = new Weapon();
        weapon.weaponType = "fireams";
        weapon.name ="machineGun";

        boss.setWeapon1(weapon);

        System.out.println(boss.getHealth());
        System.out.println(boss.getDamage());
        System.out.println(boss.getWeapon1().name);
        System.out.println(boss.getWeapon1().weaponType);
    }
}