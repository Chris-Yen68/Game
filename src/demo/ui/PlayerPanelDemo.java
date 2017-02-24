package demo.ui;

import game.Player;
import game.Simulation;
import ui.PlayerPanel;

import javax.swing.*;

/**
 * Created by Kai QI on 2017/2/24.
 */
public class PlayerPanelDemo extends JFrame {
    public static void main(String[] args) {
        PlayerPanelDemo window = new PlayerPanelDemo();
        window.setSize(200, 50);
        window.setLayout(null);
        window.setVisible(true);
    }
    public PlayerPanelDemo(){
        PlayerPanel playerPanel = new PlayerPanel();
        this.add(playerPanel);

        playerPanel.setPlayer(Simulation.newPlayer());
    }
}