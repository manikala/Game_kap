package catch_the_drop;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private static GameWindow game_window;

    public static void main(String[] args) {
        game_window = new GameWindow();
        game_window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game_window.setLocation(200, 100);
        game_window.setSize(906,478);
        game_window.setResizable(false);
        game_window.setVisible(true);

    }

    private static void onRepaint(Graphics g){

    }


    private static class GameField extends JPanel {


    }

}

