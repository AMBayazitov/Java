import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by beezy on 18.09.2016.
 */
public class Task2 {
    private static boolean operatorCheck(String numberOfOperator) {
        Pattern check = Pattern.compile("^8-\\d{3}-\\d{3}-\\d{2}-\\d{2}$");
        Matcher m = check.matcher(numberOfOperator);
        return m.matches();
    }

    public static void main(String[] args) {
        System.out.println(operatorCheck("8(123)456-78-90"));
        System.out.println(operatorCheck("89870027914"));
        System.out.println(operatorCheck("+7(123)456-49-77"));
        System.out.println(operatorCheck("8-123-455-78-90"));
    }
}
