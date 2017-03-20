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
    private Sprite ship = new Starship(500,300);
    private int menuLevel=1;
    private int boxLength=200;
    public Main() {
        timer = new Timer(40, new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if (!menu) {
                    menuLevel = 0;
                    ship.update();
                }


                repaint();
            }
        });

        timer.start();

        addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent keyEvent) {System.out.println("ye");

                int code = keyEvent.getKeyChar();

                if (!menu) {
                    if (code == 'w') {
                        System.out.println("it works!");
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
                // System.out.println("X:"+mouseEvent.getX()+" Y:" +mouseEvent.getY());
                if (menuLevel == 1) {
                    if (mouseEvent.getX() > 455 && mouseEvent.getX() < 850 &&
                            mouseEvent.getY() > 195 && mouseEvent.getY() < 260) {
                        menuLevel = 2;
                    }
                    if (mouseEvent.getX() > 455 && mouseEvent.getX() < 580 &&
                            mouseEvent.getY() > 302 && mouseEvent.getY() < 365) {
                        menu = false;
                    }
                }
                if (menuLevel == 2) {
                    if (mouseEvent.getX() > 55 && mouseEvent.getX() < 170 &&
                            mouseEvent.getY() > 13 && mouseEvent.getY() < 52) {
                        menuLevel = 1;
                    }

                }


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
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        if(!menu){
            g2.setColor(black);
            g2.fillRect(0,0,1000,600);
            ship.draw(g2);
        }
        if(menu){
            if(menuLevel==1) {
                g2.setColor(black);
                g2.fillRect(0, 0, 1000, 600);
                g2.setColor(Color.white);
                g2.setFont(new Font("Comic Sans MS", Font.BOLD, 68));
                g2.drawString("Dodge", 450, 150);
                g2.drawString("Play", 450, 350);
                g2.drawString("Select Ship", 450, 250);
            }
            if(menuLevel==2){
                g2.setColor(black);
                g2.fillRect(0, 0, 1000, 600);
                g2.setColor(Color.white);
                g2.setFont(new Font("Comic Sans MS", Font.BOLD, 48));
                g2.drawString("Menu",50,50);
                for (int i = 0; i < 5; i++) {
                    g2.drawLine(140+(i*boxLength),160,140+(i*boxLength),160+boxLength);
                    g2.drawLine(140+(i*boxLength),160+boxLength,140+(i*boxLength),160+(boxLength*2));
                }
                for (int i = 0; i < 4; i++) {
                    g2.drawLine(140,160,140+((i+1)*boxLength),160);
                    g2.drawLine(140,160+boxLength,140+((i+1)*boxLength),160+boxLength);
                    g2.drawLine(140,160+(boxLength*2),140+((i+1)*boxLength),160+(boxLength*2));

                }
            }

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
