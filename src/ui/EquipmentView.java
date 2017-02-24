package ui;

import game.Equipment;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Saki on 2017/2/24.
 */
public class EquipmentView extends JPanel {

    private Equipment equipment;

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
        dataToView();
    }

    private Label typeLabel;
    private Label nameLabel;
    private Label enhanceLabel;

    public EquipmentView(){
        this.setLayout(null);
        this.setSize(300, 20);

        initSubviews();
    }

    private void initSubviews(){

        Label label = new Label();

        label = new Label();
        label.setSize(60, 20);
        label.setLocation(0, 0);
        add(label);
        typeLabel = label;

        label = new Label();
        label.setSize(160, 20);
        label.setLocation(70, 0);
        add(label);
        nameLabel = label;

        label = new Label();
        label.setSize(60, 20);
        label.setLocation(240, 0);
        add(label);
        enhanceLabel = label;
    }

    private void dataToView(){
        typeLabel.setText(equipment.getType());
        nameLabel.setText(equipment.getName());

        String valueString = TextDisplay.signedNumber(equipment.getEnhancedValue());
        String attributeString = equipment.getEnhancedAttribute();
        enhanceLabel.setText(valueString + " " + attributeString);

    }
}
