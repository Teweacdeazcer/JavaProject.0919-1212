
package _gui.controller;
import _gui.view.OrderInfoView;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public static int FRAME_X = 500;
    public static int FRAME_Y = 400;
    public static final int FRAME_WIDTH = 700;
    public static final int FRAME_HEIGHT = 500;

    public MainFrame() {
        super("검색프로그램");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimension = tk.getScreenSize();
        double sw = dimension.getWidth();
        double sh = dimension.getHeight();

        FRAME_X = (int)((0.5)*(sw - FRAME_WIDTH));
        FRAME_Y = (int)((0.5)*(sh - FRAME_HEIGHT));

        OrderInfoView orderInfoView = new OrderInfoView();
        add(orderInfoView,"Center");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(FRAME_X,FRAME_Y);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}