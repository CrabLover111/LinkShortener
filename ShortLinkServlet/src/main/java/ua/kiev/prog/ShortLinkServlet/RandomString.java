package ua.kiev.prog.ShortLinkServlet;

import java.util.Locale;
import java.util.Objects;
import java.util.Random;

public class RandomString {
    public static String generate(int length) {
    // create a string of all characters
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // create random string builder
    StringBuilder sb = new StringBuilder();

    // create an object of Random class
    Random random = new Random();

    // specify length of random string


    for(int i = 0; i < length; i++) {

        // generate random index number
        int index = random.nextInt(alphabet.length());

        // get character specified by index
        // from the string
        char randomChar = alphabet.charAt(index);

        // append the character to string builder
        sb.append(randomChar);
    }

   return sb.toString();

}
private RandomString() {}
}