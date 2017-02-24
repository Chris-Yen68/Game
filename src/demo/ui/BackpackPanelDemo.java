package demo.ui;

import game.BackpackPanel;

import javax.swing.*;

/**
 * Created by Saki on 2017/2/24.
 */
public class BackpackPanelDemo extends JFrame{
    public static void main(String[] args) {
        BackpackPanelDemo window = new BackpackPanelDemo();
        window.setSize(500, 400);
        window.setLayout(null);
        window.setVisible(true);
    }

    public BackpackPanelDemo(){
        BackpackPanel backpackPanel = new BackpackPanel();
        backpackPanel.setLocation(0, 20);
        this.add(backpackPanel);
    }
}
