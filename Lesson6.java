import java.util.Scanner;

public class Lesson6
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number for which you want the times table: ");
        int num = sc.nextInt();
        
        System.out.println("Enter the number of times you want to display the this: ");
        int times = sc.nextInt();
        
        System.out.println("Times table for " +num+ ":");
        for(int i = 1; i <= times; i++){
            System.out.println(num + " x " + i + " = " +(num*i));
        }
    }
}
