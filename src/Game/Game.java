package Game;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable{

    private JFrame frame;

    private final int WIDTH = 160;
    private final int HEIGHT = 120;
    private final int SCALE = 4;


    public Game(){
        this.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        frame = new JFrame("graphics with java");
        frame.add(this);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        Game game = new Game();
    }

    public void run(){

    }
}
