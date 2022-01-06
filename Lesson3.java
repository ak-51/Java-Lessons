import java.util.Scanner;
import java.util.Random;

public class Lesson3
{
    public static int invalidGuess = 0;
    
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        
        Random random = new Random();
        int max = 20;
        int min = 1;
        int randomInt = random.nextInt(max - min) + min;
        
        System.out.println("You have to guess a number between "+min+" and "+max);
        //System.out.println(randomInt);
        
        int guess = min-1;
        int count = 0;

        while(guess != randomInt){
            System.out.println("Enter your guess:");
            
            
            guess = guessInput();
            while(guess < min || guess > max){
                
                if(guess < min){
                    invalidGuess++;
                    System.out.println("Your guess cannot be less than "+min+". Try again:");
                    guess = guessInput();
                }
                else if(guess > max){
                    invalidGuess++;
                    System.out.println("Your guess cannot be more than "+max+". Try again:");
                    guess = guessInput();
                }
            }
            count++;
            
            if(guess > randomInt){
                if(count == 5){
                    System.out.println("You have guessed incorrectly too many times");
                    System.out.println("There were "+invalidGuess+" invalid tries.");
                    break;
                }
                else{
                    System.out.println("Lower");
                }
            }
            else if(guess < randomInt){
                if(count == 5){
                    System.out.println("You have guessed incorrectly too many times");
                    System.out.println("There were "+invalidGuess+" invalid tries.");
                    break;
                }
                else{
                    System.out.println("Higher");
                }
            }
            else if(guess == randomInt){
                System.out.println("Congratulations, you have guessed the number in "+count+" tries!");
                System.out.println("There were "+invalidGuess+" invalid tries.");
            }
        }
    }
    
    public static int guessInput(){
        Scanner obj = new Scanner(System.in);
        int guess = 0;
        boolean isValid = false;
        
        while(isValid == false){
            if(obj.hasNextInt()){
                guess = obj.nextInt();
                isValid = true;
            }
            else{
                System.out.println("Your guess has to be an integer. Try again: ");
                invalidGuess++;
                obj.next();
            }
            
        }

        return guess;
    }
}
