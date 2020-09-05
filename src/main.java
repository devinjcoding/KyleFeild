import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.*;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        //TODO add new user class
        Map<Integer, PlayType> pLog = new HashMap<Integer, PlayType>();
        QuizIntake user1 = new QuizIntake("Virtual 12th Man");
        JFrame frame = new GameMasterGUI("Game Master", pLog);
        frame.setVisible(true);
        //TODO score all user class to GM
        //TODO award points to USER
        //TODO Rank USERS
    }


}
