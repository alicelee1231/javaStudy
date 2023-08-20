import java.awt.*;
import java.awt.event.*;

class InnerEx8{
    public static void main(String[] args){
        Button b = new Button("start");
        b.addActionListener(new ActionListener(){
            public void actionPerfomed(ActionEvent e){
                System.out.println("ActionEvent occured!");
            }
        });
    }
}