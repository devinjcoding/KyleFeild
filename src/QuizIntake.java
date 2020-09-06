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
    public PlayType pt;
    private GameMasterGUI gM;
    private int count;
    private int count2;
    private int x;

    private boolean playStarted;

    public QuizIntake(String title, GameMasterGUI gM) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.gM = gM;
        count = 0;
        count2 = 0;
        pt = new PlayType();
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

        while(!gM.isGameEnd()) {
            while (!gM.isGameEnd() && !gM.isPlayStarted() ) {
                if (count == 0) {
                    clearInfo();
                    gM.setVisible(true);
                    this.setVisible(true);
                    checkPlayStart();
                    count++;
                    count2 = 0;
                }
                pt = new PlayType();
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
                //playtype
                Run.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Color c = new Color(60, 0, 0);
                        Color resetbkg = new Color(62, 62, 62);
                        pt.setPlayType((byte) (0));
                        //System.out.println("play type: " + pt.getPlayType());
                        Run.setBackground(c);
                        Pass.setBackground(resetbkg);
                        Kick_Punt.setBackground(resetbkg);

                    }
                });
                Pass.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        Color c = new Color(60, 0, 0);
                        Color resetbkg = new Color(62, 62, 62);
                        pt.setPlayType((byte) (1));
                        //System.out.println("play type: " + pt.getPlayType());
                        Run.setBackground(resetbkg);
                        Pass.setBackground(c);
                        Kick_Punt.setBackground(resetbkg);
                    }
                });
                Kick_Punt.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        Color c = new Color(60, 0, 0);
                        Color resetbkg = new Color(62, 62, 62);
                        pt.setPlayType((byte) (2));
                        pt.setYardage((byte) (8));
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

                //yardage
                negative.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (pt.getPlayType() != 2) {
                            Color c = new Color(60, 0, 0);
                            Color resetbkg = new Color(62, 62, 62);
                            pt.setYardage((byte) (0));
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
                        if (pt.getPlayType() != 2) {
                            Color c = new Color(60, 0, 0);
                            Color resetbkg = new Color(62, 62, 62);
                            pt.setYardage((byte) (1));
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
                        if (pt.getPlayType() != 2) {
                            Color c = new Color(60, 0, 0);
                            Color resetbkg = new Color(62, 62, 62);
                            pt.setYardage((byte) (2));
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
                        if (pt.getPlayType() != 2) {
                            Color c = new Color(60, 0, 0);
                            Color resetbkg = new Color(62, 62, 62);
                            pt.setYardage((byte) (3));
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
                        if (pt.getPlayType() != 2) {
                            Color c = new Color(60, 0, 0);
                            Color resetbkg = new Color(62, 62, 62);
                            pt.setYardage((byte) (4));
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
                        if (pt.getPlayType() != 2) {
                            Color c = new Color(60, 0, 0);
                            Color resetbkg = new Color(62, 62, 62);
                            pt.setYardage((byte) (5));
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
                //special events
                Touchdown.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (Touchdown.isSelected()) {
                            pt.setTouchdown(true);
                        }
                        if (!Touchdown.isSelected()) {
                            pt.setTouchdown(false);
                        }
                        //System.out.println("predicted touchdown: " + pt.isTouchdown());
                    }
                });
                Fumble.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (Fumble.isSelected()) {
                            pt.setFumble(true);
                        }
                        if (!Fumble.isSelected()) {
                            pt.setFumble(false);
                        }
                        //System.out.println("predicted fumble: " + pt.isFumble());
                    }
                });
                Interception.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (Interception.isSelected()) {
                            pt.setInterception(true);
                        }
                        if (!Interception.isSelected()) {
                            pt.setInterception(false);
                        }
                        //System.out.println("predicted interception: " + pt.isInterception());
                    }
                });
                Safety.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (Safety.isSelected()) {
                            pt.setSaftey(true);
                        }
                        if (!Safety.isSelected()) {
                            pt.setSaftey(false);
                        }
                        //System.out.println("predicted safety: " + pt.isSaftey());
                    }
                });
                Sack.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (Sack.isSelected()) {
                            pt.setSack(true);
                        }
                        if (!Sack.isSelected()) {
                            pt.setSack(false);
                        }
                        //System.out.println("predicted sack: " + pt.isSack());
                    }
                });
            }
            while (gM.isPlayStarted()) {
                if (count2 == 0) {
                    checkPlayStart();
                    count2++;
                    count = 0;
                }
                checkPlayStart();
            }
        }
        //
    }
    public void setPlayStarted(boolean ps){
        playStarted = ps;
    }
    public boolean isPlayStart(){
        return playStarted;
    }
    public PlayType getPlayType(){
        return new PlayType();
    }
    public Boolean getRun() {
        return getRun().booleanValue();
    }
    public void clearInfo(){
        Color c = new Color(62, 62, 62);
        pt.setSaftey(false);
        pt.setInterception(false);
        pt.setTouchdown(false);
        pt.setSack(false);
        pt.setFumble(false);
        pt.setYardage((byte)8);
        pt.setPlayType((byte)8);
        negative.setBackground(c);
        zero_ten.setBackground(c);
        ten_twentyfive.setBackground(c);
        twentyfive_forty.setBackground(c);
        forty_sixty.setBackground(c);
        sixty.setBackground(c);
        Run.setBackground(c);
        Pass.setBackground(c);
        Kick_Punt.setBackground(c);
        Touchdown.setSelected(false);
        Fumble.setSelected(false);
        Interception.setSelected(false);
        Safety.setSelected(false);
        Sack.setSelected(false);
    }
    public void checkPlayStart(){
        if(gM.isPlayStarted()){
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
        }else{
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
        }
    }
}
