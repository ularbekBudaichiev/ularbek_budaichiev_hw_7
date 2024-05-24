public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(240, 40, " Fire"),
                new Medic(90, 10, "heal", 20),
                new Warrior(3500, 50, "fisical damage")
        };


        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }

}