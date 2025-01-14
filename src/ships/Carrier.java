package ships;

import board.Spot;

/**
 * This is a concrete implementation of Carrier which extends Ship
 * @author Patryk
 */
public class Carrier extends Ship{
    static int maxHealth = 3;
    static int movementRange = 1;
    static int weaponsRange = 2;
    static int damage = 1;
    static boolean canAttack = false;
    static boolean canRepair = true;
    static String shipTexture;
    static int value = 10;
    
    /**
     * Carrier constructor
     * @param computer whether the ship is controlled by a computer
     * @param spot spot where the ship is
     */
    public Carrier(boolean computer, Spot spot) {
        super(computer, Carrier.maxHealth, Carrier.damage, canAttack, canRepair, Carrier.movementRange, Carrier.weaponsRange, getTexture(computer), spot, value);
    }
    
    /**
     * Returns the texture based on the player controlling the ship
     * @param computer whether the ship belongs to the computer
     * @return texture name as string
     */
    private static String getTexture(boolean computer){
        if (computer){
            return "ECarrier128";
        }
        else {
            return "PCarrier128";
        }
    }
}
