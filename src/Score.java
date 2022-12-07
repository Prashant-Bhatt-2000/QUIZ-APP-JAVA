import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener{
    JLabel heading, Score;
    JButton play_again;

    Score(String name, int score){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon banner = new ImageIcon((ClassLoader.getSystemResource("images/score.jpg")));
        JLabel image = new JLabel(banner);
        image.setBounds(500, 30, 300, 250);
        add(image);


        // Ques and Ans

        heading = new JLabel("Thank you " + name + " for Playing Mind Striker");
        heading.setBounds(405, 30, 700, 30);
        heading.setFont(new Font("consolas", Font.PLAIN, 24));
        add(heading);


        Score = new JLabel("Your Score is " + score);
        Score.setBounds(545, 300, 300, 30);
        Score.setFont(new Font("consolas", Font.PLAIN, 24));
        add(Score);


        play_again = new JButton("Play Again");
        play_again.setBounds(565, 370, 120, 25);
        play_again.setBackground(new Color(142, 189, 234));
        play_again.setForeground(Color.WHITE);
        play_again.addActionListener(this);
        add(play_again);

        setVisible(true);
    }


    public void actionPerformed(ActionEvent e){
        setVisible(false);
        new LOGIN();
    }


    public static void main(String[] args){
        new Score("User", 0);
    }
}
