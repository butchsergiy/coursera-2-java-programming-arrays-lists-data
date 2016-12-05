/**
 * Created by BSV on 30.11.2016.
 */
public class CaesarCipher {

    private final String abcABC = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";        // alphabet
    private final String abc = "abcdefghijklmnopqrstuvwxyz";                                // alphabet
    private String xyz;                                             // crypto alphabet

    /*
    Encrypt method with StringBuilder
     */
    public String encrypt(String str, int key) {
        StringBuilder strB = new StringBuilder();
        if (key < 0) key = 0;
        if (key > abc.length()) key = key % abc.length();

        xyz = abc.substring(key) + abc.substring(0, key);

        int x;
        boolean uppercase;
        for (int i = 0; i < str.length(); i++) {
            x = abc.indexOf(String.valueOf(str.charAt(i)).toLowerCase());

            if (x >= 0) uppercase = !abc.contains(str.subSequence(i, i + 1));
            else uppercase = false;

            if (x >= 0) strB.append(uppercase ? Character.toUpperCase(xyz.charAt(x)) : xyz.charAt(x));
            else strB.append(str.charAt(i));
        }
        return strB.toString();
    }


    /*
    encrypt method without StringBuilder
     */
    public String encryptV2(String str, int key) {
        if (key < 0) key = 0;
        if (key > abcABC.length()) key = key % abcABC.length();

        xyz = abcABC.substring(key) + abcABC.substring(0, key);
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (abcABC.indexOf(str.charAt(i)) < 0) result += str.charAt(i);
            else result += xyz.charAt(abcABC.indexOf(str.charAt(i)));
        }

        return result;
    }


    /*
     This method returns a String that has been encrypted using the following algorithm.
     Parameter key1 is used to encrypt every other character with the Caesar Cipher algorithm,
     starting with the first character,
     and key2 is used to encrypt every other character, starting with the second character.
     */
    public String encryptTwoKeys(String input, int key1, int key2) {
        if (key1 < 0) key1 = 0;
        if (key1 > abc.length()) key1 = key1 % abc.length();
        if (key2 < 0) key2 = 0;
        if (key2 > abc.length()) key2 = key2 % abc.length();

        String crypted1 = encrypt(input, key1);
        String crypted2 = encrypt(input, key2);
        StringBuilder output = new StringBuilder();

        for(int i = 0; i <input.length(); i++) {
            output.append(i % 2 == 0 ? crypted1.charAt(i) : crypted2.charAt(i));
        }

        return output.toString();
    }

    public String decode(String code, int key) {
        return encrypt(code, abcABC.length() - key);
    }
}
