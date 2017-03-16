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
    private boolean menu=true;
    private int shipSpeed=5;
    private Color black = new Color(0,0,0);
    private Color white = new Color(255,255,255);
    private Color red = new Color(255, 30, 26);
    Sprite ship = new Starship(500,300);
    public Main() {
        timer = new Timer(40, new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if(!menu){
                    ship.update();
                }




                addKeyListener(new KeyListener() {
                    public void keyTyped(KeyEvent keyEvent) {
                        int code= keyEvent.getKeyCode();
                        if(!menu) {
                            if (code == 'w') {
                                ship.setLoc(new Point(ship.getLoc().x, ship.getLoc().y - shipSpeed));
                            }
                            if (code == 's') {
                                ship.setLoc(new Point(ship.getLoc().x, ship.getLoc().y + shipSpeed));
                            }
                            if (code == 'a') {
                                ship.setLoc(new Point(ship.getLoc().x - shipSpeed, ship.getLoc().y));
                            }
                            if (code == 'd') {
                                ship.setLoc(new Point(ship.getLoc().x + shipSpeed, ship.getLoc().y));
                            }
                        }
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
        Graphics2D g2 = (Graphics2D)g;
        if(!menu){
            ship.draw(g2);
        }
        if(menu){
            g2.setColor(black);
            g2.fillRect(0,0,1000,600);
            g2.setColor(Color.white);
            g2.setFont( new Font("Comic Sans MS", Font.BOLD ,48));
            g2.drawString("Dodge",450,150);
            g2.fillRect(445,220,200,100);
            g2.setColor(black);
            g2.drawString("Play",450,225);


        }


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
