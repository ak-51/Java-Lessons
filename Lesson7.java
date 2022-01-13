import java.util.Scanner;

public class Lesson7
{   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char answer = 'y';
        
        while(answer == 'y'){
            System.out.println("Enter the athlete's score for each event on the scale of 1 to 5 (1 being the worst and 5 being the best)");
        
            System.out.println("Fencing score:");
            int fencing = scoreValidation();
            
            System.out.println("Swimming score:");
            int swimming = scoreValidation();
            
            System.out.println("Horse Riding score:");
            int horse = scoreValidation();
            
            System.out.println("Pistol Shooting score:");
            int pistol = scoreValidation();
            
            System.out.println("Running score:");
            int running = scoreValidation();
            
            int total = fencing + swimming + horse + pistol + running;
            
            int average = total/5;
        
            System.out.println("Total score: " + total);
            System.out.println("Average score: " + average);
            
            switch(average) {
                case 1:
                    System.out.println("Result: Unqualified");
                    break;
                
                case 2:
                    System.out.println("Result: Join Training Squad");
                    break;
                
                case 3:
                    System.out.println("Result: Join Development Team");
                    break;
                    
                case 4:
                    System.out.println("Result: Join Elite Training Team");
                    break;
                    
                case 5:
                    System.out.println("Resoult: Qualified for Olympic Team");
                    break;
                
                default:
                    System.out.println("This shouldn't happen");
                    break;
            }
            
            System.out.println("Would you like to enter information for other athletes? (y/n)");
            answer = sc.next().charAt(0);
        }
    }
    
    public static int scoreValidation(){
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;
        int inp = 0;
        
        while(!isValid){
            
            if(sc.hasNextInt()){
                inp = sc.nextInt();
                if(inp < 1 || inp > 5){
                    System.out.println("Your guess has to be between 1 and 5 (inclusive). Try again:");
                }
                else{
                    isValid = true;
                }
            }
            else{
                System.out.println("Your guess has to be an integer. Try again:");
                sc.next();
            }
        }
        
        return inp;
    }
}
