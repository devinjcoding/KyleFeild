import javax.swing.*;
import java.util.ArrayList;

public class LeaderBoardGUI extends JFrame{
    private JPanel mainPanel;
    private JPanel panel7;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel panel1;
    private JLabel one;
    private JTextArea FirstPlace;
    private JLabel two;
    private JTextArea SecondPlace;
    private JLabel three;
    private JTextArea ThirdPlace;
    private JLabel four;
    private JTextArea FourthPlace;
    private JLabel five;
    private JTextArea FifthPlace;
    private JLabel yourPlace;
    private JTextArea yourUserId;
    private JLabel scoreOne;
    private JLabel scoreTwo;
    private JLabel scoreThree;
    private JLabel scoreFour;
    private JLabel scoreFive;
    private JLabel youScore;

    public LeaderBoardGUI(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }
}
