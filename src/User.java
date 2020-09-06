public class User {
    int ID=0;
    int score = 0;
    PlayType play;
    public User(int id, int sc, PlayType pt){
        ID =id;
        score = sc;
        play = pt;
    }
    public User(int id, int sc){
        ID =id;
        score = sc;
    }

    public int getID() {
        return ID;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public void setPlayType(PlayType pt){
        play = pt;
    }
    public PlayType getPlay() {
        return play;
    }

    @Override
    public String toString() {
        return "ID=" + ID + "score=" + score;
    }
}
