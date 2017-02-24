package game;

import ui.EquipmentView;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by Saki on 2017/2/24.
 */
public class BackpackPanel extends JPanel{

    public BackpackPanel(){
        this.setLayout(null);
        this.setSize(460, 330);

        initSubviews();
    }

    private void initSubviews(){
        Label label = new Label("Backpack");
        label.setSize(460, 20);
        label.setLocation(0, 0);
        this.add(label);

        int x = 10;
        int y = 30;

        Player player = new Player();
        List<Equipment> backpack;
        backpack = player.equipmentsInBackpack();

        for (Equipment equipment : backpack) {
            EquipmentView equipmentView = new EquipmentView();
            equipmentView.setLocation(x, y);
            this.add(equipmentView);
            equipmentView.setEquipment(equipment);

            Button equipButton = new Button();
            Button dropButtton = new Button();

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
