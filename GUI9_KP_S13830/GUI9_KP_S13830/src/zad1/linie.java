package zad1;

import java.awt.*;
import javax.swing.*;

class linie extends JPanel {

    public void paintComponent(Graphics g){
        
	super.paintComponent(g);
        
     int height = getHeight();
     int width = getWidth();
     g.setColor(Color.blue);
     
     g.drawLine(0, 0, width, height);
     g.drawLine(width, 0, 0, height);
     
    }

    public Dimension getPreferredSize(){
        return new Dimension(200, 200);
    }
}