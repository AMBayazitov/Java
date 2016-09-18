import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by beezy on 18.09.2016.
 */
public class Task4 {

    private static boolean checkParity(int num){
        String numb=Integer.toString(num);

        Pattern check=Pattern.compile("^((2|4|6|8){3})$");
        Matcher m=check.matcher(numb);
        return m.matches();
    }

    public static void main(String[] args) {
        Random rand=new Random();
        int par=0;
        int allNum=0;

        while (par!=10){
            int num=rand.nextInt();
            allNum++;

            if(!checkParity(num)){
                par++;
                System.out.println(num);
            }
        }
        System.out.println("Всего чисел "+allNum+";");
        System.out.println("Чисел без повторении четных цифр "+par+".");
    }
}

