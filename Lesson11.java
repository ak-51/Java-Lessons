import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Lesson11 extends JFrame implements ActionListener {
    
    String[] planets = new String[]{"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"}; //7 planets
    double[] gravity = new double[]{0.38, 0.9, 0.38, 2.4, 1.07, 0.86, 1.1}; // associated gravity
    //NEW COMBO BOX FOR SELECTION, OPTIONS ARE PLANETS LIST
    JComboBox planetSelection = new JComboBox(planets);
    //NEW LABEL TO SHOW RESULT
    JLabel lblText = new JLabel(); // label to display weight
    //TEXT FIELD TO ALLOW DATA ENTRY
    JTextField textField = new JTextField();
    //MAIN METHOD CALLED AT START
    
    public static void main(String [] args){
        //CREATE A NEW COMBO BOX OBJECT
        Lesson11 fr = new Lesson11();
    }
    
    //constructor
    public Lesson11(){
        //MAKE A NEW JFRAME CALLED f
        JFrame f = new JFrame("Your weight on other planets");
        //SET UP TEXT FIELD BOUNDS AND DEFAULT VALUE
        textField.setText("Enter your weight here");
        textField.setBounds(40,40, 150, 20);
        //SET INITIAL SELECTION ON COMBO BOX, SET BOUNDS
        //ADD ACTION LISTENER TO REACT TO CHANGE
        planetSelection.setSelectedIndex(0);
        planetSelection.addActionListener(this);
        planetSelection.setBounds(40, 80, 150, 20);
        //SET BOUNDS AND INTIAL VALUE OF TEXT LABEL
        lblText.setBounds(40, 20, 150, 20);
        lblText.setText("Calculation Appears Here");
        lblText.setForeground(Color.red);
        //ADD THREE ITEMS TO FRAME
        f.add(textField);
        f.add(planetSelection);
        f.add(lblText);
        //SET SIZE OF FRAME, MAKE VISIBLE, SET EXIT CONDITION
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == planetSelection){
            double newWeight = 0.00;
            double earthWeight = Double.parseDouble(textField.getText());
            String message = "Error";
            //get index of option selected
            int index = planetSelection.getSelectedIndex();
            
            switch(index){
                case 0:
                    newWeight = earthWeight * gravity[index];
                    message = "New Weight: " + newWeight;
                    if(newWeight < earthWeight){
                        lblText.setForeground(Color.green);
                    }
                    else{
                        lblText.setForeground(Color.red);
                    }
                
                case 1:
                    newWeight = earthWeight * gravity[index];
                    message = "New Weight: " + newWeight;
                    if(newWeight < earthWeight){
                        lblText.setForeground(Color.green);
                    }
                    else{
                        lblText.setForeground(Color.red);
                    }
                
                case 2:
                    newWeight = earthWeight * gravity[index];
                    message = "New Weight: " + newWeight;
                    if(newWeight < earthWeight){
                        lblText.setForeground(Color.green);
                    }
                    else{
                        lblText.setForeground(Color.red);
                    }
                
                case 3:
                    newWeight = earthWeight * gravity[index];
                    message = "New Weight: " + newWeight;
                    if(newWeight < earthWeight){
                        lblText.setForeground(Color.green);
                    }
                    else{
                        lblText.setForeground(Color.red);
                    }
                    
                case 4:
                    newWeight = earthWeight * gravity[index];
                    message = "New Weight: " + newWeight;
                    if(newWeight < earthWeight){
                        lblText.setForeground(Color.green);
                    }
                    else{
                        lblText.setForeground(Color.red);
                    }
                
                case 5:
                    newWeight = earthWeight * gravity[index];
                    message = "New Weight: " + newWeight;
                    if(newWeight < earthWeight){
                        lblText.setForeground(Color.green);
                    }
                    else{
                        lblText.setForeground(Color.red);
                    }
                
                case 6:
                    newWeight = earthWeight * gravity[index];
                    message = "New Weight: " + newWeight;
                    if(newWeight < earthWeight){
                        lblText.setForeground(Color.green);
                    }
                    else{
                        lblText.setForeground(Color.red);
                    }
            }
            //DISPLAY CALCULATION ON LABEL
            lblText.setText(message);
        }
    }
}
