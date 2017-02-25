package game;

import game.Player;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Saki on 2017/2/24.
 */
public class Simulation {
    public static Player newPlayer(){
        Player player = new Player(2, "playerDemo");
        player.generateAbilities();
        player.generateHp();

        List<Equipment> equipmentList = new LinkedList<Equipment>();
        equipmentList = equipments21();

        int size = equipmentList.size();

        for (int i = 0; i < 11; i++) {
            int randomIndex = (int)(Math.random() * size);
            player.pickUpEquipment(equipments21().get(randomIndex));
        }

        for (int i = 0; i < 4; i++) {
            player.equip(player.equipmentsInBackpack().get(i));
        }

        player.setHp(100);

        return player;
    }


    public static List<Equipment> equipments21(){
        List<Equipment> equipmentsList = new LinkedList<>();


        Equipment lighLeather = new Equipment("Light Leather",Equipment.ARMOR,Player.ATTRIBUTE_ARMOR_CLASS,1);
        Equipment quiltedLeather = new Equipment("Quilted Leather",Equipment.ARMOR,Player.ATTRIBUTE_ARMOR_CLASS,3);
        Equipment armingCoat = new Equipment("Arming Coat",Equipment.ARMOR,Player.ATTRIBUTE_ARMOR_CLASS,5);

        equipmentsList.add(lighLeather);
        equipmentsList.add(quiltedLeather);
        equipmentsList.add(armingCoat);

        Equipment mightOfDread = new Equipment("Might of Dread",Equipment.HELMET,Player.ABILITY_INT,3);
        Equipment coifOfDelusions = new Equipment("Coif of Delusions",Equipment.HELMET,Player.ABILITY_WIS,5);
        Equipment dawOfInsanity = new Equipment("Dawn of Insanity",Equipment.HELMET,Player.ATTRIBUTE_ARMOR_CLASS,2);

        equipmentsList.add(mightOfDread);
        equipmentsList.add(coifOfDelusions);
        equipmentsList.add(dawOfInsanity);

        Equipment oathkeeper = new Equipment("Oathkeeper",Equipment.SHIELD,Player.ATTRIBUTE_ARMOR_CLASS,3);
        Equipment ghostwalker = new Equipment("Ghostwalker",Equipment.SHIELD,Player.ATTRIBUTE_ARMOR_CLASS,4);
        Equipment sierra = new Equipment("Sierra",Equipment.SHIELD,Player.ATTRIBUTE_ARMOR_CLASS,5);

        equipmentsList.add(oathkeeper);
        equipmentsList.add(ghostwalker);
        equipmentsList.add(sierra);

        Equipment linenSash = new Equipment("Linen Sash",Equipment.BELT,Player.ABILITY_CON,3);
        Equipment loyalWoolSash = new Equipment("Loyal Wool Sash",Equipment.BELT,Player.ABILITY_STR,4);
        Equipment cordOfBeginnings = new Equipment("Cord of Beginnings",Equipment.BELT,Player.ABILITY_CON,5);

        equipmentsList.add(linenSash);
        equipmentsList.add(loyalWoolSash);
        equipmentsList.add(cordOfBeginnings);


        Equipment steelWalkers = new Equipment("Steel Walkers",Equipment.BOOTS,Player.ATTRIBUTE_ARMOR_CLASS,3);
        Equipment bronzeWarboots = new Equipment("Bronze Warboots",Equipment.BOOTS,Player.ABILITY_DEX,4);
        Equipment boneStompers = new Equipment("Bone Stompers",Equipment.BOOTS,Player.ABILITY_DEX,5);

        equipmentsList.add(steelWalkers);
        equipmentsList.add(bronzeWarboots);
        equipmentsList.add(boneStompers);


        Equipment ashbringer = new Equipment("Ashbringer",Equipment.WEAPON,Player.ATTRIBUTE_ATTACK_BONUS,5);
        Equipment axeOfCenarius = new Equipment("Axe of Cenarius",Equipment.WEAPON,Player.ATTRIBUTE_DAMAGE_BONUS,5);
        Equipment bloodhoofRunespear = new Equipment("Bloodhoof Runespear",Equipment.WEAPON,Player.ATTRIBUTE_DAMAGE_BONUS,5);

        equipmentsList.add(ashbringer);
        equipmentsList.add(axeOfCenarius);
        equipmentsList.add(bloodhoofRunespear);


        Equipment phyrixEmbrace = new Equipment("Phyrix's Embrace",Equipment.RING,Player.ATTRIBUTE_ARMOR_CLASS,2);
        Equipment sephuzSecret = new Equipment("Sephuz's Secret",Equipment.RING,Player.ABILITY_STR,2);
        Equipment alythessPyrogenics = new Equipment("Alythess's Pyrogenics",Equipment.RING,Player.ABILITY_CON,3);
        Equipment chatoyantSignet = new Equipment("Chatoyant Signet",Equipment.RING,Player.ABILITY_WIS,5);
        Equipment dualDetermination = new Equipment("Dual Determination",Equipment.RING,Player.ABILITY_CHA,5);

        equipmentsList.add(phyrixEmbrace);
        equipmentsList.add(sephuzSecret);
        equipmentsList.add(alythessPyrogenics);
        equipmentsList.add(chatoyantSignet);
        equipmentsList.add(dualDetermination);

        return equipmentsList;
    }

}
