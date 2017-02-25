package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Penelope on 17/2/24.
 */
public class CharacterEditingScene extends View {
    public CharacterEditingScene() {
        setLayout(null);
        setSize(1000, 600);

        initSubviews();
    }

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

        repaint();

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CharacterEditingScene.this.viewFlow.pop();
            }
        });
    }
}
