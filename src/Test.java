public class Test {
    public static void main(String[] args) {
        PlayType test = new PlayType();
        PlayType test1 = new PlayType((byte)(0),(byte)(0),(byte)(0));
        System.out.println(test);
        System.out.println(test1);
        test1.setPlayType((byte)1);
        test1.setSpecial((byte)1);
        test1.setYardage((byte)1);
        System.out.println(test1);
        System.out.println(test1.getPlayType());
        System.out.println(test1.getSpecial());
        System.out.println(test1.getYardage());
    }
}
