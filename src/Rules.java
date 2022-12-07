import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Rules extends JFrame implements ActionListener {

    JLabel heading, rules;

    JButton start_quiz, exit_quiz;
    String name;
    Rules(String name){

        this.name = name;

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // heading
        heading = new JLabel("Welcome " + name + " to Mind Striker");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 18));
        heading.setForeground(new Color(110, 171, 248));
        add(heading);

        //Rules for Quiz
        rules = new JLabel();
        rules.setBounds(20, -40, 700, 350);
        rules.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        rules.setForeground(new Color(10, 10, 10));
        rules.setText(
                "<html>" +
                        "1. All Questions are Based on MCQ's <br>"+
                        "2. All Questions are compulsary.<br>" +
                        "3. Do not Cheat in Quiz.<br>" +
                        "4. No Negative Marking , so attempt all Questions.<br>" +
                        "4. Do not Find Answers on Google. This is not a Open Book test.<br>" +
                        "<br> <br>" +
                        "Good Luck for the Quiz ....<br>"+
                "</html>"
        );
        add(rules);

        // Button For Starting The Quiz
        start_quiz = new JButton("Start Quiz");
        start_quiz.setBounds(15, 270, 120, 25);
        start_quiz.setBackground(new Color(142, 189, 234));
        start_quiz.setForeground(Color.WHITE);
        start_quiz.addActionListener(this);
        add(start_quiz);

        exit_quiz = new JButton("Exit Quiz");
        exit_quiz.setBounds(200, 270, 120, 25);
        exit_quiz.setBackground(new Color(142, 189, 234));
        exit_quiz.setForeground(Color.WHITE);
        exit_quiz.addActionListener(this);
        add(exit_quiz);



        setSize(800, 500);
        setLocation(350, 100);
        setVisible(true);
    }
    public static void  main(String[] args)
    {
        new Rules("User");
    }

    public void actionPerformed(ActionEvent actionEvent){
        if(actionEvent.getSource() == start_quiz){
            setVisible(false);
            new Quiz(name);

        } else if (actionEvent.getSource() == exit_quiz) {
            setVisible(false);
            new LOGIN();
        }
    }
}

