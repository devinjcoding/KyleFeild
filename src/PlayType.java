public class PlayType {
    byte playType;
    byte yardage;
    boolean touchdown,sack,interception, fumble, saftey;
    public PlayType(){
        playType = 8;
        yardage = 8;
        touchdown = sack = interception = fumble = saftey = false;
    }

    public PlayType(byte pT, byte yard, boolean td, boolean s, boolean i, boolean f, boolean sa){
        playType = pT;
        yardage = yard;
        touchdown = td;
        sack = s;
        interception = i;
        fumble = f;
        saftey = sa;
    }

    public void setPlayType(byte playType) {
        this.playType = playType;
    }

    public byte getPlayType() {
        return playType;
    }

    public byte getYardage() {
        return yardage;
    }

    public void setYardage(byte yardage) {
        this.yardage = yardage;
    }

    public boolean isFumble() {
        return fumble;
    }

    public boolean isInterception() {
        return interception;
    }

    public boolean isSack() {
        return sack;
    }

    public boolean isSaftey() {
        return saftey;
    }

    public boolean isTouchdown() {
        return touchdown;
    }

    public void setFumble(boolean fumble) {
        this.fumble = fumble;
    }

    public void setInterception(boolean interception) {
        this.interception = interception;
    }

    public void setSack(boolean sack) {
        this.sack = sack;
    }

    public void setSaftey(boolean saftey) {
        this.saftey = saftey;
    }

    public void setTouchdown(boolean touchdown) {
        this.touchdown = touchdown;
    }

    @Override
    public String toString() {
        return playType + " " + yardage + " " + touchdown + " " + interception + " " + fumble + " " + sack + " "+ saftey;
    }
}
