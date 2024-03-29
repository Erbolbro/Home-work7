public abstract class Hero implements HavingSuperAbility {
    private int health;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Hero(int health, int damage, String type) {
        this.health = health;
        this.damage = damage;
        this.type = type;
    }

    public Hero() {

    }

    private int damage;
    private String type;


}


