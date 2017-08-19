/**
 *
 *  @author Kotowski Piotr S13830
 *
 */

package zad1;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

public static void main(String[] args){
        
        JFrame frame = new JFrame("linie");
        JPanel world = new linie();
        frame.getContentPane().add(world);
        frame.setLocation(200, 200);
        frame.pack();
        frame.show();
    }

}
