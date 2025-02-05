import java.util.Scanner;

public class App {
    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in); 
        int choice; 
        do  
        { 
            System.out.printf("%s%n%s%n%s%n%s%n%s%n", "1. Find maximum number."  
                                     , "2. Find minimum number." 
                                     , "3. Find thw avarage of the array."  
                                     , "4. Find the sum of elements with odd- and even-numbered indexes." 
                                     , "5. Exit."); 
            System.out.print("Please choose an option: "); 
            choice = in.nextInt(); 
            System.out.println(""); 
            in.nextLine(); 
            switch (choice)  
            { 
                case 1: 
                    findMax(arr); 
                    break; 
                 
                case 2: 
                    findMin(arr); 
                    break; 
                case 3: 
                    arrayAverage(arr); 
                    break; 
                case 4: 
                    findOddEvenSumTotal(arr); 
                    break; 
                case 5: 
                    System.out.println("Exiting program..."); 
                    break; 
                default: 
                    break; 
            } 
        } while(choice != 5); 

    }

    public static void findOddEvenIndexSums(int[] array)
    {
        int oddSum = 0;
        int evenSum = 0;

        boolean switcher = true;

        for(int i : array)
        {
            if(switcher)
            {
                evenSum += i;
            }
            else
            {
                oddSum += i;
            }
            switcher = !switcher;
        }

        System.out.println("Odd numbered indexes total: " + oddSum);
        System.out.println("Even numbered indexes total: " + evenSum);
    }
 

}
