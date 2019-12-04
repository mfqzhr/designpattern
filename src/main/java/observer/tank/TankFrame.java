package observer.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author 穆繁强
 * @date 2019/12/3
 */
public class TankFrame extends Frame {
    public final static int GAME_WIDTH = 800;
    public final static int GAME_HEIGHT = 600;
    Image offScreenImage = null;


    public TankFrame() {
        setSize(GAME_WIDTH, GAME_HEIGHT);
        setResizable(false);
        setTitle("tank war");
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);

            }
        });
    }

    @Override
    public void paint(Graphics g) {

    }


    @Override
    public void update(Graphics g) {
        if (offScreenImage == null) {

            offScreenImage = this.createImage(GAME_WIDTH, GAME_HEIGHT);

        }

        Graphics gOffScreen = offScreenImage.getGraphics();

        Color c = gOffScreen.getColor();

        gOffScreen.setColor(Color.BLACK);

        gOffScreen.fillRect(0, 0, GAME_WIDTH, GAME_HEIGHT);

        gOffScreen.setColor(c);

        paint(gOffScreen);

        g.drawImage(offScreenImage, 0, 0, null);
    }

}
