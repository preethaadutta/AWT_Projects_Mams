
package popmenu;
import java.awt.*;
import java.awt.event.*;

public class Popmenu extends Frame //extends Frame so windowclosing can be implemented
{
    Popmenu()
    {
        final Frame pop_menuf= new Frame("PopupMenu Demo");  
        final PopupMenu pop_menu = new PopupMenu("*Edit*");   
        MenuItem pop_cut = new MenuItem("Cut");  
        pop_cut.setActionCommand("Cut");  
        MenuItem pop_copy = new MenuItem("Copy");  
        pop_copy.setActionCommand("Copy");  
        MenuItem pop_paste = new MenuItem("Paste");  
        pop_paste.setActionCommand("Paste");      
        pop_menu.add(pop_cut);  
        pop_menu.add(pop_copy);  
        pop_menu.add(pop_paste);        
        pop_menuf.addMouseListener(new MouseAdapter() 
        {  
            public void mouseClicked(MouseEvent a) 
            {              
                pop_menu.show(pop_menuf , a.getX(), a.getY());  
            }                 
        }                         );  
        pop_menuf.add(pop_menu);   
        pop_menuf.setSize(400,400);  
        pop_menuf.setLayout(null);  
        pop_menuf.setVisible(true);
        
    
    }
    
    public static void main(String[] args) 
    {
        new Popmenu();
    }
}
