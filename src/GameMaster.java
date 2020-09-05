import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameMaster {
    Scanner file;

    public GameMaster() throws FileNotFoundException {
        file = new Scanner(new File("Gameplays.txt"));
    }
    public String Play(){
        return file.nextLine();
    }
}
