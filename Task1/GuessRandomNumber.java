import java.util.Scanner;
import java.util.Random;

public class GuessRandomNumber {
    public static void main(String args[]) {
        int upper = 100;
        int lower = 0;
        int r = (int) (Math.random() * (upper - lower)) + lower;
        boolean t = false;
        int n;
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int p = 10;
        for (int i = 0; p > 0; i++) {
            System.out.println("GUESS THE NUMBER");
            System.out.println("YOU HAVE 10 CHANCES TO GUESS THE CORRECT ANSWER, ALL THE BEST!!");
            n = sc.nextInt();
            if (n == r) {
                System.out.println("YOUR SCORE IS :" + score);
                System.out.println("YOUR GUESS IS CORRECT");
                t = true;
                break;
            } else if (n <= r) {
                score++;
                p--;
                System.out.println("YOUR NUMBER IS TOO LOW");
                System.out.println("YOU HAVE " + p + " CHANCES REMAINING");
            } else if (n >= r) {
                score++;
                p--;
                System.out.println("YOUR NUMBER IS TOO HIGH");
                System.out.println("YOU HAVE " + p + " CHANCES REMAINING");
            }
        }
        if (p == 0)
            System.out.println("YOUR CHANCES ARE OVER, TRY AGAIN!!");
    }
}
