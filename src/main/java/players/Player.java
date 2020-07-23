package players;

public abstract class Player {

    private String name;
    private int healthPoints;
    private int maxHealth;

    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.maxHealth = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int newHealthPoints){
        this.healthPoints = newHealthPoints;
    }

    public int getMaxHealth() {
        return maxHealth;
    }
}
