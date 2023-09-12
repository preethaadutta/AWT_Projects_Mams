
package menudemo;
import java.awt.*;
import java.awt.event.*;
public class Menumamsassignment extends WindowAdapter  
{
    Frame f1=new Frame("Menumamsassignment");
    Menumamsassignment()
    {
        MenuBar menubar=new MenuBar();
        Menu mainmenu=new Menu("Programming=>");
        menubar.add(mainmenu); 
        
        Menu menu1=new Menu("Oops=>");
        mainmenu.add(menu1);
        MenuItem menu1a=new MenuItem("Java");
        menu1.add(menu1a);
        MenuItem menu1b=new MenuItem("C++");
        menu1.add(menu1b);
        MenuItem menu1c=new MenuItem("Python");
        menu1.add(menu1c);
        
        Menu menu2=new Menu("Procedural=>");
        mainmenu.add(menu2);
        MenuItem menu2a=new MenuItem("C");
        menu2.add(menu2a);
        
        f1.addWindowListener(this);
        f1.setMenuBar(menubar);  
        f1.setSize(400,400);  
        f1.setLayout(null);  
        f1.setVisible(true);
    }
    @Override
    public void windowClosing(WindowEvent e)
    {
        f1.dispose();
    }
    
    public static void main(String[] args) 
    {
        new Menumamsassignment();// TODO code application logic here
    }
}
