package ui;

import javax.swing.*;

/**
 * Created by Penelope on 17/2/24.
 */
public class Demo {
    public static void main(String[] args) {
        ViewFlow viewFlow = new ViewFlow();
        new Window(viewFlow);
        viewFlow.push(new MainScene());
    }
}
