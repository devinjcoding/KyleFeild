import java.io.FileNotFoundException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        //TODO add new user class
        ArrayList<User> pLog = new ArrayList<>();
        GameMasterGUI gM = new GameMasterGUI("Game Master", pLog);
        QuizIntake user1Quiz = new QuizIntake("Virtual 12th Man",gM);
        User one = new User(1,0,user1Quiz);
        gM.setVisible(true);
        user1Quiz.setVisible(true);
        pLog.add(one);
        gM.setVisible(false);
        user1Quiz.setVisible(false);
        LeaderBoard lb = new LeaderBoard(pLog);
        lb.initUI();
        System.out.println("Finish");
        //user1Quiz.
       /* while(true){
            if(gM.isPlayStarted()){
                user1Quiz.setVisible(false);
                user1Quiz.clearInfo();
            }else if(!gM.isPlayStarted()){
                user1Quiz.setVisible(true);
                one.setPlayType(user1Quiz.getPlayType());
            }
        }*/
        //TODO score all user class to GM
        //TODO award points to USER
        //TODO Rank USERS
    }


}
