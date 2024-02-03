package LambdaExpression;/*
//Jamie Doyle
//17:41:31/12/2023
//Project : 
*/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    JButton myButton = new JButton("MY BUTTON 1");
    JButton myButton1 = new JButton("MY BUTTON 2 ");

    MyFrame(){

        myButton.setBounds(100,100,200,100);
        myButton.addActionListener(
                (e) -> System.out.println("You clicked a button!")

        );

        myButton1.setBounds(100,200,200,100);
        myButton1.addActionListener(
                (e) -> System.out.println("Second Button!!")

        );

        this.add(myButton);
        this.add(myButton1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(null);
        this.setVisible(true);

    }
}//class
