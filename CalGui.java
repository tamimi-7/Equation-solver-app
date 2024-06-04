
package com.mycompany.cal;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class CalGui {
   public static void main(String[]arg){
       Font f18 = new Font("Times New Roman", Font.BOLD, 18);
       Font f28 = new Font("Times New Roman", Font.BOLD, 28);
       
    JFrame frame = new JFrame("Calculator");
    frame.setSize(435, 420);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    
    
    
    
    JLabel oldvalue = new JLabel();
    JLabel op = new JLabel();
    JLabel newvalue = new JLabel("0"); 
    JButton btn0 = new JButton("0");
    JButton btndot = new JButton(".");
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btnplus = new JButton("+");
    JButton btnmin = new JButton("-");
    JButton btnmult = new JButton("*");
    JButton btndiv = new JButton("/");
    JButton btnequal = new JButton("=");
    JButton btnremove = new JButton("Del");
    JButton btnclear = new JButton("c");
    JButton btnsign = new JButton("+/-");
   //wait
   
    oldvalue.setBounds(0, 5, 380, 25);
    op.setBounds(390, 5, 15, 25);
    newvalue.setBounds(0, 30, 415, 100);
    btnsign.setBounds(2, 135, 100, 40);
    btnclear.setBounds(105, 135, 100, 40);
    btnremove.setBounds(210, 135, 100, 40);        
    btndiv.setBounds(315, 135, 100, 40);        
    btn7.setBounds(2, 180, 100, 40);        
    btn8.setBounds(105, 180, 100, 40);        
    btn9.setBounds(210, 180, 100, 40);        
    btnmult.setBounds(315, 180, 100, 40);        
    btn4.setBounds(2, 225, 100, 40);        
    btn5.setBounds(105, 225, 100, 40);        
    btn6.setBounds(210, 225, 100, 40);        
    btnmin.setBounds(315, 225, 100, 40);
    btn1.setBounds(2, 270, 100, 40);        
    btn2.setBounds(105, 270, 100, 40);        
    btn3.setBounds(210, 270, 100, 40);        
    btnplus.setBounds(315, 270, 100, 40);        
    btn0.setBounds(2, 315, 205, 40);        
    btndot.setBounds(210, 315, 100, 40);        
    btnequal.setBounds(315, 315, 100, 40);        
            
            
            
            
            
    oldvalue.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    newvalue.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    //wait again
    
    
    
    
    frame.getContentPane().setBackground(Color.DARK_GRAY);
    oldvalue.setBackground(Color.DARK_GRAY);
    oldvalue.setOpaque(true);
    op.setBackground(Color.DARK_GRAY);
    op.setOpaque(true);
    newvalue.setBackground(Color.DARK_GRAY);
    newvalue.setOpaque(true);
    btnequal.setBackground(Color.BLUE);
    btnplus.setBackground(Color.DARK_GRAY);
    btnmin.setBackground(Color.DARK_GRAY);        
    btnmult.setBackground(Color.DARK_GRAY);
    btnremove.setBackground(Color.DARK_GRAY);
    btnclear.setBackground(Color.gray);
    btnsign.setBackground(Color.DARK_GRAY);
    btndiv.setBackground(Color.DARK_GRAY);
    btn0.setBackground(Color.BLACK);
    btn1.setBackground(Color.BLACK);
    btn2.setBackground(Color.BLACK);
    btn3.setBackground(Color.BLACK);
    btn4.setBackground(Color.BLACK);
    btn5.setBackground(Color.BLACK);
    btn6.setBackground(Color.BLACK);
    btn7.setBackground(Color.BLACK);
    btn8.setBackground(Color.BLACK);
    btn9.setBackground(Color.BLACK);
    btndot.setBackground(Color.BLACK);
    //wait third time
    oldvalue.setForeground(Color.WHITE);
    op.setForeground(Color.WHITE);
    newvalue.setForeground(Color.WHITE);
    btnequal.setForeground(Color.WHITE);
    btnplus.setForeground(Color.WHITE);
    btnmin.setForeground(Color.WHITE);
    btnmult.setForeground(Color.WHITE);
    btnremove.setForeground(Color.WHITE);
    btnclear.setForeground(Color.WHITE);
    btnsign.setForeground(Color.WHITE);
    btndiv.setForeground(Color.WHITE);
    btn0.setForeground(Color.WHITE);
    btn1.setForeground(Color.WHITE);
    btn2.setForeground(Color.WHITE);
    btn3.setForeground(Color.WHITE);
    btn4.setForeground(Color.WHITE);
    btn5.setForeground(Color.WHITE); 
    btn6.setForeground(Color.WHITE);
    btn7.setForeground(Color.WHITE);
    btn8.setForeground(Color.WHITE);
    btn9.setForeground(Color.WHITE);
    btndot.setForeground(Color.WHITE);
    // wait forth times
    btn0.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
             newvalue.setText(newvalue.getText() + "0");
           }
       });
    
    btndot.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
             newvalue.setText(newvalue.getText() + ".");
           }
       });
    btn1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
             newvalue.setText(newvalue.getText() + "1");
           }
       });
    btn2.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
             newvalue.setText(newvalue.getText() + "2");
           }
       });
    btn3.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
             newvalue.setText(newvalue.getText() + "3");
           }
       });
    btn4.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
             newvalue.setText(newvalue.getText() + "4");
           }
       });
    btn5.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
             newvalue.setText(newvalue.getText() + "5");
           }
       });
    btn6.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
             newvalue.setText(newvalue.getText() + "6");
           }
       });
    
    btn7.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
             newvalue.setText(newvalue.getText() + "7");
           }
       });
    btn8.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
             newvalue.setText(newvalue.getText() + "8");
           }
       });
    btn9.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
             newvalue.setText(newvalue.getText() + "9");
           }
       });
    btnclear.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
             newvalue.setText("0");
             oldvalue.setText("");
             op.setText("");
           }
       });
    btnremove.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
            try{
            newvalue.setText(newvalue.getText().substring(0, newvalue.getText().length()-1));
            }catch(Exception ex){
            }
            if(newvalue.getText().isEmpty()){
            newvalue.setText("0");
            }
           }
       });
    
    btnsign.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
             int num = Integer.parseInt(newvalue.getText());
             num *= -1;
             newvalue.setText(String.valueOf(num));
           }
       });
    
    oldvalue.setFont(f18);
    op.setFont(f18);
    newvalue.setFont(f28);
    btn0.setFont(f18);
    btndot.setFont(f18);
    btn1.setFont(f18);
    btn2.setFont(f18);
    btn3.setFont(f18);
    btn4.setFont(f18);
    btn5.setFont(f18);
    btn6.setFont(f18);
    btn7.setFont(f18);
    btn8.setFont(f18);
    btn9.setFont(f18);
    btnplus.setFont(f18);
    btnmin.setFont(f18);
    btndiv.setFont(f18);
    btnmult.setFont(f18);
    btnequal.setFont(f18);
    btnremove.setFont(f18);
    btnclear.setFont(f18);
    btn0.setFont(f18);
    btn0.setFont(f18);
    frame.add(oldvalue);
    frame.add(op);
    frame.add(newvalue);
    frame.add(btn0);
    frame.add(btndot);
    frame.add(btn1);
    frame.add(btn2);
    frame.add(btn3);
    frame.add(btn4);
    frame.add(btn5);
    frame.add(btn6);
    frame.add(btn7);
    frame.add(btn8);
    frame.add(btn9);
    frame.add(btnplus);
    frame.add(btnmin);
    frame.add(btndiv);
    frame.add(btnmult);
    frame.add(btnremove);
    frame.add(btnclear);
    frame.add(btnsign);
    frame.add(btnequal);
   
    
    frame.setVisible(true);
    
   }
   public static double sum(double num1, char c, double num2){
    double result = 0;
    switch(c){
      case'+':
          result = num1 + num2;
      break;
      case'-':
          result = num1 - num2;
      break;
      case'*':
          result = num1 * num2;
      break;
      case'/':
          if (num2 != 0) {
          result = num1 / num2;
          }else{
          JOptionPane.showMessageDialog(null, "Cannot divided by zero");
          }
      break;
      default:;
      break;
    }
    return result;
  }
}
