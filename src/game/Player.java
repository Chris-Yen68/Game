package game;

import java.util.*;

/**
 *
 * This Class is character, which includes users and NPCs.
 *
 * @author Kai QI
 * @version 1.2
 *
 */
public class Player {

    /**
     * Abliblities and methods.
     */

    public final static String ABILITY_STR = "Strength";
    public final static String ABILITY_DEX = "Dexterity";
    public final static String ABILITY_CON = "Constitution";
    public final static String ABILITY_INT = "Intelligence";
    public final static String ABILITY_WIS = "Wisdom";
    public final static String ABILITY_CHA = "Charisma";

    public final static String ATTRIBUTE_ARMOR_CLASS = "Armor Class";
    public final static String ATTRIBUTE_ATTACK_BONUS = "Attack Bonus";
    public final static String ATTRIBUTE_DAMAGE_BONUS = "Damage Bonus";

    private Map<String, Integer> ablilityScores = new HashMap<>();

    /**
     * This method is used to get the ability score of object based on the given name of the ability.
     * @param name String
     * @return Integer
     */
    public Integer getAbilityScore(String name) {
        return ablilityScores.get(name);
    }

    /**
     * This method is used to calculate the modifiers for each ability score, based on the D20 formulas..
     * @param name String
     * @return Integer
     */
    public Integer getAbilityModifier(String name) {
        int ability = getAbilityScore(name);
        return (int)(Math.floor(ability / 2.0 - 5));
    }


    /**
     * This method is used to calculate the ability scores based on the D20 formulas.
     */
    public void generateAbilities() {
        ablilityScores.put(ABILITY_STR, Dice.rool(4, 6, 0));
        ablilityScores.put(ABILITY_DEX, Dice.rool(4, 6, 0));
        ablilityScores.put(ABILITY_CON, Dice.rool(4, 6, 0));
        ablilityScores.put(ABILITY_INT, Dice.rool(4, 6, 0));
        ablilityScores.put(ABILITY_WIS, Dice.rool(4, 6, 0));
        ablilityScores.put(ABILITY_CHA, Dice.rool(4, 6, 0));
    }

    /**
     * Backpack and methods.
     */

    private List<Equipment> backpack = new LinkedList<>();

    /**
     * This method is used to return all the equipments in the backpack.
     * @return List
     */
    public List<Equipment> equipmentsInBackpack() {
        return backpack;
    }

    /**
     * This method is used to check if the backpack is full, which means the number of the equipments is 10.
     * @return boolean
     */
    public boolean isBackpackFull() {
        if (backpack.size() >= 10) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method is used to pick up an equipment when the character meet a chest.
     * @param e, the equipment the character wants to pick up.
     */
    public void pickUpEquipment(Equipment e) {
        if (! isBackpackFull()) {
            backpack.add(e);
        }
    }

    /**
     * This method is used to drop an equipment when the character wants to drop, usually at the time the backpack is full.
     * @param e, the equipment the character wants to drop.
     */
    public void dropEquipment(Equipment e) {
        backpack.remove(e);
    }

    /**
     * Equipments and methods.
     */

    private Map<String, Equipment> equipments = new HashMap<>();

    /**
     * This method is used to get the equipment worn by the character based on the given name of the equipment type(slot).
     * @param type also the equipment slot
     * @return game.Equipment
     */
    public Equipment getEquipment(String type) {
        return equipments.get(type);
    }

    /**
     * This method is used to equip the equipment on the character.
     * The equip action will replace the current one on the same slot and also change the ability scores of the character.
     * @param e the equipment the character wants to equip, which is picked from backpack.
     */
    public void equip(Equipment e) {

        String type = e.getType();
        Equipment currentEquipment = equipments.get(type);
        if (currentEquipment != null) {
            unequip(currentEquipment);
        }

        ablilityScores.put(e.getEnhancedAttribute(), ablilityScores.get(e.getEnhancedAttribute()) + e.getEnhancedValue());
        equipments.put(type, e);
    }

    /**
     * This method is used to unequip the current equipment.
     * The unequip action will change the ability scores of the character, and the equipment will be put into backpack.
     * @param e the equipment the character wants to unequip
     */
    public void unequip(Equipment e) {

        ablilityScores.put(e.getEnhancedAttribute(), ablilityScores.get(e.getEnhancedAttribute()) - e.getEnhancedValue());

        backpack.add(e);

        String type = e.getType();
        equipments.remove(type);
    }

    /**
     * This method is ussed to calculate the total enhanced value by all equipments based on the attribute name.
     * @param attribute the attribute which is needed.
     * @return int, the total enhanced value of the equipments.
     */
    private int enhancedValueOnEquipments(String attribute) {

        int result = 0;

        switch (attribute) {

            case ATTRIBUTE_ARMOR_CLASS :
                for (Equipment equipment : equipments.values()) {
                    if (equipment.getEnhancedAttribute().equals(ATTRIBUTE_ARMOR_CLASS)){
                        result += equipment.getEnhancedValue();
                    }
                }
                break;

            case ATTRIBUTE_ATTACK_BONUS :
                for (Equipment equipment : equipments.values()) {
                    if (equipment.getEnhancedAttribute().equals(ATTRIBUTE_ATTACK_BONUS)){
                        result += equipment.getEnhancedValue();
                    }
                }
                break;

            case ATTRIBUTE_DAMAGE_BONUS :
                for (Equipment equipment : equipments.values()) {
                    if (equipment.getEnhancedAttribute().equals(ATTRIBUTE_DAMAGE_BONUS)){
                        result += equipment.getEnhancedValue();
                    }
                }
                break;
        }

        return result;
    }

    /**
     * Level, name and Getter & Setter & constructor.
     */

    private int level;
    private String name;

    /**
     * Getter for the level.
     * @return
     */
    public int getLevel() {
        return level;
    }

    /**
     * Setter for the level.
     * @return
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Getter for the name.
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the name.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Constructor without parameters.
     */
    public Player() {
    }

    /**
     * Constructor with parameters, level and name.
     * @param level
     * @param name
     */
    public Player(int level, String name) {
        this.level = level;
        this.name = name;
    }

    /**
     * Hp and methods.
     */

    private int hp;

    /**
     * Getter for hp.
     * @return
     */
    public int getHp() {
        return hp;
    }

    /**
     * Setter for hp.
     * @return
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * This method is used to calculate the hp value based on the D20 rules.
     */
    public void generateHp() {
        int hitDie = Dice.rool(10);
        int levelAdvances = hitDie + getAbilityModifier(ABILITY_CON);
        hp += levelAdvances > 1 ? levelAdvances : 1;
    }

    /**
     * Attributes calculate methods.
     */

    /**
     * This method is used to calculate the armor class value based on the D20 rules.
     * @return
     */
    public int getArmorClass() {
        int dexModifier = getAbilityModifier(ABILITY_DEX);
        int wornArmor = enhancedValueOnEquipments(ATTRIBUTE_ARMOR_CLASS);
        return 10 + wornArmor + dexModifier;
    }

    /**
     * This method is used to calculate the attack bonus value based on the D20 rules.
     * @return
     */
    public int getAttackBonus() {
        int strModifier = getAbilityModifier(ABILITY_STR);
        return level + strModifier;
    }

    /**
     * This method is used to calculate the damage bonus value based on the D20 rules.
     * @return
     */
    public int getDamageBonus() {
        int dexModifier = getAbilityModifier(ABILITY_DEX);
        int equipmentBonus = enhancedValueOnEquipments(ATTRIBUTE_DAMAGE_BONUS);
        return 10 + dexModifier + equipmentBonus;
    }
}