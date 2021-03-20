import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrom {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        try {
            s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(polyNumber(s));
    }

    private static boolean polyNumber(String number) {
        if (number.length() - 1 == 0) {
            return true;
        }
        else {
            String first = number.substring(0,1);
            String last = number.substring(number.length() - 1);
            System.out.println(first + " - " + last);
            if (number.length() - 1 <= 1) {
                return first.equals(last);
            }
            else {
                System.out.println(number.substring(1, number.length() - 1));
                return (first.equals(last)) && polyNumber(number.substring(1, number.length() - 1));
            }
        }
    }
}