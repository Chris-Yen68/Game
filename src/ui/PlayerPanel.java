package ui;

import game.Equipment;
import game.Player;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kai QI on 2017/2/24.
 */
public class PlayerPanel extends JPanel {

    /**
     * The attribute player and Getter & Setter.
     */
    private Player player;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * Constructor.
     */

    public PlayerPanel() {
        this.setLayout(null);
        this.setSize(400, 420);


    }

    /**
     * Layout
     */

    public Label levelValueLabel;
    public AbilityView strAbilityView;
    public AbilityView intAbilityView;
    public AbilityView dexAbilityView;
    public AbilityView wisAbilityView;
    public AbilityView conAbilityView;
    public AbilityView chaAbilityView;    
    public Label hpValueLabel;
    public Label abValueLabel;
    public Label acValueLabel;
    public Label dbValueLabel;
    public EquipmentView weaponEquipmentView;
    public EquipmentView shieldEquipmentView;
    public EquipmentView armorEquipmentView;
    public EquipmentView helmetEquipmentView;
    public EquipmentView ringEquipmentView;
    public EquipmentView beltEquipmentView;
    public EquipmentView bootsEquipmentView;

    private void initSubviews(){

        Label label;
        AbilityView abilityView;
        EquipmentView equipmentView = new EquipmentView();
        Button button;

        label = new Label();
        label.setSize(400, 200);
        label.setLocation(0, 0);
        add(label);
        label.setBackground(new Color(200, 200, 200));
        Label titleBackground = new Label();
        titleBackground = label;

        label = new Label();
        label.setSize(100, 20);
        label.setLocation(150, 0);
        add(label);
        label.setText("Player");
        Label titleLabel = new Label();
        titleLabel = label;

        label = new Label();
        label.setSize(60, 20);
        label.setLocation(10, 30);
        add(label);
        label.setText("Name");
        Label nameLable = new Label();
        nameLable = label;

        label = new Label();
        label.setSize(90, 20);
        label.setLocation(80, 30);
        add(label);
        label.setText(player.getName());
        Label nameValueLabel = new Label();
        nameValueLabel = label;

        label = new Label();
        label.setSize(60, 20);
        label.setLocation(190, 30);
        add(label);
        label.setText("Level");
        Label levelLable = new Label();
        levelLable = label;

        label = new Label();
        label.setSize(40, 20);
        label.setLocation(260, 30);
        add(label);
        levelValueLabel = label;
//        levelValueLabel.setText(player.getLevel() + "")
//        这条写在set按钮的event里面去

        abilityView = new AbilityView();
        abilityView.setLocation(10, 60);
        add(abilityView);
        abilityView.nameLabel.setText(Player.ABILITY_STR);
        strAbilityView = abilityView;
//        generate按钮的event，再去做ablilityView里其他两个label的setText

        abilityView = new AbilityView();
        abilityView.setLocation(190, 60);
        add(abilityView);
        abilityView.nameLabel.setText(Player.ABILITY_INT);
        intAbilityView = abilityView;

        abilityView = new AbilityView();
        abilityView.setLocation(10, 90);
        add(abilityView);
        abilityView.nameLabel.setText(Player.ABILITY_DEX);
        dexAbilityView = abilityView;

        abilityView = new AbilityView();
        abilityView.setLocation(190, 90);
        add(abilityView);
        abilityView.nameLabel.setText(Player.ABILITY_WIS);
        wisAbilityView = abilityView;

        abilityView = new AbilityView();
        abilityView.setLocation(10, 120);
        add(abilityView);
        abilityView.nameLabel.setText(Player.ABILITY_CON);
        conAbilityView = abilityView;

        abilityView = new AbilityView();
        abilityView.setLocation(190, 120);
        add(abilityView);
        abilityView.nameLabel.setText(Player.ABILITY_CHA);
        chaAbilityView = abilityView;

        label = new Label();
        label.setSize(100, 20);
        label.setLocation(10, 150);
        add(label);
        label.setText("Hit Point");
        Label hpLabel = new Label();
        hpLabel = label;

        label = new Label();
        label.setSize(40, 20);
        label.setLocation(120, 150);
        add(label);
        hpValueLabel = label;
//        hpValueLabel.setText(player.getHp() + "");
//      写到gerenate按钮event

        label = new Label();
        label.setSize(100, 20);
        label.setLocation(190, 150);
        add(label);
        label.setText("Attack Bonus");
        Label abLabel = new Label();
        abLabel = label;

        label = new Label();
        label.setSize(40, 20);
        label.setLocation(300, 150);
        add(label);
        abValueLabel = label;
//        abValueLabel.setText(player.getHp() + "");
//      写到gerenate按钮event

        label = new Label();
        label.setSize(100, 20);
        label.setLocation(10, 180);
        add(label);
        label.setText("Armor Class");
        Label acLabel = new Label();
        acLabel = label;

        label = new Label();
        label.setSize(40, 20);
        label.setLocation(120, 180);
        add(label);
        acValueLabel = label;
//        acValueLabel.setText(player.getHp() + "");
//      写到gerenate按钮event

        label = new Label();
        label.setSize(100, 20);
        label.setLocation(190, 180);
        add(label);
        label.setText("Damage Bonus");
        Label dbLabel = new Label();
        dbLabel = label;

        label = new Label();
        label.setSize(40, 20);
        label.setLocation(300, 180);
        add(label);
        dbValueLabel = label;
//        dbValueLabel.setText(player.getHp() + "");
//      写到gerenate按钮event

        equipmentView = new EquipmentView();
        equipmentView.setLocation(10, 210);
        add(equipmentView);
        equipmentView.typeLabel.setText(Equipment.WEAPON);
        weaponEquipmentView = equipmentView;

        button = new Button("unequip");
        button.setSize(60, 20);
        button.setLocation(320, 210);
        add(button);
        Button unequipHelmetBotton = new Button();
        unequipHelmetBotton = button;

        equipmentView = new EquipmentView();
        equipmentView.setLocation(10, 240);
        add(equipmentView);
        weaponEquipmentView = equipmentView;

        equipmentView = new EquipmentView();
        equipmentView.setLocation(10, 270);
        add(equipmentView);
        weaponEquipmentView = equipmentView;

        equipmentView = new EquipmentView();
        equipmentView.setLocation(10, 300);
        add(equipmentView);
        weaponEquipmentView = equipmentView;

        equipmentView = new EquipmentView();
        equipmentView.setLocation(10, 330);
        add(equipmentView);
        weaponEquipmentView = equipmentView;

        equipmentView = new EquipmentView();
        equipmentView.setLocation(10, 360);
        add(equipmentView);
        weaponEquipmentView = equipmentView;

        equipmentView = new EquipmentView();
        equipmentView.setLocation(10, 390);
        add(equipmentView);
        weaponEquipmentView = equipmentView;
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
