import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by samuel_wolff on 3/15/17.
 */
public class Main extends JPanel{
    public static final int FRAMEWIDTH = 1000, FRAMEHEIGHT = 600;
    private Timer timer;
    private String key= " ";
    private String keyType="None";
    private boolean menu;
    public Main() {
        timer = new Timer(40, new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {




                addKeyListener(new KeyListener() {
                    public void keyTyped(KeyEvent keyEvent) {

                    }

                    public void keyPressed(KeyEvent keyEvent) {

                    }

                    public void keyReleased(KeyEvent keyEvent) {

                    }
                });
                addMouseListener(new MouseListener() {
                    public void mouseClicked(MouseEvent mouseEvent) {

                    }

                    public void mousePressed(MouseEvent mouseEvent) {

                    }

                    public void mouseReleased(MouseEvent mouseEvent) {

                    }

                    public void mouseEntered(MouseEvent mouseEvent) {

                    }

                    public void mouseExited(MouseEvent mouseEvent) {

                    }
                });


                repaint();
            }
        });

        timer.start();
        }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }


    public static void main(String[] args) {
        JFrame window = new JFrame("Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(0, 0, FRAMEWIDTH, FRAMEHEIGHT + 22); //(x, y, w, h) 20 due to title bar.

        Main panel = new Main();
        panel.setSize(FRAMEWIDTH, FRAMEHEIGHT);

        //panel.setFocusable(true);
        panel.grabFocus();


        window.add(panel);

        window.setVisible(true);
        window.setResizable(false);

    }

}
