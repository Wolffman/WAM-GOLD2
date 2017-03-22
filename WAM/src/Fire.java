import java.awt.*;

/**
 * Created by zachary_goldstein on 3/21/17.
 */
public class Fire extends Sprite{
    public Fire( Starship ship) {



        int zs = ship.getZs();


        //takes in user imputed ship and sets it to the correct one with correct fire

        //sets ship one as default if not picked otherwise, and fire one as defualt


        if (zs == 0 || zs == 1) {
            this.setPic("Fire1.png", EAST);
            Point shipLoc = ship.getLoc();
            this.setLoc(new Point(shipLoc.x + 10,shipLoc.y + 95));
        }
        if (zs == 2) {
            this.setPic("Fire2.png", EAST);
            Point shipLoc = ship.getLoc();
            this.setLoc(new Point(shipLoc.x ,shipLoc.y + 105));
        }
        if (zs == 3) {
            this.setPic("Fire3.png", EAST);
            Point shipLoc = ship.getLoc();
            this.setLoc(new Point(shipLoc.x + 65,shipLoc.y + 132));
        }
        if (zs == 4) {
            this.setPic("Fire4.png", EAST);
            Point shipLoc = ship.getLoc();
            this.setLoc(new Point(shipLoc.x + 65,shipLoc.y + 150));
        }
        if (zs == 5) {
            this.setPic("Fire5.png", EAST);
            Point shipLoc = ship.getLoc();
            this.setLoc(new Point(shipLoc.x + 65,shipLoc.y + 170));
        }
        if (zs == 6) {
            this.setPic("Fire6.png", EAST);
            Point shipLoc = ship.getLoc();
            this.setLoc(new Point(shipLoc.x + 33,shipLoc.y + 135));
        }
        if (zs == 7) {
            this.setPic("Fire7.png", EAST);
            Point shipLoc = ship.getLoc();
            this.setLoc(new Point(shipLoc.x + 5,shipLoc.y + 105));
        }
        if (zs == 8) {
            this.setPic("Fire8.png", EAST);
            Point shipLoc = ship.getLoc();
            this.setLoc(new Point(shipLoc.x + 40,shipLoc.y + 85));
        }
    }


    public void update(){

    }
}
