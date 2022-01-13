import java.util.Scanner;
import java.io.PrintStream;

public class Lesson8 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        String [] teacherNames = {"McAlpine","Lees", "Rowan", "Perkins", "Wynd", "Magnus"};
        System.out.println("There are " + teacherNames.length + " teachers in your 1D array");
        
        int[] lateTimes = new int[6];
        
        int total = 0;
        
        for(int i = 0; i < 6; i++){
            System.out.println("Enter how many times " + teacherNames[i] + " has been late: ");
            lateTimes[i] = inputValidation();
            total += lateTimes[i];
        }
        
        float average = total/6;
        
        boolean aboveAverage[] = new boolean[6];
        
        for(int i = 0; i < 6; i++){
            if(lateTimes[i] > average){
                aboveAverage[i] = true;
            }
            else{
                aboveAverage[i] = false;
            }
        }
        
        System.out.println("Teacher Data:");
        for(int i = 0; i < 6; i++){
            System.out.println(teacherNames[i] +"- " + "Late Times: " +lateTimes[i] + ", Above Average Late Times: " + aboveAverage[i]);
        }
        
        System.out.println("Total Late Times: " + total);
        
        System.out.println("Average Late Times: " + average);
    }
    
    public static int inputValidation(){
        Scanner sc = new Scanner(System.in);
        int inp = 0;
        boolean valid = false;
        
        while(!valid){
            if(sc.hasNextInt()){
                inp = sc.nextInt();
                if(inp < 0){
                    System.out.println("Input has to be more than or equal to 0. Try again: ");
                }
                else{
                    valid = true;
                }
            }
            else{
                System.out.println("Input has to be an integer. Try again: ");
                sc.next();
            }
        }
        
        return inp;
    }

}