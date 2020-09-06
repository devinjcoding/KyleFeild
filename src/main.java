import java.io.FileNotFoundException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        //TODO add new user class
        ArrayList<User> pLog = new ArrayList<>();
        User one = new User(1,0);
        pLog.add(one);
        GameMasterGUI gM = new GameMasterGUI("Game Master", pLog);
        QuizIntake user1Quiz = new QuizIntake("Virtual 12th Man",gM,one);
        gM.setVisible(true);
        user1Quiz.setVisible(true);
        pLog.add(one);
        gM.setVisible(false);
        user1Quiz.setVisible(false);
        LeaderBoardGUI lb = new LeaderBoardGUI("Leaderboard", pLog,one); //For more people change this user call
        System.out.println("Finish");
        //TODO Rank USERS
    }


}
