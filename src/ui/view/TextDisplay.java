package ui.view;

/**
 * Created by Saki on 2017/2/24.
 */
public class TextDisplay {
    public static String signedNumber(int value){
        return value < 0 ? "" + value : "+" + value;
    }
}
