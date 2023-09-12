
package event1;

import java.awt.*;  
import java.awt.event.*;

class Event1 extends Frame  implements ActionListener
{  
    TextField tf; 
    Label l1;
    Event1()
    {    
        //create components  
        l1=new Label("Enter your name");
        l1.setBounds(10,20,100,30);  
        tf=new TextField();  
        tf.setBounds(60,50,170,20);  
        Button b=new Button("click me");  
        b.setBounds(100,120,80,30);  
        //register listener  
        b.addActionListener(this);//register button with listener  
        //add components and set size, layout and visibility  
        add(l1);add(b);add(tf);  
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
        addWindowListener (new WindowAdapter() 
        {    
            public void windowClosing (WindowEvent e) 
            {    
                dispose();    
            }    
        }                 );
    }  
    public void actionPerformed(ActionEvent e)
    {  
        String t1=tf.getText();
        tf.setText("Welcome "+t1);  
    }  
    public static void main(String args[])
    {  
        new Event1();  
    }  
}  
