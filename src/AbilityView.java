import javax.swing.*;
import java.awt.*;

/**
 * Created by Kai QI on 2017/2/24.
 */
public class AbilityView extends JPanel {

    public Label nameLabel;
    public Label scoreLabel;

    public AbilityView() {
        initSubviews();
    }

    public void initSubviews(){

        nameLabel = new Label();
        nameLabel.setSize(60);
        nameLabel.setLocation();
        add(nameLabel);

        scoreLabel = new Label();
        scoreLabel.setSize();
        scoreLabel.setLocation();
        add(scoreLabel);


        AbilityView abilityView = new AbilityView();


    }
}
