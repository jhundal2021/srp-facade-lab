package srpfacadelab;

import java.util.List;
import java.util.ArrayList;


public class RpgPlayer {
    public static final int MAX_CARRYING_CAPACITY = 1000;

    protected final IGameEngine gameEngine;

    private int health;

    private int maxHealth;

    private int armour;

    // How much the player can carry in pounds
    private int carryingCapacity;

    ItemActions IA;

    public RpgPlayer(IGameEngine gameEngine) {
        this.gameEngine = gameEngine;
        carryingCapacity = MAX_CARRYING_CAPACITY;
    }

    public void takeDamage(int damage) {
        if (damage < getArmour()) {
            gameEngine.playSpecialEffect("parry");
        }

        int damageToDeal;

        if (IA.calculateInventoryWeight() < (getCarryingCapacity()) * (0.5)){
            damageToDeal = (int) 0.75 * (damage - getArmour());
        }
        else{
            damageToDeal = damage - getArmour();
        }
        health -= damageToDeal;

        gameEngine.playSpecialEffect("lots_of_gore");
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    private void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }
}
