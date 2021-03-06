import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by beezy on 18.09.2016.
 */
public class Task5 {
    public static boolean checkNum(int num){
        String num2=Integer.toString(num);

        Pattern checkNum=Pattern.compile("^(2|4|6|8){3,5}$");
        Matcher m=checkNum.matcher(num2);
        return m.matches();
    }


    public static void main(String[] args) {
        Random rand = new Random(100 - 1000000);
        int par = 0;
        int allNum = 0;

        while (par!=10){
            int num=rand.nextInt();
            allNum++;

            if (checkNum(num)) {
                par++;
                System.out.println(num);
            }

        }
        System.out.println("Всего чисел "+allNum+";");
        System.out.println("Без нечетных чисел "+par+".");

    }
}
