/**
 * Created by zachary_goldstein on 3/21/17.
 */
public class Fire extends Starship {
    public Fire(int x, int y, int z) {
        super(x, y, z);

        int zs = z;


        //takes in user imputed ship and sets it to the correct one with correct fire

        //sets ship one as default if not picked otherwise, and fire one as defualt
        if (zs == 0 || zs == 1) {
            this.setPic("Fire1.png", NORTH);
        }
        if (zs == 2) {
            this.setPic("Fire2.png", NORTH);
        }
        if (zs == 3) {
            this.setPic("Fire3.png", NORTH);
        }
        if (zs == 4) {
            this.setPic("Fire4.png", NORTH);
        }
        if (zs == 5) {
            this.setPic("Fire5.png", NORTH);
        }
        if (zs == 6) {
            this.setPic("Fire6.png", NORTH);
        }
        if (zs == 7) {
            this.setPic("Fire7.png", NORTH);
        }
        if (zs == 8) {
            this.setPic("Fire8.png", NORTH);
        }
    }


    public void update(){

    }
}
