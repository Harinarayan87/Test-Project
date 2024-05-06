import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
class MyCanvas extends JComponent 
{
	public void paint(Graphics g) 
	{
	    g.setColor(Color.GREEN);
        g.fillRect(50, 50, 50, 50);
        g.drawRect (10, 10, 200, 200);  
	}
}

public class DrawRectangle1 
{
	public static void main(String[] ) 
	{
	    JFrame window = new JFrame();
        JPanel window1=new JPanel();
        Color c=new Color(255, 0, 0, 100);
        window1.setBackground(c);
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(30, 30, 300, 300);
	    window.getContentPane().add(new MyCanvas());
	    window.setVisible(true);
        window.add(window1);
        
	}
}
