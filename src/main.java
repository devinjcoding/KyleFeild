import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        //TODO add new user class
        File f = new File("UserLog.txt");
        Scanner file = new Scanner(f);
        ArrayList<User> pLog = new ArrayList<>();
        User one = new User(1,0);
        pLog.add(one);
        GameMasterGUI gM = new GameMasterGUI("Game Master", pLog);
        QuizIntake user1Quiz = new QuizIntake("Virtual 12th Man",gM,one);
        gM.setVisible(true);
        user1Quiz.setVisible(true);
        gM.setVisible(false);
        user1Quiz.setVisible(false);
        while(file.hasNext()){
            int id = file.nextInt();
            int sc = file.nextInt();
            pLog.add(new User(id,sc));
        }
        LeaderBoardGUI lb = new LeaderBoardGUI("Leaderboard", pLog,one); //For more people change this user call
        lb.setVisible(true);
        lb.setSize(1000,750);
        System.out.println("Finish");

    }


}
