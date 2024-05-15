package com.gradecalculator;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;


public class GradeCalculator extends JFrame {
    private static JTextField milestone1Field, milestone2Field, terminalField, resultField;
    public GradeCalculator(){
        super("Grade Calculator");
        setSize(500,350);
        
        
       //Assume that each milestone has the following distribution to make up 100%:
       //Milestone 1: 25%
       //Milestone 2: 40%
       //Terminal Assessment: 35%
       
       
       // Create the UI components
       JLabel milestone1Label = new JLabel("Milestone 1:");
       milestone1Field = new JTextField();
       milestone1Field.setEditable(true);
       JLabel milestone2Label = new JLabel("Milestone 2:");
       milestone2Field = new JTextField();
       milestone2Field.setEditable(true);
       JLabel terminalLabel = new JLabel("Terminal Assestment:");
       terminalField = new JTextField();
       terminalField.setEditable(true);
       JLabel resultLabel = new JLabel("Final Grade:");
       resultField = new JTextField();
       resultField.setEditable(false);
       JButton calcButton = new JButton("Calculate");
             
              
       // Add the components to the content pane
       Container contentPane = getContentPane();
       contentPane.setLayout(new GridLayout(6, 10));
       contentPane.add(milestone1Label);
       contentPane.add(milestone1Field);
       contentPane.add(milestone2Label);
       contentPane.add(milestone2Field);
       contentPane.add(terminalLabel);
       contentPane.add(terminalField);
       contentPane.add(resultLabel);
       contentPane.add(resultField);
       contentPane.add(new JLabel());
       contentPane.add(calcButton);
       pack();
       setVisible(true);
       
       
       
               
       calcButton.addActionListener(new ActionListener () {
           public void actionPerformed(ActionEvent e) {
               if (e.getActionCommand().equals("Calculate")) {
            try {
                int milestone1Label = Integer.parseInt(milestone1Field.getText());
                int milestone2Label = Integer.parseInt(milestone2Field.getText());
                int terminalLabel = Integer.parseInt(terminalField.getText());
                
                if (milestone1Label > 25 || milestone1Label < 1 ||
                        milestone2Label > 40 || milestone2Label < 1 ||
                        terminalLabel > 35 || terminalLabel < 1 ) {
                        throw new NumberFormatException();
                }
        
                int result = milestone1Label  + milestone2Label+ terminalLabel ;
                String resultF = Integer.toString(result);
                resultField.setText(resultF);
                
                
            }catch (NumberFormatException | ArithmeticException ex) {
            JOptionPane.showMessageDialog(null, "Please enter correct values: M1: 1-25 | M2: 1-40| TA: 1-35",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            
               }     
           }
       });
       
}
    
           
           
          
    public static void main(String[] args) {
        GradeCalculator program = new GradeCalculator();
        program.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        program.setLocationRelativeTo(null);
        
    }
}



    
    
    

               
    
               
    
    
