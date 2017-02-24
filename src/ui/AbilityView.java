package ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kai QI on 2017/2/24.
 */
public class AbilityView extends JPanel {

    public Label nameLabel;
    public Label scoreLabel;
    public Label modifierLabel;

    public AbilityView() {
        this.setLayout(null);
        this.setSize(160, 20);

        initSubviews();
    }

    private void initSubviews(){

        Label label;

        label = new Label();
        label.setSize(60, 20);
        label.setLocation(0, 0);
        add(label);
        nameLabel = label;

        label = new Label();
        label.setSize(40, 20);
        label.setLocation(70, 0);
        add(label);
        scoreLabel = label;

        label = new Label();
        label.setSize(40, 20);
        label.setLocation(120, 0);
        add(label);
        modifierLabel = label;



    }
}
