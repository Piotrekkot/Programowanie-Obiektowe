package zad2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Panel extends JPanel {

	private static final long serialVersionUID = 1L;
	private BufferedImage img;
	private Font font;

	public Panel(int size) {
		setPreferredSize(new Dimension(200, 200));
		font = new Font("Arial", 0, size);
	}

	public Panel(BufferedImage img) {
		this.img = img;
		this.loadImage();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(img == null){
			g.setColor(Color.red);
			if(Main.empty == true){
				g.drawString("Brak obrazka", (getWidth() - g.getFontMetrics().stringWidth("Brak obrazka")) / 2, ((getHeight() + g.getFontMetrics().getAscent())/2) );
			}else{
				g.drawString("Koniec prezentacji", (getWidth() - g.getFontMetrics().stringWidth("Koniec prezentacji")) / 2, ((getHeight() + g.getFontMetrics().getAscent())/2) );
			}
		}
	}

	private void loadImage() {
		int w = img.getWidth(this);
		int h = img.getHeight(this);
		setPreferredSize(new Dimension(w, h));
	}
}
