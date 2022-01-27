import java.util.Scanner;

public class Lesson9
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] driverNames = new String[]{"Tenor", "Shoemaker", "Hamilweight", "SoloAlon", "Mountain"};
        String[] country = new String[]{"Brazil", "Germany", "UK", "Brazil", "UK"};
        int[] points = new int[]{23, 45, 32, 15, 81};
        
        System.out.println("Do you want to search for a country(1), driver(2) or all(3)? Enter 4 to Exit.");
        int searchWhat = sc.nextInt();
        
        switch(searchWhat){
            case 1:
                boolean found = false;
                System.out.println("Enter Driver Name:");
                sc.nextLine();
                String searchName = sc.nextLine();
        
                for(int i = 0; i < driverNames.length; i++){
                    if(driverNames[i].equals(searchName)){
                        found = true;
                        System.out.println("Found driver: " + searchName);
                        System.out.println("Country: " + country[i]);
                        System.out.println("Points: " + points[i]);
                    }
                }
        
                if(!found){
                    System.out.println("Driver not found");
                }
                break;
            
            case 2:
                System.out.println("Enter Country Name:");
                sc.nextLine();
                String countrySearch = sc.nextLine();
                
                boolean found2 = false;
                for(int i = 0; i < country.length; i++){
                    if(country[i].equals(countrySearch)){
                        found2 = true;
                        System.out.println("Driver Name: " + driverNames[i]);
                        System.out.println("Points: " + points[i]);
                        System.out.println("");
                    }
                }
                
                if(!found2){
                    System.out.println("No drivers found from "+countrySearch);
                }
                break;
                
            case 3:
                for(int i = 0; i < driverNames.length; i++){
                    System.out.println("Driver Name: " + driverNames[i]);
                    System.out.println("Country: " + country[i]);
                    System.out.println("Points: " + points[i]);
                    System.out.println("");
                }
                break;
            
            case 4:
                System.exit(0);
                break;
            
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
