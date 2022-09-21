public abstract class Hero implements HavingSuperAbility{
        private int health;
        private int damage;

        public Hero(int health, int damage) {
            this.health = health;
            this.damage = damage;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public int getDamage() {
            return damage;
        }
        public void setDamage(int damage) {
            this.damage = damage;
        }
        public String SuperAbility() {
            return superAbility;
        }

        private String superAbility;
        public String info() {
            return getHealth() +" " + getDamage();

        }
    }



