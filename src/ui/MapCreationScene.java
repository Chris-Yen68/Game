package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Penelope on 17/2/24.
 */
public class MapCreationScene extends View {
    public MapCreationScene() {
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

        JLabel createMapLabel = new JLabel("Create Map", JLabel.CENTER);
        createMapLabel.setSize(1000, 40);
        title.add(createMapLabel);

        JPanel desktop = new JPanel();
        desktop.setSize(1000, 540);
        desktop.setLocation(0, 40);
        add(desktop);

        JLabel nameLabel = new JLabel("Name", JLabel.RIGHT);
        nameLabel.setSize(120, 40);
        nameLabel.setLocation(20, 20);
        desktop.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setSize(160, 40);
        nameField.setLocation(150, 20);
        desktop.add(nameField);

        JLabel sizeLabel = new JLabel("Size", JLabel.RIGHT);
        sizeLabel.setSize(120, 40);
        sizeLabel.setLocation(20, 70);
        desktop.add(sizeLabel);

        JLabel sizeSet = new JLabel("4 x 4");
        sizeSet.setSize(200, 40);
        sizeSet.setLocation(150, 70);
        desktop.add(sizeSet);

        JButton smallSize = new JButton("4 x 4");
        smallSize.setSize(100, 40);
        smallSize.setLocation(150, 120);
        desktop.add(smallSize);

        JButton mediumSize = new JButton("8 x 8");
        mediumSize.setSize(100, 40);
        mediumSize.setLocation(260, 120);
        desktop.add(mediumSize);

        JButton largeSize = new JButton("12 x 12");
        largeSize.setSize(100, 40);
        largeSize.setLocation(370, 120);
        desktop.add(largeSize);

        JButton create = new JButton("Create");
        create.setSize(160, 40);
        create.setLocation(150, 190);
        desktop.add(create);

        repaint();

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MapCreationScene.this.viewFlow.pop();
            }
        });
    }
}
