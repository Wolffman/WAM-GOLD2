import javax.swing.*;

/**
 * Created by samuel_wolff on 3/15/17.
 */
public class Main extends JPanel{
    public static final int FRAMEWIDTH = 1000, FRAMEHEIGHT = 600;
    private int one=1;
//adsfaolhf

    public static void main(String[] args) {
        System.out.println("yee!!!");
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
