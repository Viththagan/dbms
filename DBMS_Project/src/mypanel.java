import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class mypanel extends JPanel {
	private BufferedImage img;
public void paint(Graphics g) {
	try {
	img=ImageIO.read(new File("C:\\Users\\sanur\\Desktop\\bus22.jpg"));
	
}catch(IOException e) {
	JOptionPane.showMessageDialog(null, e);
} 
	super.paint(g);
	g.drawImage(img,0,0, null);


}
}
