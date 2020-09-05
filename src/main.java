import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.*;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        //TODO add new user class
        QuizIntake user1Quiz = new QuizIntake("Virtual 12th Man");
        User one = new User(1,0);
        Map<Integer, PlayType> pLog = new HashMap<Integer, PlayType>();
        //pLog.put(one.getID(),user1Quiz);
        JFrame frame = new GameMasterGUI("Game Master", pLog);
        frame.setVisible(true);
        user1Quiz.setVisible(true);
        while(1==1){
            QuizIntake user1Quiz = new QuizIntake("Virtual 12th Man");
        }
        //TODO score all user class to GM
        //TODO award points to USER
        //TODO Rank USERS
    }


}
