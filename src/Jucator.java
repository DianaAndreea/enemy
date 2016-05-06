import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;


public class Jucator {
    int x,dx,y;
    Image still;
    
    public Jucator(){
        ImageIcon i=new ImageIcon("res/dog.png");
        still=i.getImage();
        x=10;
        y=500;
        
    }
    
    public Rectangle getBounds(){
        return new Rectangle(x,y,128,128);
    }
    
    public void move(){
        if((x+dx)>10 && (x+dx)<680){
            x=x+dx;
        }
       
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    public Image getImage(){
        return still;
    }
    
    public void keyPressed(KeyEvent e){
        int key=e.getKeyCode();
        
        if(key == KeyEvent.VK_LEFT){
            dx=-3;
                }
        if(key == KeyEvent.VK_RIGHT){
            dx=3;
                }
    }
        public void keyReleased(KeyEvent e){
        int key=e.getKeyCode();
        
        if(key == KeyEvent.VK_LEFT)
            dx=0;
        
        if(key == KeyEvent.VK_RIGHT)
            dx=0;
    }
}
