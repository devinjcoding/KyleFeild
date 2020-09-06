import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GameMasterGUI extends JFrame {
    private JPanel mainPanel;
    private JLabel Special;
    private JPanel Special_Event;
    private JPanel YardageLabel;
    private JPanel Play_Type;
    private JLabel Yardage;
    private JLabel Play_type;
    private JCheckBox Sack;
    private JCheckBox Safety;
    private JCheckBox Interception;
    private JCheckBox Fumble;
    private JCheckBox Touchdown;
    private JButton sixty;
    private JButton forty_sixty;
    private JButton twentyfive_forty;
    private JButton zero_ten;
    private JButton ten_twentyfive;
    private JButton negative;
    private JButton Kick_Punt;
    private JButton Pass;
    private JButton Run;
    private JButton Submit;
    private JTextField yardsToGo;
    private JButton Penalty;
    private JLabel Yards_to_Go;
    private JButton Close_Poll;
    private boolean playStarted;

    PlayType pt;

    public GameMasterGUI(String title, ArrayList<User> pLog) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        pt = new PlayType();

        Run.setEnabled(false);
        Pass.setEnabled(false);
        Sack.setEnabled(false);
        Safety.setEnabled(false);
        Interception.setEnabled(false);
        Fumble.setEnabled(false);
        Touchdown.setEnabled(false);
        sixty.setEnabled(false);
        forty_sixty.setEnabled(false);
        twentyfive_forty.setEnabled(false);
        zero_ten.setEnabled(false);
        ten_twentyfive.setEnabled(false);
        negative.setEnabled(false);
        Kick_Punt.setEnabled(false);
        Pass.setEnabled(false);
        Run.setEnabled(false);
        yardsToGo.setEnabled(true);

        Close_Poll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*if(yardsToGo.getText().length()<=0){
                    JOptionPane.showMessageDialog(frame,"Invalid Yards to go");
                }*/
                int ytg = (int) ((Double.parseDouble(yardsToGo.getText())));
                if(ytg > 0 && ytg < 100){
                    Run.setEnabled(true);
                    Pass.setEnabled(true);
                    Sack.setEnabled(true);
                    Safety.setEnabled(true);
                    Interception.setEnabled(true);
                    Fumble.setEnabled(true);
                    Touchdown.setEnabled(true);
                    sixty.setEnabled(true);
                    forty_sixty.setEnabled(true);
                    twentyfive_forty.setEnabled(true);
                    zero_ten.setEnabled(true);
                    ten_twentyfive.setEnabled(true);
                    negative.setEnabled(true);
                    Kick_Punt.setEnabled(true);
                    Pass.setEnabled(true);
                    Run.setEnabled(true);
                    yardsToGo.setEnabled(false);
                    playStarted = true;
                }
            }
        });

        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Color c = new Color(62,62,62);
                getPlayInfo();
                Run.setEnabled(false);
                Pass.setEnabled(false);
                Sack.setEnabled(false);
                Safety.setEnabled(false);
                Interception.setEnabled(false);
                Fumble.setEnabled(false);
                Touchdown.setEnabled(false);
                sixty.setEnabled(false);
                forty_sixty.setEnabled(false);
                twentyfive_forty.setEnabled(false);
                zero_ten.setEnabled(false);
                ten_twentyfive.setEnabled(false);
                negative.setEnabled(false);
                Kick_Punt.setEnabled(false);
                Pass.setEnabled(false);
                Run.setEnabled(false);
                yardsToGo.setText("");
                yardsToGo.setEnabled(true);
                updateScore(pLog);
                pt = new PlayType();
                Run.setBackground(c);
                Pass.setBackground(c);
                Kick_Punt.setBackground(c);
                negative.setBackground(c);
                zero_ten.setBackground(c);
                ten_twentyfive.setBackground(c);
                twentyfive_forty.setBackground(c);
                forty_sixty.setBackground(c);
                sixty.setBackground(c);
                Touchdown.setSelected(false);
                Fumble.setSelected(false);
                Safety.setSelected(false);
                Interception.setSelected(false);
                Sack.setSelected(false);
                playStarted = false;

            }
        });



        //play type
        Run.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color c = new Color(60,0,0);
                Color resetbkg = new Color(62,62,62);
                pt.setPlayType((byte)(0));
                System.out.println("play type: " + pt.getPlayType());
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
                pt.setPlayType((byte)(1));
                System.out.println("play type: " + pt.getPlayType());
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
                pt.setPlayType((byte)(2));
                pt.setYardage((byte)(8));
                System.out.println("play type: " + pt.getPlayType());
                System.out.println("yardage: " + pt.getYardage());
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

        //special event
        Touchdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Touchdown.isSelected()){
                    pt.setTouchdown(true);
                }
                if(!Touchdown.isSelected()){
                    pt.setTouchdown(false);
                }
                System.out.println("touchdown: " + pt.isTouchdown());
            }
        });
        Fumble.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Fumble.isSelected()){
                    pt.setFumble(true);
                }
                if(!Fumble.isSelected()){
                    pt.setFumble(false);
                }
                System.out.println("fumble: " + pt.isFumble());
            }
        });
        Interception.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Interception.isSelected()){
                    pt.setInterception(true);
                }
                if(!Interception.isSelected()){
                    pt.setInterception(false);
                }
                System.out.println("interception: " + pt.isInterception());
            }
        });
        Safety.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Safety.isSelected()){
                    pt.setSaftey(true);
                }
                if(!Safety.isSelected()){
                    pt.setSaftey(false);
                }
                System.out.println("safety: " + pt.isSaftey());
            }
        });
        Sack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Sack.isSelected()){
                    pt.setSack(true);
                }
                if(!Sack.isSelected()){
                    pt.setSack(false);
                }
                System.out.println("sack: " + pt.isSack());
            }
        });

        //yardage
        negative.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pt.getPlayType() != 2) {
                    Color c = new Color(60, 0, 0);
                    Color resetbkg = new Color(62, 62, 62);
                    pt.setYardage((byte)(0));
                    System.out.println("yardage: " + pt.getYardage());
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
                if(pt.getPlayType() != 2) {
                    Color c = new Color(60, 0, 0);
                    Color resetbkg = new Color(62, 62, 62);
                    pt.setYardage((byte)(1));
                    System.out.println("yardage: " + pt.getYardage());
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
                if(pt.getPlayType() != 2) {
                    Color c = new Color(60, 0, 0);
                    Color resetbkg = new Color(62, 62, 62);
                    pt.setYardage((byte)(2));
                    System.out.println("yardage: " + pt.getYardage());
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
                if(pt.getPlayType() != 2) {
                    Color c = new Color(60, 0, 0);
                    Color resetbkg = new Color(62, 62, 62);
                    pt.setYardage((byte)(3));
                    System.out.println("yardage: " + pt.getYardage());
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
                if(pt.getPlayType() != 2) {
                    Color c = new Color(60, 0, 0);
                    Color resetbkg = new Color(62, 62, 62);
                    pt.setYardage((byte)(4));
                    System.out.println("yardage: " + pt.getYardage());
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
                if(pt.getPlayType() != 2) {
                    Color c = new Color(60, 0, 0);
                    Color resetbkg = new Color(62, 62, 62);
                    pt.setYardage((byte)(5));
                    System.out.println("yardage: " + pt.getYardage());
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
    /*public static void main(String[] args){
        JFrame frame = new GameMasterGUI("Game Master", Map<Integer, PlayType>());
        frame.setVisible(true);
    }*/
    public boolean isPlayStarted(){
        return playStarted;
    }
    private void updateScore(ArrayList<User> playerLog){
        for(User u: playerLog){
            byte userPlay;
            byte userYard;
            boolean userTouchdown;
            boolean userFumble;
            boolean userSack;
            boolean userSafety;
            boolean userInterception;
            userPlay = u.getPlay().getPlayType();
            userYard = u.getPlay().getYardage();
            userTouchdown = u.getPlay().isTouchdown();
            userFumble = u.getPlay().isFumble();
            userSack = u.getPlay().isSack();
            userSafety = u.getPlay().isSaftey();
            userInterception = u.getPlay().isInterception();
            //compare to GM play book
            //update user score
            if (userPlay == pt.getPlayType())
                score += 10;
            else
                score -= 5;
            if (yardsToGo > 60){
                if (userYard == pt.getYardage()){
                    if (userYard == 0)
                        score += 15;
                    if (userYard == 1)
                        score += 10;
                    if (userYard == 2)
                        score += 20;
                    if (userYard == 3)
                        score += 30;
                    if (userYard == 4)
                        score += 40;
                    if (userYard == 5)
                        score += 50;
                }
            }
        }
    }
    public String getPlayInfo(){
        return pt.toString() + (int)((Double.parseDouble(yardsToGo.getText())));
    }
}
