public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(300, 50, " Fire"),
                new Medic(80, 15, "heal", 20),
                new Warrior(120, 30, "fisical damage")
        };


        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }

}