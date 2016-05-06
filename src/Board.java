import java.awt.Image;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;


public class Board extends JPanel implements ActionListener{
    Jucator j;
    Image img;
    Timer time;
    Bombe b,b1,b2;
    
    boolean lost=false;
    
    public Board(){
        j=new Jucator();
        addKeyListener(new AL());
        setFocusable(true);
        ImageIcon i= new ImageIcon("res/for2.png");
        img=i.getImage();
        time=new Timer(5,this);
        time.start();
        b=new Bombe(Random(700),-110,"res/dragon.png");
        b1=new Bombe(Random(300),-110,"res/dragon.png");
        b2=new Bombe(Random(100),-110,"res/dragon.png");
        
    }
    public void actionPerformed(ActionEvent e){
        CheckCollisions();
        j.move();
        b.move();
        b1.move();
        b2.move();
        repaint();
    }
    public void CheckCollisions(){
        Rectangle r1=b.getBounds();
        Rectangle r2=b1.getBounds();
        Rectangle r3=b2.getBounds();
        Rectangle d=j.getBounds();
        if(r1.intersects(d) || r2.intersects(d) || r3.intersects(d) )
            lost=true;
    }
    
    public void paint(Graphics g){
        if(lost)
            System.exit(0);
        super.paint(g);
            Graphics2D g2d=(Graphics2D) g;
            
            g2d.drawImage(img,0,0,null);
            System.out.println(j.getX());
            g2d.drawImage(j.getImage(), j.getX(), j.getY(),null);
            g2d.drawImage(b.getImage(), b.getX(), b.getY(),null);
            g2d.drawImage(b1.getImage(), b1.getX(), b1.getY(),null);
            g2d.drawImage(b2.getImage(), b2.getX(), b2.getY(),null);
    }
    
    private class AL extends KeyAdapter{
        public void keyReleased(KeyEvent e){
            j.keyReleased(e);
        }
        public void keyPressed(KeyEvent e){
            j.keyPressed(e);
        }
    }
    public int Random(int ra){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(ra);
        return randomInt;
}
}
