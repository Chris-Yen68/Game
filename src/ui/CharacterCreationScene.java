package ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Penelope on 17/2/24.
 */
public class CharacterCreationScene  extends JFrame {
    public static void main(String[] args) {
        new ItemCreationScene();
    }

    public CharacterCreationScene() {
        initSubviews();
    }

    public void initSubviews() {
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setVisible(true);

        JPanel title = new JPanel();
        title.setSize(1000, 40);
        title.setLocation(0, 0);
        add(title);
        title.setBackground(new Color(0xf4f4f4));

        JButton back = new JButton("Back");
        back.setSize(60, 20);
        back.setLocation(10, 10);
        title.add(back);

        JLabel createCharaLabel = new JLabel("Create Character", JLabel.CENTER);
        createCharaLabel.setSize(1000, 40);
//        editorLabel.setLocation(0, 0);
        title.add(createCharaLabel);

        JPanel desktop = new JPanel();
        desktop.setSize(1000, 540);
        desktop.setLocation(0, 40);
        add(desktop);

        JLabel nameLabel = new JLabel("Name", JLabel.RIGHT);
        nameLabel.setSize(120, 40);
        nameLabel.setLocation(20, 20);
        desktop.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setSize(160,40);
        nameField.setLocation(150, 20);
        desktop.add(nameField);

        JButton createButton = new JButton("Create");
        createButton.setSize(160, 40);
        createButton.setLocation(150, 90);
        desktop.add(createButton);

        repaint();
    }
}
