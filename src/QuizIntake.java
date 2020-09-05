import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizIntake extends JFrame{
    private JPanel mainPanel;
    private JPanel Special_Event;
    private JPanel Yardage;
    private JPanel Play_Type;
    private JButton Run;
    private JButton Kick_Punt;
    private JButton Pass;
    private JButton negative;
    private JButton twentyfive_forty;
    private JButton forty_sixty;
    private JButton ten_twentyfive;
    private JButton zero_ten;
    private JButton sixty;
    private JCheckBox Touchdown;
    private JCheckBox Safety;
    private JCheckBox Sack;
    private JCheckBox Fumble;
    private JCheckBox Interception;
    private byte play_type;
    private byte yardage;

    public QuizIntake(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        play_type = 8;
        yardage = 8;

        //playtype
        Run.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color c = new Color(60,0,0);
                Color resetbkg = new Color(62,62,62);
                play_type = 0;
                System.out.println("play type: " + play_type);
                Run.setBackground(c);
                Pass.setBackground(resetbkg);
                Kick_Punt.setBackground(resetbkg);
            }
        });
        Pass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color c = new Color(60,0,0);
                Color resetbkg = new Color(62,62,62);
                play_type = 1;
                System.out.println("play type: " + play_type);
                Run.setBackground(resetbkg);
                Pass.setBackground(c);
                Kick_Punt.setBackground(resetbkg);
            }
        });
        Kick_Punt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color c = new Color(60,0,0);
                Color resetbkg = new Color(62,62,62);
                play_type = 2;
                yardage = 8;
                System.out.println("play type: " + play_type);
                System.out.println("yardage: " + yardage);
                Run.setBackground(resetbkg);
                Pass.setBackground(resetbkg);
                Kick_Punt.setBackground(c);
                negative.setBackground(resetbkg);
                zero_ten.setBackground(resetbkg);
                ten_twentyfive.setBackground(resetbkg);
                twentyfive_forty.setBackground(resetbkg);
                forty_sixty.setBackground(resetbkg);
                sixty.setBackground(resetbkg);
            }
        });

        //yardage
        negative.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(play_type != 2) {
                    Color c = new Color(60, 0, 0);
                    Color resetbkg = new Color(62, 62, 62);
                    yardage = 0;
                    System.out.println("yardage: " + yardage);
                    negative.setBackground(c);
                    zero_ten.setBackground(resetbkg);
                    ten_twentyfive.setBackground(resetbkg);
                    twentyfive_forty.setBackground(resetbkg);
                    forty_sixty.setBackground(resetbkg);
                    sixty.setBackground(resetbkg);
                }
            }
        });
        zero_ten.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(play_type != 2) {
                    Color c = new Color(60, 0, 0);
                    Color resetbkg = new Color(62, 62, 62);
                    yardage = 1;
                    System.out.println("yardage: " + yardage);
                    negative.setBackground(resetbkg);
                    zero_ten.setBackground(c);
                    ten_twentyfive.setBackground(resetbkg);
                    twentyfive_forty.setBackground(resetbkg);
                    forty_sixty.setBackground(resetbkg);
                    sixty.setBackground(resetbkg);
                }
            }
        });
        ten_twentyfive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(play_type != 2) {
                    Color c = new Color(60, 0, 0);
                    Color resetbkg = new Color(62, 62, 62);
                    yardage = 2;
                    System.out.println("yardage: " + yardage);
                    negative.setBackground(resetbkg);
                    zero_ten.setBackground(resetbkg);
                    ten_twentyfive.setBackground(c);
                    twentyfive_forty.setBackground(resetbkg);
                    forty_sixty.setBackground(resetbkg);
                    sixty.setBackground(resetbkg);
                }
            }
        });
        twentyfive_forty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(play_type != 2) {
                    Color c = new Color(60, 0, 0);
                    Color resetbkg = new Color(62, 62, 62);
                    yardage = 3;
                    System.out.println("yardage: " + yardage);
                    negative.setBackground(resetbkg);
                    zero_ten.setBackground(resetbkg);
                    ten_twentyfive.setBackground(resetbkg);
                    twentyfive_forty.setBackground(c);
                    forty_sixty.setBackground(resetbkg);
                    sixty.setBackground(resetbkg);
                }
            }
        });
        forty_sixty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(play_type != 2) {
                    Color c = new Color(60, 0, 0);
                    Color resetbkg = new Color(62, 62, 62);
                    yardage = 4;
                    System.out.println("yardage: " + yardage);
                    negative.setBackground(resetbkg);
                    zero_ten.setBackground(resetbkg);
                    ten_twentyfive.setBackground(resetbkg);
                    twentyfive_forty.setBackground(resetbkg);
                    forty_sixty.setBackground(c);
                    sixty.setBackground(resetbkg);
                }
            }
        });
        sixty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(play_type != 2) {
                    Color c = new Color(60, 0, 0);
                    Color resetbkg = new Color(62, 62, 62);
                    yardage = 5;
                    System.out.println("yardage: " + yardage);
                    negative.setBackground(resetbkg);
                    zero_ten.setBackground(resetbkg);
                    ten_twentyfive.setBackground(resetbkg);
                    twentyfive_forty.setBackground(resetbkg);
                    forty_sixty.setBackground(resetbkg);
                    sixty.setBackground(c);
                }
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new QuizIntake("My QuizIntake");
        frame.setVisible(true);
    }

    public Boolean getRun() {
        return getRun().booleanValue();
    }
}
