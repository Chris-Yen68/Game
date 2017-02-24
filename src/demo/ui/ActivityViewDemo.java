package demo.ui;

import ui.AbilityView;

import javax.swing.*;

/**
 * Created by Saki on 2017/2/24.
 */
public class ActivityViewDemo extends JFrame{
    public static void main(String[] args) {
        ActivityViewDemo window = new ActivityViewDemo();
        window.setSize(200, 50);
        window.setVisible(true);
    }

    public ActivityViewDemo() {
        AbilityView abilityView = new AbilityView();
        this.add(abilityView);

        abilityView.nameLabel.setText("HAHAHA");
        abilityView.scoreLabel.setText("HAHAHA");
        abilityView.modifierLabel.setText("HAHAHA");
    }
}
