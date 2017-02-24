package game;

import game.Player;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Saki on 2017/2/24.
 */
public class Simulation {
    public static Player newPlayer(){
        return null;
    }


    public static List<Equipment> equipments21(){
        List<Equipment> equipmentsList = new LinkedList<>();


        Equipment lighLeather = new Equipment("Light Leather","ARMOR","AC",1);
        Equipment quiltedLeather = new Equipment("Quilted Leather","ARMOR","AC",3);
        Equipment armingCoat = new Equipment("Arming Coat","ARMOR","AC",5);

        equipmentsList.add(lighLeather);
        equipmentsList.add(quiltedLeather);
        equipmentsList.add(armingCoat);

        Equipment mightOfDread = new Equipment("Might of Dread","HELMET","SCORE_INT",3);
        Equipment coifOfDelusions = new Equipment("Coif of Delusions","HELMET","SCORE_WIS",5);
        Equipment dawOfInsanity = new Equipment("Dawn of Insanity","HELMET","AC",2);

        equipmentsList.add(mightOfDread);
        equipmentsList.add(coifOfDelusions);
        equipmentsList.add(dawOfInsanity);

        Equipment oathkeeper = new Equipment("Oathkeeper","SHIELD","AC",3);
        Equipment ghostwalker = new Equipment("Ghostwalker","SHIELD","AC",4);
        Equipment sierra = new Equipment("Sierra","SHIELD","AC",5);

        equipmentsList.add(oathkeeper);
        equipmentsList.add(ghostwalker);
        equipmentsList.add(sierra);

        Equipment linenSash = new Equipment("Linen Sash","BELT","SCORE_CON",3);
        Equipment loyalWoolSash = new Equipment("Loyal Wool Sash","BELT","SCORE_STR",4);
        Equipment cordOfBeginnings = new Equipment("Cord of Beginnings","BELT","SCORE_CON",5);

        equipmentsList.add(linenSash);
        equipmentsList.add(loyalWoolSash);
        equipmentsList.add(cordOfBeginnings);


        Equipment steelWalkers = new Equipment("Steel Walkers","BOOTS","AC",3);
        Equipment bronzeWarboots = new Equipment("Bronze Warboots","BOOTS","SCORE_DEX",4);
        Equipment boneStompers = new Equipment("Bone Stompers","BOOTS","SCORE_DEX",5);

        equipmentsList.add(steelWalkers);
        equipmentsList.add(bronzeWarboots);
        equipmentsList.add(boneStompers);


        Equipment ashbringer = new Equipment("Ashbringer","WEAPON","AB",5);
        Equipment axeOfCenarius = new Equipment("Axe of Cenarius","WEAPON","DB",5);
        Equipment bloodhoofRunespear = new Equipment("Bloodhoof Runespear","WEAPON","DB",5);

        equipmentsList.add(ashbringer);
        equipmentsList.add(axeOfCenarius);
        equipmentsList.add(bloodhoofRunespear);


        Equipment phyrixEmbrace = new Equipment("Phyrix's Embrace","RING","AC",2);
        Equipment sephuzSecret = new Equipment("Sephuz's Secret","RING","SCORE_STR",2);
        Equipment alythessPyrogenics = new Equipment("Alythess's Pyrogenics","RING","SCORE_CON",3);
        Equipment chatoyantSignet = new Equipment("Chatoyant Signet","RING","SCORE_WIS",5);
        Equipment dualDetermination = new Equipment("Dual Determination","RING","SCORE_CHA",5);

        equipmentsList.add(phyrixEmbrace);
        equipmentsList.add(sephuzSecret);
        equipmentsList.add(alythessPyrogenics);
        equipmentsList.add(chatoyantSignet);
        equipmentsList.add(dualDetermination);

        return equipmentsList;
    }

}
