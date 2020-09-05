import javax.swing.*;

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

    public QuizIntake(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }

    public static void main(String[] args){
        JFrame frame = new QuizIntake("My QuizIntake");
        frame.setVisible(true);
    }
}
