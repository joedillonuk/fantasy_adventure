package players;

public class Barbarian extends Fighter{

    private double attackMultiplier;

    public Barbarian(String name, int healthPoints) {
        super(name, healthPoints);
        attackMultiplier = 1.2;
    }



}
