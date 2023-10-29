//task 1
/*import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку и количество её повторений.");
        System.out.println("Введите строку: ");
        String word = in.nextLine();
        System.out.print("Введите число повторений: ");
        int num = in.nextInt();
        if(num <=0)
        {
            System. exit(0);
        }
        for(int i = 0; i<num; i++)
        {
            System.out.println(word);
        }
    }
} */
//task 2
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int res = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество литров и количество раз. ");
        System.out.println("Введите количество литров: ");
        int num = in.nextInt();
        System.out.print("Введите количество раз: ");
        int times = in.nextInt();
        if (num < 0 || times < 0) {
            System.out.print("Введены некорректные данные ");
            System.exit(0);
        }
        for (int i = 0; i < 16; i++) {
            res += (num * times);
            System.out.println("К " + i + " неделе будет выпито " + res + " литров жидкости");
        }
        if (res >= 120) {
            System.out.print("Студент принят в IT-клуб");
        } else {
            System.out.print("К сожалению, студент не принят в клуб");
        }
    }
}