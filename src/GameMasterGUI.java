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
    private JButton End_Game;
    private boolean playStarted;
    private int ytg;
    private boolean gameEnd;
    private ArrayList<User> pLog;

    PlayType pt;

    public GameMasterGUI(String title, ArrayList<User> pLog) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.pLog = pLog;
        pt = new PlayType();
        playStarted = false;
        gameEnd = false;
        ytg = -1;
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
                validInput(yardsToGo.getText());
                if(yardsToGo.getText().length() > 0 && ytg > 0 && ytg < 100){
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
        Penalty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int response = JOptionPane.showConfirmDialog(JOptionPane.getRootFrame(), "Has the penalty been accepted?", "Confirm Penalty", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(response == JOptionPane.YES_OPTION) {
                    System.out.println("Penalty Accepted");
                    Color c = new Color(62,62,62);
                    //disabling all GameMaster Buttons
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
                    //Resetting Yards to go Textbox
                    yardsToGo.setText("");
                    yardsToGo.setEnabled(true);
                    pt = new PlayType();
                    //resetting button bkgs
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
                }else if(response==JOptionPane.NO_OPTION){
                    System.out.println("Penalty Denied");
                    Color c = new Color(62,62,62);
                    //disabling all GameMaster Buttons
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
                    //Resetting Yards to go Textbox
                    yardsToGo.setText("");
                    yardsToGo.setEnabled(true);
                    //updating score
                    updateScore(pLog);
                    pt = new PlayType();
                    //resetting button bkgs
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
                }else if(response == JOptionPane.CLOSED_OPTION){
                    System.out.println("Penalty Denied");
                    Color c = new Color(62,62,62);
                    //disabling all GameMaster Buttons
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
                    //Resetting Yards to go Textbox
                    yardsToGo.setText("");
                    yardsToGo.setEnabled(true);
                    //updating score
                    updateScore(pLog);
                    pt = new PlayType();
                    //resetting button bkgs
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
            }
        });

        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color c = new Color(62,62,62);
                //disabling all GameMaster Buttons
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
                //Resetting Yards to go Textbox
                yardsToGo.setText("");
                yardsToGo.setEnabled(true);
                //updating score
                updateScore(pLog);
                pt = new PlayType();
                //resetting button bkgs
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
                //System.out.println("play type: " + pt.getPlayType());
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
                //System.out.println("play type: " + pt.getPlayType());
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
                //System.out.println("play type: " + pt.getPlayType());
                //System.out.println("yardage: " + pt.getYardage());
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
                //System.out.println("touchdown: " + pt.isTouchdown());
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
                //System.out.println("fumble: " + pt.isFumble());
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
                //System.out.println("interception: " + pt.isInterception());
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
                //System.out.println("safety: " + pt.isSaftey());
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
                //System.out.println("sack: " + pt.isSack());
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
                    //System.out.println("yardage: " + pt.getYardage());
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
                    //System.out.println("yardage: " + pt.getYardage());
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
                    //System.out.println("yardage: " + pt.getYardage());
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
                    //System.out.println("yardage: " + pt.getYardage());
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
                    //System.out.println("yardage: " + pt.getYardage());
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
                    //System.out.println("yardage: " + pt.getYardage());
                    negative.setBackground(resetbkg);
                    zero_ten.setBackground(resetbkg);
                    ten_twentyfive.setBackground(resetbkg);
                    twentyfive_forty.setBackground(resetbkg);
                    forty_sixty.setBackground(resetbkg);
                    sixty.setBackground(c);
                }
            }
        });
        End_Game.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int response = JOptionPane.showConfirmDialog(JOptionPane.getRootFrame(), "Are you sure you want to end the game?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(response == JOptionPane.YES_OPTION) {
                    System.out.println("Game Ended");
                    gameEnd = true;
                }else if(response==JOptionPane.NO_OPTION){
                    System.out.println("Game continuing");
                    gameEnd = false;
                }else if(response == JOptionPane.CLOSED_OPTION){
                    System.out.println("Game continuing");
                    gameEnd = false;
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
    public boolean isGameEnd(){
        return gameEnd;
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
            /*System.out.println(userPlay);
            System.out.println(userYard);
            System.out.println(userTouchdown);
            System.out.println(userFumble);
            System.out.println(userSack);
            System.out.println(userSafety);
            System.out.println(userInterception);*/
            //compare to GM play book
            //update user score
            int score = u.getScore();
            //System.out.println(score);
            int failcount = 0;
            boolean correct = false;
            if (userPlay == pt.getPlayType())
                score += 10;
            if (ytg > 60){
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
                else{
                    if (pt.getYardage() == 1){
                        if (userYard == 2)
                            score += 5;
                        if (userYard == 3)
                            score -= 10;
                        if (userYard == 4)
                            score -= 20;
                        if (userYard == 5)
                            score -= 25;
                    }
                    if (pt.getYardage() == 2){
                        if (userYard == 1)
                            score += 5;
                        if (userYard == 3)
                            score += 15;
                        if (userYard == 4)
                            score -= 10;
                        if (userYard == 5)
                            score -= 20;
                    }
                    if (pt.getYardage() == 3){
                        if (userYard == 2)
                            score += 10;
                        if (userYard == 4)
                            score += 20;
                        if (userYard == 5)
                            score -= 10;
                    }
                    if (pt.getYardage() == 4){
                        if (userYard == 1)
                            score -= 5;
                        if (userYard == 3)
                            score += 15;
                        if (userYard == 5)
                            score += 25;
                    }
                    if (pt.getYardage() == 5){
                        if (userYard == 1)
                            score -= 5;
                        if (userYard == 2)
                            score -= 10;
                        if (userYard == 4)
                            score += 20;
                    }
                }
            }
            else if (ytg > 40 && ytg <= 60){
                if (userYard == pt.getYardage()){
                    if (userYard == 0)
                        score += 15;
                    if (userYard == 1)
                        score += 10;
                    if (userYard == 2)
                        score += 15;
                    if (userYard == 3)
                        score += 25;
                    if (userYard == 4)
                        score += 35;
                }
                else{
                    if (pt.getYardage() == 1){
                        if (userYard == 2)
                            score += 5;
                        if (userYard == 3)
                            score -= 10;
                        if (userYard == 4)
                            score -= 20;
                    }
                    if (pt.getYardage() == 2){
                        if (userYard == 1)
                            score += 5;
                        if (userYard == 3)
                            score += 10;
                        if (userYard == 4)
                            score -= 10;
                    }
                    if (pt.getYardage() == 3){
                        if (userYard == 2)
                            score += 5;
                        if (userYard == 4)
                            score += 15;
                    }
                    if (pt.getYardage() == 4){
                        if (userYard == 1)
                            score -= 5;
                        if (userYard == 3)
                            score += 15;
                    }
                }
            }
            else if (ytg > 25 && ytg <= 40){
                if (userYard == pt.getYardage()){
                    if (userYard == 0)
                        score += 10;
                    if (userYard == 1)
                        score += 10;
                    if (userYard == 2)
                        score += 15;
                    if (userYard == 3)
                        score += 20;
                }
                else{
                    if (pt.getYardage() == 1){
                        if (userYard == 2)
                            score += 5;
                        if (userYard == 3)
                            score -= 5;
                    }
                    if (pt.getYardage() == 2){
                        if (userYard == 1)
                            score += 5;
                        if (userYard == 3)
                            score += 10;
                    }
                    if (pt.getYardage() == 3){
                        if (userYard == 2)
                            score += 10;
                    }
                }
            }
            if (ytg > 10 && ytg <= 25){
                if (userYard == pt.getYardage()){
                    if (userYard == 0)
                        score += 10;
                    if (userYard == 1)
                        score += 5;
                    if (userYard == 2)
                        score += 10;
                }
            }
            if (ytg <= 10){
                if (userYard == pt.getYardage()){
                    if (userYard == 0)
                        score += 5;
                    if (userYard == 1)
                        score += 5;
                }
            }

            if (userTouchdown){
                if (pt.touchdown){
                    score += 75;
                    correct = true;
                }
                else{
                    score -= 50;
                    failcount++;
                }
            }
            if (userFumble){
                if (pt.fumble){
                    score += 50;
                    correct = true;
                }
                else{
                    score -= 30;
                    failcount++;
                }
            }
            if (userInterception){
                if (pt.interception){
                    score += 50;
                    correct = true;
                }
                else{
                    score -= 30;
                    failcount++;
                }
            }
            if (userSack){
                if (pt.sack){
                    score += 25;
                    correct = true;
                }
                else{
                    score -= 15;
                    failcount++;
                }
            }
            if (userSafety){
                if (pt.saftey){
                    score += 25;
                    correct = true;
                }
                else{
                    score -= 15;
                    failcount++;
                }
            }
            if (failcount >= 5){
                score -= 50;
                failcount = 0;
            }

            if (userPlay == pt.getPlayType() && userYard == pt.getYardage()){
                score += 25;
            }
            if (userPlay == pt.getPlayType() && userYard == pt.getYardage() && correct == true){
                score += 25;
                correct  = false;
            }
            //System.out.println(score);
            u.setScore(score);
        }
    }
    private boolean validInput(String s){
        try {
                if (yardsToGo.getText().length() == 0) {
                    Exception er = new Exception();
                    throw er;
                }
            ytg = (int) ((Double.parseDouble(yardsToGo.getText())));
            if (ytg > 100 || ytg < 0) {
                Exception er = new Exception();
                throw er;
            }
        } catch (Exception er) {
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Invalid Yards to Go");
            yardsToGo.setText("");
        }

        return true;
    }
    public PlayType userPlayType(Integer i){
       return pLog.get(i).getPlay();
    }
}
