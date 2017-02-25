package ui;

import game.Equipment;
import game.Player;
import game.Simulation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

/**
 * Created by thereaghostflash on 2017-02-25.
 */
public class EquipmentSelectorPanel extends JPanel {
    private Player player = Simulation.newPlayer();
    public EquipmentSelectorPanel() {
        setSize(520,170);
        setLayout(null);
        initSubviews();

    }


    public void initSubviews(){
        JLabel title = new JLabel("Character");
        title.setLocation(0,0);
        title.setSize(520,20);
        title.setBackground(new Color(244,244,244));
        this.add(title);

        JLabel itemName = new JLabel("Item");
        itemName.setLocation(10,30);
        itemName.setSize(120,40);
        itemName.setBackground(new Color(236,245,248));
        this.add(itemName);

        final TextField textField = new TextField();
        textField.setLocation(140,30);
        textField.setSize(160,40);
        this.add(textField);

        JButton search = new JButton();
        search.setText("Search");
        search.setLocation(310,30);
        search.setSize(100,40);
        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                List<Equipment> list = player.equipmentsInBackpack();
                int number = 0;
                int yOfView = 80;
                int xOfView = 140;
                for (Equipment equipment : list){
                    if (equipment.getName().equals(textField.getText()) && number < 3){
                        EquipmentView equipmentView = new EquipmentView();
                        equipmentView.setLocation(xOfView,yOfView);
                        JButton addButton = new JButton("Add");
                        addButton.setLocation(450,yOfView);
                        addButton.setSize(60,20);
                        EquipmentSelectorPanel.this.add(equipmentView);
                        EquipmentSelectorPanel.this.add(addButton);
                        
                        number++;
                        yOfView += 30;

                    }
                }

            }
        });

    }

}
