public class PlayType {
    byte playType;
    byte yardage;
    byte special;
    public PlayType(){
        playType = 8;
        yardage = 8;
        special = 8;
    }

    public PlayType(byte pT, byte yard, byte spec){
        playType = pT;
        yardage = yard;
        special = spec;
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

    public void setSpecial(byte special) {
        this.special = special;
    }

    public byte getSpecial() {
        return special;
    }

    @Override
    public String toString() {
        return "PlayType{" +
                "playType=" + playType +
                ", yardage=" + yardage +
                ", special=" + special +
                '}';
    }
}
