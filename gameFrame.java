package snakeGameProject;

import javax.swing.*;

public class gameFrame extends JFrame {
    // constructor
    gameFrame(){

        // gamePanel panel = new gamePanel();
        //  this.add(panel);

        // the shortcut for above commented code is:
        this.add(new gamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.pack(); // pack everything inside frame
        this.setVisible(true);
        this.setLocationRelativeTo(null); // show frame at center
    }
}
