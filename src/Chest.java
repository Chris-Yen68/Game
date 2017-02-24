import java.util.LinkedList;

/**
 * this class is the Chest in the game
 * @author Li Zhen
 * @version 1.0
 */
public class Chest {
    private Equipment equipment;

    /**
     * this method is to get equipment in the chest
     * @return equipment Equipment
     */

    public Equipment getEquipment() {
        return equipment;
    }

    /**
     * this method is to set equipment in the chest
     * @param equipment Equipment
     */


    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
}
