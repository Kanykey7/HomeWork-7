public class Warrior extends Hero {
        public Warrior(int health, int damage) {
            super(health, damage);
        }

        @Override
        public void applySuperAbility() {
            System.out.println("Warrior applied a superpower CRITICAL DAMAGE”. ");
        }

        @Override
        public String info() {
            return super.info();
        }
    }


