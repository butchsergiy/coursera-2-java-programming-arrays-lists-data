/**
 * Created by BSV on 30.11.2016.
 */
public class CaesarCipher {

    private final String abc = "abcdefghijklmnopqrstuvwxyz";        // alphabet
    private String xyz;                                             // crypto alphabet

    public String code(String str, int key) {
        if (key < 0) key = 0;
        if (key > abc.length()) key = key % abc.length();

        xyz = abc.substring(key) + abc.substring(0, key);
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(abc.indexOf(str.charAt(i))<0) result += str.charAt(i);
            else result += xyz.charAt(abc.indexOf(str.charAt(i)));
        }

        return result;
    }

    public String codeV2(String str, int key) {
        StringBuilder strB = new StringBuilder(str);
        if (key < 0) key = 0;
        if (key > abc.length()) key = key % abc.length();

        xyz = abc.substring(key) + abc.substring(0, key);

        return  null;
    }



    public String decode(String code, int key) {
        return code(code, abc.length() - key);
    }
}
