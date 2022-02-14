import java.util.*;
import java.io.*;

public class Lesson12
{
    public static void main (String [] args) throws IOException{   
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> points = new ArrayList<Integer>();
        
        names.add("Luca");
        names.add("Lauren");
        names.add("Colin");
        names.add("Nina");
        names.add("Maggie");
        
        points.add(150);
        points.add(100);
        points.add(85);
        points.add(50);
        points.add(110);
        
        int max = 0;
        String maxName = "";
        
        System.out.println("Name: Points");
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i) + ": " + points.get(i));
        }
        
        for(int i = 0; i < points.size(); i++){
            if(points.get(i) > max){
                maxName = names.get(i);
                max = points.get(i);
            }
        }
        
        System.out.println("Student with the most house points: " + maxName);
        
        int num100 = 0;
        for(int i = 0; i < points.size(); i++){
            if(points.get(i) > 100){
                num100++;
            }
        }
        
        System.out.println("No. of students who have more than 100 house points: " + num100);
        
        int totalPoints = 0;
        for(int i = 0; i < points.size(); i++){
            totalPoints += points.get(i);
        }
        System.out.println("Total number of house points: " + totalPoints);
    }
}