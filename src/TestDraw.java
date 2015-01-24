/**
 * Created by john.whites on 1/24/2015.
 */

import javax.swing.*;

public class TestDraw {

    public static void main(String[] args)
    {
        DrawPanel panel = new DrawPanel();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300,300);
        app.setVisible(true);
    }

}
