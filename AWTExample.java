import java.awt.*;
import java.awt.event.*;
class AWTExample {
   AWTExample(){
    Frame f=new Frame();
    Label l= new Label("Employee id:");
    Button b= new Button("Submit");
    TextField t=new TextField();
    l.setBounds(20,80,80,30);
    t.setBounds(20,120,80,30);
    b.setBounds(100,120,80,30);
    f.add(b);
    f.add(l);
    f.add(t);
f.setSize(400,300);
//setting the title of frame
f.setTitle("Employee Info");
//no layout
f.setLayout(null);
f.setVisible(true);
f.addWindowListener(new WindowAdapter(){
   public void windowClosing(WindowEvent we){
      System.exit(0);
   }
}
);

   } 
   public static void main(String args[]) {
    //creating instance of frame class
    AWTExample awtobj=new AWTExample();

   }
}
