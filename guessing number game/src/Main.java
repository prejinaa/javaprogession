import java.util.Scanner;

public class Main {
    //call the function
    public static void guessNumber() {
        Scanner sc = new Scanner(System.in);
        // generate random number
        int number = (int) (1 + 100 * Math.random());
        int N = 5;
        int i, guess;
        System.out.println("Enter the number between 1 to 100");
        for (i = 0; i < number; i++) {
            System.out.println("Guess the number");
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println(" congregation you win a guessing game");
                break;
            } else if (number > guess && i != N - 1) {
                System.out.println("The number is greater then guess number");

            } else if (number < guess && i != N - 1) {
                System.out.println("the number is less than guess number");
            }

            System.out.println("the number"+N);
        }

        if (i == N) {
            System.out.println("Out from trial please try again");
        }
    }
        public static void main (String[]args){
            //call the function
            guessNumber();
        }
    }
