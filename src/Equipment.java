import java.util.LinkedList;
import java.util.List;

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
     * This is the construtor of Equipment
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
     * This method is to validate whether the attribute can be improve according to  the Equipment
     * @return isValidate boolean
     */

    public boolean validate(){

        boolean isValidate = false;

        if (type.equals(HELMET)){
            if (enhancedAttribute.equals(Character.ABILITY_INT)
                    || enhancedAttribute.equals(Character.ATTRIBUTE_ARMOR_CLASS)
                    || enhancedAttribute.equals(Character.ABILITY_WIS)){
                isValidate = true;
            }
        }else if (type.equals(ARMOR)){
            if (enhancedAttribute.equals(Character.ATTRIBUTE_ARMOR_CLASS)){
                isValidate = true;
            }
        }else if (type.equals(SHIELD)){
            if (enhancedAttribute.equals(Character.ATTRIBUTE_ARMOR_CLASS)){
                isValidate = true;
            }
        }else if (type.equals(RING)){
            if (enhancedAttribute.equals(Character.ATTRIBUTE_ARMOR_CLASS)
                    || enhancedAttribute.equals(Character.ABILITY_STR)
                    || enhancedAttribute.equals(Character.ABILITY_CON)
                    || enhancedAttribute.equals(Character.ABILITY_WIS)
                    || enhancedAttribute.equals(Character.ABILITY_CHA)){
                isValidate = true;
            }
        }else if (type.equals(BELT)){
            if (enhancedAttribute.equals(Character.ABILITY_CON)
                    || enhancedAttribute.equals(Character.ABILITY_STR)){
                isValidate = true;
            }
        }else if (type.equals(BOOTS)){
            if (enhancedAttribute.equals(Character.ATTRIBUTE_ARMOR_CLASS)
                    || enhancedAttribute.equals(Character.ABILITY_DEX)){
                isValidate = true;
            }
        }else if (type.equals(WEAPON)){
            if (enhancedAttribute.equals(Character.ATTRIBUTE_ATTACK_BONUS)
                    || enhancedAttribute.equals(Character.ATTRIBUTE_DAMAGE_BONUS)){
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
     * this method is to get name of Equipment
     * @return name String
     */

    public String getName() {
        return name;
    }

    /**
     * this method is to set name of Equipment
     * @param name String
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * this method is to get type of Equipment
     * @return type String
     */

    public String getType() {
        return type;
    }

    /**
     * this method is to set type of Equipment
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

//    public static List<Equipment> demo(){
//        List<Equipment> equipmentsList = new LinkedList<>();
//
//
//        Equipment lighLeather = new Equipment("Light Leather","ARMOR","AC",1);
//        Equipment quiltedLeather = new Equipment("Quilted Leather","ARMOR","AC",3);
//        Equipment armingCoat = new Equipment("Arming Coat","ARMOR","AC",5);
//        equipmentsList.add(lighLeather);
//        equipmentsList.add(quiltedLeather);
//        equipmentsList.add(armingCoat);
//
//        Equipment mightOfDread = new Equipment("Might of Dread","HELMET","SCORE_INT",3);
//        Equipment coifOfDelusions = new Equipment("Coif of Delusions","HELMET","SCORE_WIS",5);
//        Equipment dawOfInsanity = new Equipment("Dawn of Insanity","HELMET","AC",2);
//        equipmentsList.add(mightOfDread);
//        equipmentsList.add(coifOfDelusions);
//        equipmentsList.add(dawOfInsanity);
//
//        Equipment oathkeeper = new Equipment("Oathkeeper","SHIELD","AC",3);
//        Equipment ghostwalker = new Equipment("Ghostwalker","SHIELD","AC",4);
//        Equipment sierra = new Equipment("Sierra","SHIELD","AC",5);
//        equipmentsList.add(oathkeeper);
//        equipmentsList.add(ghostwalker);
//        equipmentsList.add(sierra);
//
//        Equipment linenSash = new Equipment("Linen Sash","BELT","SCORE_CON",3);
//        Equipment loyalWoolSash = new Equipment("Loyal Wool Sash","BELT","SCORE_STR",4);
//        Equipment cordOfBeginnings = new Equipment("Cord of Beginnings","BELT","SCORE_CON",5);
//        equipmentsList.add(linenSash);
//        equipmentsList.add(loyalWoolSash);
//        equipmentsList.add(cordOfBeginnings);
//
//
//        Equipment steelWalkers = new Equipment("Steel Walkers","BOOTS","AC",3);
//        Equipment bronzeWarboots = new Equipment("Bronze Warboots","BOOTS","SCORE_DEX",4);
//        Equipment boneStompers = new Equipment("Bone Stompers","BOOTS","SCORE_DEX",5);
//        equipmentsList.add(steelWalkers);
//        equipmentsList.add(bronzeWarboots);
//        equipmentsList.add(boneStompers);
//
//
//        Equipment ashbringer = new Equipment("Ashbringer","WEAPON","AB",5);
//        Equipment axeOfCenarius = new Equipment("Axe of Cenarius","WEAPON","DB",5);
//        Equipment bloodhoofRunespear = new Equipment("Bloodhoof Runespear","WEAPON","DB",5);
//        equipmentsList.add(ashbringer);
//        equipmentsList.add(axeOfCenarius);
//        equipmentsList.add(bloodhoofRunespear);
//
//
//        Equipment phyrixEmbrace = new Equipment("Phyrix's Embrace","RING","AC",2);
//        Equipment sephuzSecret =new Equipment("Sephuz's Secret","RING","SCORE_STR",2);
//        Equipment alythessPyrogenics = new Equipment("Alythess's Pyrogenics","RING","SCORE_CON",3);
//        Equipment chatoyantSignet = new Equipment("Chatoyant Signet","RING","SCORE_WIS",5);
//        Equipment dualDetermination = new Equipment("Dual Determination","RING","SCORE_CHA",5);
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
