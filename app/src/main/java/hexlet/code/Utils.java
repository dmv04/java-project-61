package hexlet.code;

public class Utils {
    public static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * max + min);
    }
}
