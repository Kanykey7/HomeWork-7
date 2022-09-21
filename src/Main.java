public class Main {
    public static void main(String[] args){
    Medic medic = new Medic (434, 300, 200);
    Magic magic = new Magic(230, 250);
    Warrior warrior = new Warrior( 160, 200);
    Hero [] hero = {
            medic, warrior, magic
    };
        for (int i = 0; i < hero.length; i++) {
            System.out.println(hero [i].info());
            hero[i].applySuperAbility();
            if (hero[i] == medic){
                System.out.println(medic.increaseExperience());
            }

        }
    }

}