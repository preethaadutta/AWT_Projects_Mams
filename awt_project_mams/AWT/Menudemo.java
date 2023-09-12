
package menudemo;
import java.awt.*;
import java.awt.event.*;

public class Menudemo extends WindowAdapter
{
    Frame f1=new Frame("Menudemo");
    
    Menudemo()
    {
    MenuBar menu1=new MenuBar();
    Menu m1=new Menu("Car");
    Menu m11=new Menu("brand=>");
    Menu mi=new Menu("Maruti=>");
    MenuItem m2=new MenuItem("Toyota");
    MenuItem m3=new MenuItem("Marcedeez");
    MenuItem m4=new MenuItem("Nexa");
    MenuItem mi3=new MenuItem("Suzuki");
    MenuItem mi4=new MenuItem("Swift");
    MenuItem mi5=new MenuItem("Baleno");
    mi.add(mi3);
    mi.add(mi4);
    mi.add(mi5);
    Menu m12=new Menu("colour=>");
    MenuItem mi1=new MenuItem("Red");
    MenuItem mi2=new MenuItem("Green");
    m12.add(mi1);
    m12.add(mi2);
    m11.add(mi);
    m11.add(m2);
    m11.add(m3);
    m11.add(m4);
    m1.add(m11);
    m1.add(m12);
    menu1.add(m1);
    f1.addWindowListener(this);
    f1.setMenuBar(menu1);  
    f1.setSize(400,400);  
    f1.setLayout(null);  
    f1.setVisible(true);
    
    }
    public void windowClosing(WindowEvent e)
    {
        f1.dispose();
    }
    
    public static void main(String[] args) 
    {
        new Menudemo();
    }
}
