package codingbat.string1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String i = str.substring(str.length()-2);
        return i + i + i;
    }
}
