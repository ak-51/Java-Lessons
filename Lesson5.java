import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Lesson5 {
    Lesson5(){
        JFrame f=new JFrame("Area of a Circle and Triangle");
        
        JLabel circle = new JLabel();
        circle.setText("Area of Circle");
        circle.setBounds(90, 10, 150, 20);
        circle.setFont(new Font("Serif", Font.BOLD, 16));
        
        JButton b=new JButton("Calculate");
        b.setBounds(100,80,100, 50);
        b.setBackground(Color.BLUE); // not working
        
        JLabel label = new JLabel();
        label.setText("Radius:");
        label.setBounds(10, 10, 100, 80);
        
        JTextField textField1 = new JTextField();
        textField1.setBounds(130, 30, 140, 40);
        
        JLabel triangle = new JLabel();
        triangle.setText("Area of Triangle");
        triangle.setBounds(80, 10, 150, 300);
        triangle.setFont(new Font("Serif", Font.BOLD, 16));
        
        JLabel heightLabel = new JLabel();
        heightLabel.setText("Height:");
        heightLabel.setBounds(10, 10, 100, 370);
        
        JTextField heightField = new JTextField();
        heightField.setBounds(130, 170, 140, 40);
        
        JTextField baseField = new JTextField();
        baseField.setBounds(130, 220, 140, 40);
        
        JLabel baseLabel = new JLabel();
        baseLabel.setText("Base:");
        baseLabel.setBounds(10,10, 100, 440);
        
        JButton triButton = new JButton("Calculate");
        triButton.setBounds(100,270,100, 50);
        triButton.setBackground(Color.BLUE); //not working
        
        f.add(triangle);
        f.add(circle);
        f.add(heightLabel);
        f.add(heightField);
        f.add(baseLabel);
        f.add(baseField);
        f.add(triButton);
        f.add(label);
        f.add(textField1);
        f.add(b);
        f.setSize(300,350);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try{
                    double radius = Double.parseDouble(textField1.getText());
                    
                    if(radius < 0){
                        JOptionPane.showMessageDialog(null, "Radius cannot be negative. Try again.", "AREA OF CIRCLE",JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        double area = (radius * radius) * 3.142;
                        JOptionPane.showMessageDialog(null, "This area of the circle is "+area, "AREA OF CIRCLE",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                catch(NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Radius has to be a numerical value. Try again.", "AREA OF CIRCLE",JOptionPane.ERROR_MESSAGE);
                }
                
            }
        });
        
        triButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                try {
                    double height = Double.parseDouble(heightField.getText());
                    double base = Double.parseDouble(baseField.getText());
                    
                    if(height < 0 || base < 0){
                        JOptionPane.showMessageDialog(null, "Height or Base cannot be negative. Try again.", "AREA OF TRIANGLE",JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        double triArea = height * base * 0.5;
                        JOptionPane.showMessageDialog(null, "This area of the triangle is "+ triArea, "AREA OF TRIANGLE",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                catch(NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Height and Base have to be numerical values. Try again.", "AREA OF TRIANGLE",JOptionPane.ERROR_MESSAGE);
                }
                
                
            }
        });
    }
    public static void main(String[] args) {
        new Lesson5();
    }
}
