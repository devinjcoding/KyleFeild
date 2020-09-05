import javax.swing.*;

public class QuizIntake extends JFrame{
    private JPanel mainPanel;
    private JPanel Special_Event;
    private JPanel Yardage;
    private JPanel Play_Type;
    private JCheckBox Kick_Punt;
    private JCheckBox Pass;
    private JCheckBox Run;
    private JCheckBox negative_zero;
    private JCheckBox twentyfive_thirtyfive;
    private JCheckBox thirtyfive_fifty;
    private JCheckBox zero_ten;
    private JCheckBox fifty;
    private JCheckBox ten_twentyfive;

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
