import java.util.Scanner;

public class Lesson2
{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = myObj.nextLine();
        
        int bagNumber = 0;
        
        while (true){
           System.out.println("Enter your number of bags: ");
           bagNumber = myObj.nextInt();
           
           if(bagNumber < 0){
               System.out.println("Invalid input. Number of bags cannot be lower than 0");
               System.out.println("Please try again");
           }
           else{
               break;
           }
        }
        
        
        float bagWeight = 0;
        int extraCharge = 0;
        if(bagNumber > 0){
            while (true) {
                System.out.println("Enter the total weight of the bags (in kg): ");
                bagWeight = myObj.nextFloat();
                
                if(bagWeight < 0){
                    System.out.println("Invalid input. Weight of bags cannot be less than 0 kg");
                    System.out.println("Please try again");
                }
                else if(bagWeight > 100){
                    System.out.println("Invalid input. Weight of bags cannot be more than 100 kg");
                    System.out.println("Please try again");
                }
                else{
                    break;
                }
            }
            
            
            if(bagNumber > 2){
                extraCharge += (20 * (bagNumber-2));
            }
            
            if (bagWeight > 22.5) {
                extraCharge += 50;
            }
        }
        System.out.println("User Info: ");
        System.out.println("Passenger Name: " + name);
        System.out.println("Number of bags: " + bagNumber);
        if(bagNumber > 0){
            System.out.println("Total Baggage Weight: " + bagWeight + " kg");
            System.out.println("Extra Charges: $" + extraCharge);
        }
        else{
            System.out.println("You have a $20 drinks voucher!");
        }
    }
}
