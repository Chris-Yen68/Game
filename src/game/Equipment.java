package game;

/**
 * This class is the equitment
 * @author Li Zhen
 * @version 1.0
 */

public class Equipment {

    public final static String HELMET = "Helmet";
    public final static String ARMOR = "Armor";
    public final static String SHIELD = "Shield";
    public final static String RING = "Ring";
    public final static String BELT = "Belt";
    public final static String BOOTS = "Boots";
    public final static String WEAPON = "Weapon";


    private String name;
    private String type;
    private String enhancedAttribute;
    private int enhancedValue;

    /**
     * This is the construtor of game.Equipment
     * @param name String
     * @param type String
     * @param enhancedAttribute String
     * @param enhancedValue int
     */


    public Equipment(String name, String type, String enhancedAttribute, int enhancedValue) {

        this.name = name;
        this.type = type;
        this.enhancedAttribute = enhancedAttribute;
        this.enhancedValue = enhancedValue;
    }

    /**
     * This method is to validate whether the attribute can be improve according to  the game.Equipment
     * @return isValidate boolean
     */

    public boolean validate(){

        boolean isValidate = false;

        if (type.equals(HELMET)){
            if (enhancedAttribute.equals(Player.ABILITY_INT)
                    || enhancedAttribute.equals(Player.ATTRIBUTE_ARMOR_CLASS)
                    || enhancedAttribute.equals(Player.ABILITY_WIS)){
                isValidate = true;
            }
        }else if (type.equals(ARMOR)){
            if (enhancedAttribute.equals(Player.ATTRIBUTE_ARMOR_CLASS)){
                isValidate = true;
            }
        }else if (type.equals(SHIELD)){
            if (enhancedAttribute.equals(Player.ATTRIBUTE_ARMOR_CLASS)){
                isValidate = true;
            }
        }else if (type.equals(RING)){
            if (enhancedAttribute.equals(Player.ATTRIBUTE_ARMOR_CLASS)
                    || enhancedAttribute.equals(Player.ABILITY_STR)
                    || enhancedAttribute.equals(Player.ABILITY_CON)
                    || enhancedAttribute.equals(Player.ABILITY_WIS)
                    || enhancedAttribute.equals(Player.ABILITY_CHA)){
                isValidate = true;
            }
        }else if (type.equals(BELT)){
            if (enhancedAttribute.equals(Player.ABILITY_CON)
                    || enhancedAttribute.equals(Player.ABILITY_STR)){
                isValidate = true;
            }
        }else if (type.equals(BOOTS)){
            if (enhancedAttribute.equals(Player.ATTRIBUTE_ARMOR_CLASS)
                    || enhancedAttribute.equals(Player.ABILITY_DEX)){
                isValidate = true;
            }
        }else if (type.equals(WEAPON)){
            if (enhancedAttribute.equals(Player.ATTRIBUTE_ATTACK_BONUS)
                    || enhancedAttribute.equals(Player.ATTRIBUTE_DAMAGE_BONUS)){
                isValidate = true;
            }
        }

        return isValidate;
    }

    /**
     * This is the constructor
     */


    public Equipment() {

    }

    /**
     * this method is to get name of game.Equipment
     * @return name String
     */

    public String getName() {
        return name;
    }

    /**
     * this method is to set name of game.Equipment
     * @param name String
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * this method is to get type of game.Equipment
     * @return type String
     */

    public String getType() {
        return type;
    }

    /**
     * this method is to set type of game.Equipment
     * @param type String
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * this method is to get enhancedAttribute
     * @return enhancedAttribute String
     */

    public String getEnhancedAttribute() {
        return enhancedAttribute;
    }

    /**
     * this method is to set getEnhancedAttribute
     * @param enhancedAttribute String
     */

    public void setEnhancedAttribute(String enhancedAttribute) {
        this.enhancedAttribute = enhancedAttribute;
    }

    /**
     * this method is to get enhancedValue
     * @return enhancedValue int
     */

    public int getEnhancedValue() {
        return enhancedValue;
    }

    /**
     * this method is to set enhancedValue
     * @param enhancedValue int
     */

    public void setEnhancedValue(int enhancedValue) {
        this.enhancedValue = enhancedValue;
    }

//    public static List<game.Equipment> demo(){
//        List<game.Equipment> equipmentsList = new LinkedList<>();
//
//
//        game.Equipment lighLeather = new game.Equipment("Light Leather","ARMOR","AC",1);
//        game.Equipment quiltedLeather = new game.Equipment("Quilted Leather","ARMOR","AC",3);
//        game.Equipment armingCoat = new game.Equipment("Arming Coat","ARMOR","AC",5);
//        equipmentsList.add(lighLeather);
//        equipmentsList.add(quiltedLeather);
//        equipmentsList.add(armingCoat);
//
//        game.Equipment mightOfDread = new game.Equipment("Might of Dread","HELMET","SCORE_INT",3);
//        game.Equipment coifOfDelusions = new game.Equipment("Coif of Delusions","HELMET","SCORE_WIS",5);
//        game.Equipment dawOfInsanity = new game.Equipment("Dawn of Insanity","HELMET","AC",2);
//        equipmentsList.add(mightOfDread);
//        equipmentsList.add(coifOfDelusions);
//        equipmentsList.add(dawOfInsanity);
//
//        game.Equipment oathkeeper = new game.Equipment("Oathkeeper","SHIELD","AC",3);
//        game.Equipment ghostwalker = new game.Equipment("Ghostwalker","SHIELD","AC",4);
//        game.Equipment sierra = new game.Equipment("Sierra","SHIELD","AC",5);
//        equipmentsList.add(oathkeeper);
//        equipmentsList.add(ghostwalker);
//        equipmentsList.add(sierra);
//
//        game.Equipment linenSash = new game.Equipment("Linen Sash","BELT","SCORE_CON",3);
//        game.Equipment loyalWoolSash = new game.Equipment("Loyal Wool Sash","BELT","SCORE_STR",4);
//        game.Equipment cordOfBeginnings = new game.Equipment("Cord of Beginnings","BELT","SCORE_CON",5);
//        equipmentsList.add(linenSash);
//        equipmentsList.add(loyalWoolSash);
//        equipmentsList.add(cordOfBeginnings);
//
//
//        game.Equipment steelWalkers = new game.Equipment("Steel Walkers","BOOTS","AC",3);
//        game.Equipment bronzeWarboots = new game.Equipment("Bronze Warboots","BOOTS","SCORE_DEX",4);
//        game.Equipment boneStompers = new game.Equipment("Bone Stompers","BOOTS","SCORE_DEX",5);
//        equipmentsList.add(steelWalkers);
//        equipmentsList.add(bronzeWarboots);
//        equipmentsList.add(boneStompers);
//
//
//        game.Equipment ashbringer = new game.Equipment("Ashbringer","WEAPON","AB",5);
//        game.Equipment axeOfCenarius = new game.Equipment("Axe of Cenarius","WEAPON","DB",5);
//        game.Equipment bloodhoofRunespear = new game.Equipment("Bloodhoof Runespear","WEAPON","DB",5);
//        equipmentsList.add(ashbringer);
//        equipmentsList.add(axeOfCenarius);
//        equipmentsList.add(bloodhoofRunespear);
//
//
//        game.Equipment phyrixEmbrace = new game.Equipment("Phyrix's Embrace","RING","AC",2);
//        game.Equipment sephuzSecret =new game.Equipment("Sephuz's Secret","RING","SCORE_STR",2);
//        game.Equipment alythessPyrogenics = new game.Equipment("Alythess's Pyrogenics","RING","SCORE_CON",3);
//        game.Equipment chatoyantSignet = new game.Equipment("Chatoyant Signet","RING","SCORE_WIS",5);
//        game.Equipment dualDetermination = new game.Equipment("Dual Determination","RING","SCORE_CHA",5);
//        equipmentsList.add(phyrixEmbrace);
//        equipmentsList.add(sephuzSecret);
//        equipmentsList.add(alythessPyrogenics);
//        equipmentsList.add(chatoyantSignet);
//        equipmentsList.add(dualDetermination);
//
//
//        return equipmentsList;
//    }


}
