public class Medic extends Hero{
    private int healPoints;
    public int increaseExperience(){
        int person = (((10 * healPoints)/100 )+healPoints);
        return person;

    }
    public Medic(int health, int damage, int healPoints) {
        super(health, damage);
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }


    @Override
    public void applySuperAbility(){
        System.out.println("Warrior applied a superPower CRITICAL DAMAGE");

    }
    @Override
    public String info(){
    return super.info();

    }
}
