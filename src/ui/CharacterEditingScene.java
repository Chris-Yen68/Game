package ui;

import game.Equipment;
import game.Player;
import game.Simulation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

/**
 * Created by Penelope on 17/2/24.
 */
public class CharacterEditingScene extends View {
    /**
     * The attribute player and Getter & Setter.
     */
    private Player player;
//    private Player player = Simulation.newPlayer();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }



    /**
     * Constructor.
     */
    public CharacterEditingScene() {
        setLayout(null);
        setSize(1000, 600);

        initSubviews();
    }


    /**
     * Layout
     */

    public JLabel nameValueLabel;
    public JLabel levelValueLabel;
    public AbilityView strAbilityView;
    public AbilityView intAbilityView;
    public AbilityView dexAbilityView;
    public AbilityView wisAbilityView;
    public AbilityView conAbilityView;
    public AbilityView chaAbilityView;
    public JLabel hpValueLabel;
    public JLabel abValueLabel;
    public JLabel acValueLabel;
    public JLabel dbValueLabel;
    public EquipmentView weaponEquipmentView;
    public EquipmentView shieldEquipmentView;
    public EquipmentView armorEquipmentView;
    public EquipmentView helmetEquipmentView;
    public EquipmentView ringEquipmentView;
    public EquipmentView beltEquipmentView;
    public EquipmentView bootsEquipmentView;


    private void initSubviews() {

        JPanel title = new JPanel();
        title.setSize(1000, 40);
        title.setLocation(0, 0);
        add(title);
        title.setBackground(new Color(0xf4f4f4));

        JButton back = new JButton("Back");
        back.setSize(60, 20);
        back.setLocation(10, 10);
        title.add(back);

        JLabel createItemLabel = new JLabel("Edit Character", JLabel.CENTER);
        createItemLabel.setSize(1000, 40);
        title.add(createItemLabel);

        JButton save = new JButton("Save");
        save.setSize(60, 20);
        save.setLocation(930, 10);
        title.add(save);

        JPanel desktop = new JPanel();
        desktop.setSize(1000, 540);
        desktop.setLocation(0, 40);
        add(desktop);

        JLabel level = new JLabel("Level", JLabel.RIGHT);
        level.setSize(120, 40);
        level.setLocation(20, 20);
        desktop.add(level);

        JTextField levelField = new JTextField();
        levelField.setSize(160,40);
        levelField.setLocation(150, 20);
        desktop.add(levelField);

        JButton setButton = new JButton("Set");
        setButton.setSize(100, 40);
        setButton.setLocation(320, 20);
        desktop.add(setButton);

        JButton geneButton = new JButton("Generate Ability Scores");
        geneButton.setSize(270, 40);
        geneButton.setLocation(150, 70);
        desktop.add(geneButton);

        /**
         * Player Panel
         */
        JPanel playerPanel = new JPanel();
        playerPanel.setSize(400, 420);
        playerPanel.setLocation(20, 120);
        desktop.add(playerPanel);

        JLabel label;
        AbilityView abilityView;
        EquipmentView equipmentView = new EquipmentView();
        Button button;

        label = new JLabel("Player", JLabel.CENTER);
        label.setSize(400, 20);
        label.setLocation(0, 0);
        playerPanel.add(label);
        label.setOpaque(true);
        label.setBackground(new Color(0xf4f4f4));
        JLabel titleBackground = new JLabel();
        titleBackground = label;

//        label = new JLabel("Player", JLabel.CENTER);
//        label.setSize(400, 20);
//        label.setLocation(0, 0);
//        playerPanel.add(label);
//        label.setBackground(new Color(0xf4f4f4));
//        JLabel titleLabel = new JLabel();
//        titleLabel = label;

        label = new JLabel();
        label.setSize(60, 20);
        label.setLocation(10, 30);
        playerPanel.add(label);
        label.setText("Name");
        JLabel nameLabel = new JLabel();
        nameLabel = label;

        label = new JLabel();
        label.setSize(90, 20);
        label.setLocation(80, 30);
        playerPanel.add(label);
        nameValueLabel = label;

        label = new JLabel();
        label.setSize(60, 20);
        label.setLocation(190, 30);
        playerPanel.add(label);
        label.setText("Level");
        JLabel levelLabel = new JLabel();
        levelLabel = label;

        label = new JLabel();
        label.setSize(40, 20);
        label.setLocation(260, 30);
        playerPanel.add(label);
        levelValueLabel = label;

        abilityView = new AbilityView();
        abilityView.setLocation(10, 60);
        playerPanel.add(abilityView);
        abilityView.nameLabel.setText(Player.ABILITY_STR);
        strAbilityView = abilityView;

        abilityView = new AbilityView();
        abilityView.setLocation(190, 60);
        playerPanel.add(abilityView);
        abilityView.nameLabel.setText(Player.ABILITY_INT);
        intAbilityView = abilityView;

        abilityView = new AbilityView();
        abilityView.setLocation(10, 90);
        playerPanel.add(abilityView);
        abilityView.nameLabel.setText(Player.ABILITY_DEX);
        dexAbilityView = abilityView;

        abilityView = new AbilityView();
        abilityView.setLocation(190, 90);
        playerPanel.add(abilityView);
        abilityView.nameLabel.setText(Player.ABILITY_WIS);
        wisAbilityView = abilityView;

        abilityView = new AbilityView();
        abilityView.setLocation(10, 120);
        playerPanel.add(abilityView);
        abilityView.nameLabel.setText(Player.ABILITY_CON);
        conAbilityView = abilityView;

        abilityView = new AbilityView();
        abilityView.setLocation(190, 120);
        playerPanel.add(abilityView);
        abilityView.nameLabel.setText(Player.ABILITY_CHA);
        chaAbilityView = abilityView;

        label = new JLabel();
        label.setSize(100, 20);
        label.setLocation(10, 150);
        playerPanel.add(label);
        label.setText("Hit Point");
        JLabel hpLabel = new JLabel();
        hpLabel = label;

        label = new JLabel();
        label.setSize(40, 20);
        label.setLocation(120, 150);
        playerPanel.add(label);
        hpValueLabel = label;

        label = new JLabel();
        label.setSize(100, 20);
        label.setLocation(190, 150);
        playerPanel.add(label);
        label.setText("Attack Bonus");
        JLabel abLabel = new JLabel();
        abLabel = label;

        label = new JLabel();
        label.setSize(40, 20);
        label.setLocation(300, 150);
        playerPanel.add(label);
        abValueLabel = label;

        label = new JLabel();
        label.setSize(100, 20);
        label.setLocation(10, 180);
        playerPanel.add(label);
        label.setText("Armor Class");
        JLabel acLabel = new JLabel();
        acLabel = label;

        label = new JLabel();
        label.setSize(40, 20);
        label.setLocation(120, 180);
        playerPanel.add(label);
        acValueLabel = label;

        label = new JLabel();
        label.setSize(100, 20);
        label.setLocation(190, 180);
        playerPanel.add(label);
        label.setText("Damage Bonus");
        JLabel dbLabel = new JLabel();
        dbLabel = label;

        label = new JLabel();
        label.setSize(40, 20);
        label.setLocation(300, 180);
        playerPanel.add(label);
        dbValueLabel = label;

        equipmentView = new EquipmentView();
        equipmentView.setLocation(10, 210);
        playerPanel.add(equipmentView);
        equipmentView.typeLabel.setText(Equipment.WEAPON);
        weaponEquipmentView = equipmentView;

        button = new Button("unequip");
        button.setSize(60, 20);
        button.setLocation(320, 210);
        playerPanel.add(button);
        Button unequipWeaponBotton = new Button();
        unequipWeaponBotton = button;

        equipmentView = new EquipmentView();
        equipmentView.setLocation(10, 240);
        playerPanel.add(equipmentView);
        equipmentView.typeLabel.setText(Equipment.SHIELD);
        shieldEquipmentView = equipmentView;

        button = new Button("unequip");
        button.setSize(60, 20);
        button.setLocation(320, 240);
        playerPanel.add(button);
        Button unequipShieldBotton = new Button();
        unequipShieldBotton = button;

        equipmentView = new EquipmentView();
        equipmentView.setLocation(10, 270);
        playerPanel.add(equipmentView);
        equipmentView.typeLabel.setText(Equipment.ARMOR);
        armorEquipmentView = equipmentView;

        button = new Button("unequip");
        button.setSize(60, 20);
        button.setLocation(320, 270);
        playerPanel.add(button);
        Button unequipArmorBotton = new Button();
        unequipArmorBotton = button;

        equipmentView = new EquipmentView();
        equipmentView.setLocation(10, 300);
        playerPanel.add(equipmentView);
        equipmentView.typeLabel.setText(Equipment.HELMET);
        helmetEquipmentView = equipmentView;

        button = new Button("unequip");
        button.setSize(60, 20);
        button.setLocation(320, 300);
        playerPanel.add(button);
        Button unequipHelmetBotton = new Button();
        unequipHelmetBotton = button;

        equipmentView = new EquipmentView();
        equipmentView.setLocation(10, 330);
        playerPanel.add(equipmentView);
        equipmentView.typeLabel.setText(Equipment.RING);
        ringEquipmentView = equipmentView;

        button = new Button("unequip");
        button.setSize(60, 20);
        button.setLocation(320, 330);
        playerPanel.add(button);
        Button unequipRingBotton = new Button();
        unequipRingBotton = button;

        equipmentView = new EquipmentView();
        equipmentView.setLocation(10, 360);
        playerPanel.add(equipmentView);
        equipmentView.typeLabel.setText(Equipment.BELT);
        beltEquipmentView = equipmentView;

        button = new Button("unequip");
        button.setSize(60, 20);
        button.setLocation(320, 360);
        playerPanel.add(button);
        Button unequipBeltBotton = new Button();
        unequipBeltBotton = button;

        equipmentView = new EquipmentView();
        equipmentView.setLocation(10, 390);
        playerPanel.add(equipmentView);
        equipmentView.typeLabel.setText(Equipment.BOOTS);
        bootsEquipmentView = equipmentView;

        button = new Button("unequip");
        button.setSize(60, 20);
        button.setLocation(320, 390);
        playerPanel.add(button);
        Button unequipBootsBotton = new Button();
        unequipBootsBotton = button;

        /**
         * BackPack Panel
         */
        JPanel backpackPanel = new JPanel();
        backpackPanel.setSize(460, 330);
        backpackPanel.setLocation(440, 300);

        label = new JLabel("Backpack", JLabel.CENTER);
        label.setSize(460, 20);
        label.setLocation(0, 0);
        label.setOpaque(true);
        label.setBackground(new Color(0xf4f4f4));
        backpackPanel.add(label);

        int x = 10;
        int y = 30;

//
//        java.util.List<Equipment> backpack;
//        backpack = player.equipmentsInBackpack();
//
//        for (Equipment equipment : backpack) {
//            equipmentView = new EquipmentView();
//            equipmentView.setLocation(x, y);
//            backpackPanel.add(equipmentView);
//            equipmentView.setEquipment(equipment);
//
//            JButton equipButton = new JButton("equip");
//            JButton dropButtton = new JButton("drop");
//
//            equipButton.setSize(60, 20);
//            equipButton.setLocation(310, y);
//            backpackPanel.add(equipButton);
//
//            dropButtton.setSize(60, 20);
//            dropButtton.setLocation(380, y);
//            backpackPanel.add(dropButtton);
//
//            y += 30;
//        }

        repaint();

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CharacterEditingScene.this.viewFlow.pop();
            }
        });
    }

//    public void dataToView() {
//        nameValueLabel.setText(player.getName());
//        levelValueLabel.setText(player.getLevel() + "");
//
//        strAbilityView.scoreLabel.setText(player.getAbilityScore(Player.ABILITY_STR) + "");
//        intAbilityView.scoreLabel.setText(player.getAbilityScore(Player.ABILITY_INT) + "");
//        dexAbilityView.scoreLabel.setText(player.getAbilityScore(Player.ABILITY_DEX) + "");
//        wisAbilityView.scoreLabel.setText(player.getAbilityScore(Player.ABILITY_WIS) + "");
//        conAbilityView.scoreLabel.setText(player.getAbilityScore(Player.ABILITY_CON) + "");
//        chaAbilityView.scoreLabel.setText(player.getAbilityScore(Player.ABILITY_CHA) + "");
//
//        hpValueLabel.setText(player.getHp() + "");
//        abValueLabel.setText(player.getAttackBonus() + "");
//        acValueLabel.setText(player.getArmorClass() + "");
//        dbValueLabel.setText(player.getDamageBonus() + "");
//
//        Equipment weapon = player.getEquipment(Equipment.WEAPON);
//        if (weapon != null) {
//            weaponEquipmentView.setEquipment(weapon);
//        }
//
//        Equipment shield = player.getEquipment(Equipment.SHIELD);
//        if (shield != null) {
//            shieldEquipmentView.setEquipment(shield);
//        }
//
//        Equipment armor = player.getEquipment(Equipment.ARMOR);
//        if (armor != null) {
//            armorEquipmentView.setEquipment(armor);
//        }
//
//        Equipment helmet = player.getEquipment(Equipment.HELMET);
//        if (helmet != null) {
//            helmetEquipmentView.setEquipment(helmet);
//        }
//
//        Equipment ring = player.getEquipment(Equipment.RING);
//        if (ring != null) {
//            ringEquipmentView.setEquipment(ring);
//        }
//
//        Equipment belt = player.getEquipment(Equipment.BELT);
//        if (belt != null) {
//            beltEquipmentView.setEquipment(belt);
//        }
//
//        Equipment boots = player.getEquipment(Equipment.BOOTS);
//        if (boots != null) {
//            bootsEquipmentView.setEquipment(boots);
//        }
//    }
}

