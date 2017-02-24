package ui;

import game.Equipment;
import game.Player;
import game.Simulation;
import ui.EquipmentView;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by Saki on 2017/2/24.
 */
public class BackpackPanel extends JPanel{
    private Player player = Simulation.newPlayer();

    public BackpackPanel(){
        this.setLayout(null);
        this.setSize(460, 330);

        initSubviews();
    }

    private void initSubviews(){
        JLabel label = new JLabel("Backpack");
        label.setSize(460, 20);
        label.setLocation(0, 0);
        this.add(label);

        int x = 10;
        int y = 30;


        List<Equipment> backpack;
        backpack = player.equipmentsInBackpack();

        for (Equipment equipment : backpack) {
            EquipmentView equipmentView = new EquipmentView();
            equipmentView.setLocation(x, y);
            this.add(equipmentView);
            equipmentView.setEquipment(equipment);

            JButton equipButton = new JButton("equip");
            JButton dropButtton = new JButton("drop");

            equipButton.setSize(60, 20);
            equipButton.setLocation(310, y);
            this.add(equipButton);

            dropButtton.setSize(60, 20);
            dropButtton.setLocation(380, y);
            this.add(dropButtton);

            y += 30;
        }
    }
}
