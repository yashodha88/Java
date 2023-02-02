import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computerGuess = (int)(Math.random()*5 + 1);
        System.out.println(computerGuess);
        System.out.print("I choose a number betweeen 1 and 5." + " Try to guess it:");
        int userGuess = sc.nextInt();
        while(true){
            if(userGuess == computerGuess){
                System.out.println("You got it!");
                System.exit(0);
            }
            else{
                System.out.print("Guess again:");
                userGuess = sc.nextInt();
            }
        }
    }
}
