package ui;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Penelope on 17/2/24.
 */
public class ViewFlow extends View {

    public ViewFlow() {
        this.setLayout(null);
        this.setSize(1000, 600);
        contentViews = new ArrayList<View>();
    }

    private List<View> contentViews;

    public void push(View view) {
        if (contentViews.size() > 0) {
//            contentViews.get(contentViews.size() - 1).setVisible(false);
        }

        contentViews.add(view);
        view.setViewFlow(this);
        view.setSize(this.getSize());
        this.add(view);
        view.viewDidDisplay();

    }

    public void pop() {
        if (contentViews.size() > 0) {
            View view = contentViews.get(contentViews.size() - 1);
            this.remove(view);
            contentViews.remove(view);
//            contentViews.get(contentViews.size() - 1).setVisible(true);
        }

        if (contentViews.size() > 0) {
            View view = contentViews.get(contentViews.size() - 1);
            view.viewDidDisplay();
        }

    }
}