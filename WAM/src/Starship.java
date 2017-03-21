/**
 * Created by samuel_wolff on 3/16/17.
 */
public class Starship extends Sprite {
    public Starship(int x, int y, int z){
        super(x,y,NORTH);

        int zs= z;


        //takes in user imputed ship and sets it to the correct one
        if(zs==1){
            this.setPic("Spaceship1.png", NORTH);
        }
        if(zs==2){
            this.setPic("Spaceship2.png", NORTH);
        }
        if(zs==3){
            this.setPic("Spaceship3.png", NORTH);
        }
        if(zs==4){
            this.setPic("Spaceship4.png", NORTH);
        }
        if(zs==5){
            this.setPic("Spaceship5.png", NORTH);
        }
        if(zs==6){
            this.setPic("Spaceship6.png", NORTH);
        }
        if(zs==7){
            this.setPic("Spaceship7.png", NORTH);
        }
        if(zs==8){
            this.setPic("Spaceship8.png", NORTH);
        }






    }
    public void update(){

    }




}
