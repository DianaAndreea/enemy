import javax.swing.*;

public class Game {
    public static void main(String[] args) throws InterruptedException{
        javax.swing.JFrame frame=new javax.swing.JFrame("2D Game");
        frame.add(new Board());
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,700);
        frame.setVisible(true);
        
        while(true){Thread.sleep(100);}
    }
}
