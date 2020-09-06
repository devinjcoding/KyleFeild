import java.io.FileNotFoundException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        //TODO add new user class
        ArrayList<User> pLog = new ArrayList<>();
        GameMasterGUI frame = new GameMasterGUI("Game Master", pLog);
        QuizIntake user1Quiz = new QuizIntake("Virtual 12th Man",frame.isPlayStarted());
        User one = new User(1,0,user1Quiz);
        frame.setVisible(true);
        user1Quiz.setVisible(true);
        pLog.add(one);
       /* while(true){
            if(frame.isPlayStarted()){
                user1Quiz.setVisible(false);
                user1Quiz.clearInfo();
            }else if(!frame.isPlayStarted()){
                user1Quiz.setVisible(true);
                one.setPlayType(user1Quiz.getPlayType());
            }
        }*/
        //TODO score all user class to GM
        //TODO award points to USER
        //TODO Rank USERS
    }


}
