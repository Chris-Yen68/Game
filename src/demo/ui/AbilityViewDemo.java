package demo.ui;

import game.Equipment;
import game.Player;
import ui.AbilityView;
import ui.EquipmentView;

import javax.swing.*;

/**
 * Created by Saki on 2017/2/24.
 */
public class AbilityViewDemo extends JFrame{
    public static void main(String[] args) {
        AbilityViewDemo window = new AbilityViewDemo();
        window.setSize(200, 50);
        window.setLayout(null);
        window.setVisible(true);
    }

    public AbilityViewDemo() {
        AbilityView abilityView = new AbilityView();
        this.add(abilityView);

        abilityView.nameLabel.setText("HAHAHA");
        abilityView.scoreLabel.setText("HAHAHA");
        abilityView.modifierLabel.setText("HAHAHA");

        // demo 2
        EquipmentView equipmentView = new EquipmentView();
        equipmentView.setLocation(0, 50);
        this.add(equipmentView);

        Equipment equipment = new Equipment();
        equipment.setName("haha");
        equipment.setType(Equipment.BOOTS);
        equipment.setEnhancedAttribute(Player.ATTRIBUTE_ARMOR_CLASS);
        equipment.setEnhancedValue(2);
        equipmentView.setEquipment(equipment);
    }
}
