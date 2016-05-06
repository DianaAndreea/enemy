import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.ImageIcon;

public class Bombe {
    
    Image img;
    int x,y;
    boolean isAlive=true;
    
    public Bombe(int startX, int startY, String location){
        x=startX;
        y=startY;
        ImageIcon l=new ImageIcon(location);
        img=l.getImage();
    }
    
    public Rectangle getBounds(){
        return new Rectangle(x,y,51,130);
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public boolean Alive(){
        return isAlive;
    }
    public Image getImage(){
        return img;
    }
    
    public void move(){
        y=y+3;
        if(y==640){
            x=(x+Random(700))%680;
            y=-110;
        }
    }
    public int Random(int ra){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(ra);
        return randomInt;
}
}
