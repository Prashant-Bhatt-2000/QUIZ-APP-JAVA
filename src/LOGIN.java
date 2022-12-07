
import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;

public class LOGIN extends JFrame implements ActionListener{

    JButton rules, exit ;

    JLabel School, name;
    JTextField name_field, School_field;


    LOGIN(){

        //background
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        //side Image
        ImageIcon poster = new ImageIcon((ClassLoader.getSystemResource("images/login.png")));
        JLabel image = new JLabel(poster);
        image.setBounds(-100, -100, 600, 500);
        add(image);


        // heading
        JLabel heading = new JLabel("Mind Striker");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 18));
        heading.setForeground(new Color(5, 173, 245));
        add(heading);

        // Name Label
        name = new JLabel("Enter your name : ");
        name.setBounds(710, 50, 300, 200);
        name.setFont(new Font("Georgia", Font.BOLD, 13));
        name.setForeground(new Color(10, 10, 10));
        add(name);

        // Name Text Feild
        name_field = new JTextField();
        name_field.setBounds(715, 170, 300, 25);
        name_field.setFont(new Font("Georgia", Font.PLAIN, 13));
        add(name_field);


        // School Label
        School = new JLabel("Enter your School name : ");
        School.setBounds(710, 120, 300, 200);
        School.setFont(new Font("Georgia", Font.BOLD, 13));
        School.setForeground(new Color(10, 10, 10));
        add(School);

        // Age Text Feild
        School_field = new JTextField();
        School_field.setBounds(715, 240, 300, 25);
        School_field.setFont(new Font("Georgia", Font.PLAIN, 13));
        add(School_field);

        //Rules Button
        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(142, 189, 234));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        //Exit Button
        exit = new JButton("EXIT");
        exit.setBounds(915, 270, 120, 25);
        exit.setBackground(new Color(142, 189, 234));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);


        //Frame / window
        setSize(1200, 500);
        setLocation(100, 100);
        setVisible(true);
    }

    //Action Listener
    public void actionPerformed(ActionEvent actionEvent){
        if(actionEvent.getSource() == rules){
            String name = name_field.getText();
            setVisible(false);
            new Rules(name);
        } else if (actionEvent.getSource() == exit) {
            setVisible(false);
        }
    }


    public static void  main(String[] args){
        new LOGIN();
    }
}
