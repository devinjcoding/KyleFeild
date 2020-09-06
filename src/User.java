public class User {
    int ID=0;
    int score = 0;
    PlayType play;
    public User(int id, int sc){
        ID =id;
        score = sc;
        play = null;
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
}
