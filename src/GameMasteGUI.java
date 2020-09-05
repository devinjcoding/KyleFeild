import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameMasteGUI extends JFrame {
    private JPanel mainPanel;
    private JButton Penalty;
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
    private JButton submitButton;

    private byte play_type;
    private byte yardage;
    private boolean td;
    private boolean fum;
    private boolean intercept;
    private boolean safe;
    private boolean sk;

    public GameMasteGUI(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        play_type = 8;
        yardage = 8;
        td = false;
        fum = false;
        intercept = false;
        safe = false;
        sk = false;
        PlayType pt = new PlayType(play_type, yardage,td,sk,intercept,fum,safe);

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
    public static void main(String[] args){
        JFrame frame = new GameMasteGUI("Game Master");
        frame.setVisible(true);
    }
}
