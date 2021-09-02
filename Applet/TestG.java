/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Danish
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestG extends Applet implements ActionListener{

    Button b1=new Button("Red");
    Button b2=new Button("Green");
    Button b3=new Button("Yellow");
    public void init(){
        add(b1);
        add(b2);
        add(b3);
    }
    public void start()
    {
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public void destroy()
    {
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(b1==e.getSource())
            setBackground(Color.red);
        if(b2==e.getSource())
            setBackground(Color.GREEN);
        if(b3==e.getSource())
            setBackground(Color.YELLOW);        
    }
    
}
