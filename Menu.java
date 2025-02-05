import java.util.Scanner;

public class Menu {


    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in); 
        int choice;
        int[] arr = null; 
        do  
        { 
            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n", "1. Create an array"
                                    ,"2. Find maximum number."  
                                     , "3. Find minimum number." 
                                     , "4. Find thw avarage of the array."  
                                     , "5. Find the sum of elements with odd- and even-numbered indexes." 
                                     , "6. Exit."); 
            System.out.print("Please choose an option: "); 
            choice = in.nextInt(); 
            in.nextLine(); 
            switch (choice)  
            { 
                case 1:
                System.out.print("Enter the size of the array: ");
                int size = in.nextInt();
                arr = App.createArray(size);
                for (int num : arr) 
                {
                    System.out.print(num + " ");
                }
                System.out.println();
                break;

                case 2: 
                if (arr != null) {
                    System.out.println("Maximum value is: " + App.findMax(arr)); 
                    break; 
                }
                 
                case 3: 
                if (arr != null) {
                    System.out.println(" Minimum value is " + App.findMin(arr));
                    break; 
                }
                case 4:
                if (arr != null) { 
                    App.arrayAverage(arr);; 
                    break; 
                }
                case 5: 
                if (arr != null) {
                    App.findOddEvenSumTotal(arr); 
                    break;
                } 
                case 6: 
                    System.out.println("Exiting program..."); 
                    break; 
                default: 
                    break; 
            } 
        } while(choice != 6); 

    }
}
