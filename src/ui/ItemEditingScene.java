package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by GU_HAN on 2017-02-24.
 * @auther Guangbi Zhang
 */
public class ItemEditingScene extends JFrame {

    private JLabel typeLabel;
    private JLabel enhanceOnLabel;

    public ItemEditingScene() {
        initSubviews();
    }

    private void initSubviews(){
        this.setLayout(null);

        /*
         * First Line
         */

        JLabel label;
        JButton button;
        TextField textField;

        label = new JLabel();
        label.setSize(1000, 40);
        label.setLocation(0, 0);
        label.setText("Edit Item");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBackground(new Color(0x92A99C));
        label.setOpaque(true);
        this.add(label);

        button = new JButton();
        button.setSize(60, 20);
        button.setLocation(10, 10);
        button.setText("Back");
        label.add(button);

        button = new JButton();
        button.setSize(60, 20);
        button.setLocation(930, 10);
        button.setText("Save");
        label.add(button);

        /*
         * 4 Stable Label
         */

        label = new JLabel();
        label.setSize(120, 40);
        label.setOpaque(true);
        label.setBackground(new Color(0xAED6F1));
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setLocation(20, 60);
        label.setText("Name");
        this.add(label);

        label = new JLabel();
        label.setSize(120, 40);
        label.setOpaque(true);
        label.setBackground(new Color(0xAED6F1));
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setLocation(20, 110);
        label.setText("Type");
        this.add(label);

        label = new JLabel();
        label.setSize(120, 40);
        label.setOpaque(true);
        label.setBackground(new Color(0xAED6F1));
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setLocation(20, 210);
        label.setText("Enhance On");
        this.add(label);

        label = new JLabel();
        label.setSize(120, 40);
        label.setOpaque(true);
        label.setBackground(new Color(0xAED6F1));
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setLocation(20, 410);
        label.setText("Value");
        this.add(label);

        /*
         * 3 Dynamic Outprint
         */

        label = new JLabel();
        label.setSize(200, 40);
        label.setOpaque(true);
        label.setBackground(new Color(0xAED6F1));
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setLocation(150, 60);
        label.setText("The Sword Of Light");
        this.add(label);

        label = new JLabel();
        label.setSize(200, 40);
        label.setOpaque(true);
        label.setBackground(new Color(0xAED6F1));
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setLocation(150, 110);
        typeLabel = label;
        label.setText("Weapon");
        this.add(label);

        label = new JLabel();
        label.setSize(200, 40);
        label.setOpaque(true);
        label.setBackground(new Color(0xAED6F1));
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setLocation(150, 210);
        enhanceOnLabel = label;
        label.setText("None");
        this.add(label);

        /*
         * 7 Choices of Type
         */

        button = new JButton();
        button.setSize(100, 40);
        button.setLocation(150, 160);
        button.setText("Weapon");
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                typeLabel.setText("Weapon");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(button);

        button = new JButton();
        button.setSize(100, 40);
        button.setLocation(260, 160);
        button.setText("Shield");
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                typeLabel.setText("Shield");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(button);

        button = new JButton();
        button.setSize(100, 40);
        button.setLocation(370, 160);
        button.setText("Armor");
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                typeLabel.setText("Armor");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(button);

        button = new JButton();
        button.setSize(100, 40);
        button.setLocation(480, 160);
        button.setText("Helmet");
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                typeLabel.setText("Helmet");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(button);

        button = new JButton();
        button.setSize(100, 40);
        button.setLocation(590, 160);
        button.setText("Ring");
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                typeLabel.setText("Ring");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(button);

        button = new JButton();
        button.setSize(100, 40);
        button.setLocation(700, 160);
        button.setText("Bell");
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                typeLabel.setText("Bell");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(button);

        button = new JButton();
        button.setSize(100, 40);
        button.setLocation(810, 160);
        button.setText("Boots");
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                typeLabel.setText("Boots");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(button);

        /*
         * 7 Choices of Enhance on
         */

        button = new JButton();
        button.setSize(100, 40);
        button.setLocation(150, 260);
        button.setText("None");
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                enhanceOnLabel.setText("None");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(button);

        button = new JButton();
        button.setSize(100, 40);
        button.setLocation(150, 310);
        button.setText("Str");
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                enhanceOnLabel.setText("Str");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(button);

        button = new JButton();
        button.setSize(100, 40);
        button.setLocation(260, 310);
        button.setText("Dex");
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                enhanceOnLabel.setText("Dex");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(button);

        button = new JButton();
        button.setSize(100, 40);
        button.setLocation(370, 310);
        button.setText("Con");
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                enhanceOnLabel.setText("Con");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(button);

        button = new JButton();
        button.setSize(100, 40);
        button.setLocation(480, 310);
        button.setText("Int");
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                enhanceOnLabel.setText("Int");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(button);

        button = new JButton();
        button.setSize(100, 40);
        button.setLocation(590, 310);
        button.setText("Wis");
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                enhanceOnLabel.setText("Wis");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(button);

        button = new JButton();
        button.setSize(100, 40);
        button.setLocation(700, 310);
        button.setText("Cha");
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                enhanceOnLabel.setText("Cha");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(button);

        /*
         * 3 Value of Choose
         */

        label = new JLabel();
        label.setSize(210, 40);
        label.setOpaque(true);
        label.setBackground(new Color(0xAED6F1));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setLocation(150, 360);
        label.setText("Armor Class");
        this.add(label);

        label = new JLabel();
        label.setSize(210, 40);
        label.setOpaque(true);
        label.setBackground(new Color(0xAED6F1));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setLocation(370, 360);
        label.setText("Attack Bonus");
        this.add(label);

        label = new JLabel();
        label.setSize(210, 40);
        label.setOpaque(true);
        label.setBackground(new Color(0xAED6F1));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setLocation(590, 360);
        label.setText("Damage Bonus");
        this.add(label);

        /*
         * TextFile
         */

        textField = new TextField();
        textField.setSize(160, 40);
        textField.setLocation(150, 410);
        this.add(textField);

        /*
         * Validate button
         */

        button = new JButton();
        button.setSize(160, 40);
        button.setLocation(150, 490);
        button.setText("Validate");
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        add(button);

        repaint();
    }

}
