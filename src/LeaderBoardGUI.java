import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

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
    private ArrayList<User> pLog;

    public LeaderBoardGUI(String title, ArrayList<User> userList,User u) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        pLog=userList;
        Collections.sort(pLog);
        FirstPlace.setText("User ID: "+pLog.get(0).getID());
        scoreOne.setText(String.valueOf(pLog.get(0).getScore()));
        SecondPlace.setText("User ID: "+pLog.get(1).getID());
        scoreTwo.setText(String.valueOf(pLog.get(1).getScore()));
        ThirdPlace.setText("User ID: "+pLog.get(2).getID());
        scoreThree.setText(String.valueOf(pLog.get(2).getScore()));
        FourthPlace.setText("User ID: "+pLog.get(3).getID());
        scoreFour.setText(String.valueOf(pLog.get(3).getScore()));
        FifthPlace.setText("User ID: "+pLog.get(4).getID());
        scoreFive.setText(String.valueOf(pLog.get(4).getScore()));
        yourPlace.setText(String.valueOf(pLog.indexOf(u)));
        yourUserId.setText("You");
        youScore.setText(String.valueOf(u.getScore()));
    }
}
