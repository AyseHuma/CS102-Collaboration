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

    public static void findOddEvenSumTotal(int[] array)
    {
        int size = array.length;
        int[] oddNumbers = new int[size/2];
        int[] evenNumbers = new int[(int)(size/2 + 0.5)];

        int index = 0;

        for(int i : array)
        {
            if(i%2 == 0)
            {
                evenNumbers[index] = i;
            }
            else
            {
                oddNumbers[index] = i;
            }
            index++;
        }

        int sumEven = sumAllNumbers(evenNumbers);
        int sumOdd = sumAllNumbers(oddNumbers);

        System.out.println("sum of odd numbered indexes: " + sumOdd);
        System.out.println("sum of even numbered indexes: " + sumEven);
    }

    private static int sumAllNumbers(int[] array)
    {
        int sum = 0;
        for(int i : array)
        {
            sum += i;
        }
        return sum;
    }

}
