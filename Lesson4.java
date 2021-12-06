import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lesson4
{
    Lesson4(){
        JFrame f = new JFrame("GUI Window");
        
        JButton b = new JButton("Calculate");
        b.setBounds(100,200,100,40);
        
        JLabel label = new JLabel();
        
        label.setText("Distance: ");
        label.setBounds(10,10,100,40);
        
        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(130, 10, 100, 40);
        
        f.add(label);
        f.add(b);
        f.add(resultLabel);

        
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent arg0){
                int distance, speed = 0, time = 0;
                String speedInput, timeInput;
                
                boolean isValid = false;
                boolean needVal = true;
                
                while(!isValid){
                   try{
                       speedInput = JOptionPane.showInputDialog("Enter Speed:");
                       speed = Integer.parseInt(speedInput);
                   } catch (NumberFormatException a) {
                       JOptionPane.showMessageDialog(null,"The speed value has to be an integer. Try again.", "Error", JOptionPane.ERROR_MESSAGE);
                       needVal = false;
                   }
                   
                   if(speed < 0 && needVal){
                       JOptionPane.showMessageDialog(null,"The speed cannot be less than 0. Try again.", "Error", JOptionPane.ERROR_MESSAGE);
                   }
                   else if(speed >= 0 && needVal){
                       break;
                   }
                   else{
                       needVal=true;
                   }
                }
                
                timeInput = JOptionPane.showInputDialog("Enter Time");
                time = Integer.parseInt(timeInput);
                
                distance = speed*time;
                
                resultLabel.setText(String.valueOf(distance));
            }
        });
    }
    
    public static void main(String[] args){
        new Lesson4();
    }
}
