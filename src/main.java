import java.io.FileNotFoundException;
import java.util.HashMap;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        //TODO add new user class
        HashMap<Integer, PlayType> pLog = new HashMap<>();
        GameMasterGUI frame = new GameMasterGUI("Game Master", pLog);
        QuizIntake user1Quiz = new QuizIntake("Virtual 12th Man",frame.isPlayStarted());
        User one = new User(1,0,user1Quiz);
        frame.setVisible(true);
        user1Quiz.setVisible(true);
        pLog.put(one.getID(),user1Quiz.getPlayType());
        while(true){
            if(frame.isPlayStarted()){
                user1Quiz.setVisible(false);
                user1Quiz.clearInfo();
            }else if(!frame.isPlayStarted()){
                user1Quiz.setVisible(true);
                one.setPlayType(user1Quiz.getPlayType());
            }
        }
        //TODO score all user class to GM
        //TODO award points to USER
        //TODO Rank USERS
    }


}
