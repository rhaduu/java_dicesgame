import java.util.Scanner;
import  java.util.Random;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random dice = new Random();
        //setting the up the dice to generate only numbers from 1 to 6
        int result = dice.nextInt(6)+1;
        char opt;

        System.out.print("Let's play dices! \n You got: "+result+"\n Do you want to play again? Y/N:");
        opt = scan.next().charAt(0);
        System.out.println();

        //checks the user's option to play or not to play again. if the answer is Y or y the cycle goes on
            if (opt == 'Y' || opt == 'y'){
                while (opt == 'Y' || opt == 'y') {
                    System.out.print( "You got: " + result + "\n Do you want to play again? Y/N:");
                    result = dice.nextInt(6)+1;
                    opt = scan.next().charAt(0);
                    System.out.println();

                    // the cycle ends when the user changes his option 
                    if (opt == 'N'|| opt == 'n'){
                        System.out.println("Thanks for playinig! :)");
                    }
                }
            }
            //the program ends with no other repeat if the user's first option is different from Y or y
            else {
                System.out.println("Thanks for playing! :)");
                System.exit(0);
            }
    }
}