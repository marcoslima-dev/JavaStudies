import java.util.Random;
import java.util.Scanner;

public class NumberGame {

        public static void tip (int guess , int number, int attempts ) {
            if(guess > number) {
                System.out.println("Your guess is bigger than the number drawn");
            } else {
                if(guess < number) {
                    System.out.println("Your guess is less than the number drawn");
                }else {
                    System.out.println("Congratulations! You're right. The number was:" + number);
                    System.out.println("You tried " + attempts + " times before you got it right");
                }
            }
        }

        public static void main(String[] args){
            int guess,
                    drawn,
                    attempts=0;

            Scanner entry = new Scanner(System.in);

            Random createRandom = new Random();
            drawn = createRandom.nextInt(100) + 1;
            System.out.println("Number between 1 to 100 drawn");

            do{
                System.out.print("\n\n\n\n-----------------\n");
                System.out.println("Number of attempts " + attempts);

                System.out.print("What's your guess:");
                guess = entry.nextInt();

                attempts++;

                tip(guess,drawn,attempts);
            }while(guess != drawn);


        }

}
