import java.awt.*;
public class awtex{
    public awtex()
{
    Frame f=new Frame();
    Frame f1=new Frame();
    Button b=new Button("Login");
    Button b2=new Button("Register");

     f.setSize(400,350);
     f1.setSize(400,350);
     f.setTitle("Java Don");
     f1.setTitle("Chhota Don");
     b.setBounds(80, 80, 150, 180);
     f.add(b);
     f1.add(b2);
     f1.setVisible(true);
     f.setLayout(null);
    f.setVisible(true);
}
    
public static void main(String args[]) {
    awtex box=new awtex();
    
}
}