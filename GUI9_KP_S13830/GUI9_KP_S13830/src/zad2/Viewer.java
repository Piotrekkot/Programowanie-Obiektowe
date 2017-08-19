package zad2;

import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("unused")
public class Viewer extends JFrame implements Runnable {

	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private ImageIcon i;
	private Viewer p;
	private BufferedImage image;
	private boolean loaded = false;
	private JPanel panel;
	private Icon icon;
	private JLabel label = new JLabel();
	
	public Viewer(File[] pics, int sek, int size) {
		this.frame = new JFrame();
		Main.files = pics;
		Main.time = sek;
		Main.size = size;
	}
	
	@Override
	public void run() {
		int time = Main.getTime() * 1000;
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.getContentPane().add(label);
		
		if(Main.empty == false){
			for(File file : Main.files){
				BufferedImage img = new BufferedImage(200,400,1);
				icon = new ImageIcon(file.getAbsolutePath());
				label.setIcon(icon);
				frame.addComponentListener(new ComponentAdapter(){  
					public void componentResized(ComponentEvent evt) {
						Image image = ((ImageIcon) icon).getImage();
				        Image newimg = image.getScaledInstance(frame.getWidth(), frame.getHeight(),  java.awt.Image.SCALE_FAST); // scale it the smooth way  
				        icon = new ImageIcon(newimg);
				        label.setIcon(icon);
				        frame.revalidate();
				    }
				});
				frame.revalidate();
				label.setIcon(icon);
				frame.pack();
				try {
					Thread.sleep(time);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		panel = new Panel(Main.getSize());
		label = new JLabel();
		frame.setTitle("Koniec prezentacji");
		frame.setSize(400, 200);
		frame.remove(label);
		frame.add(panel);
		frame.setVisible(true);
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}