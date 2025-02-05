import java.util.Random;
public class App {
    public static void main(String[] args) {

        

    }
     private static int findMax(int[] arr)
        {
            int max = arr[0];
            for(int num : arr)
            {
                if(max < num)
                {
                    max = num;
                }
            }
            return max;
        }

        private static int findMin(int[] arr)
        {
            int min = arr[0];
            for(int num : arr)
            {
                if(min > num)
                {
                    min = num;
                }
            }
            return min;
        }
    public static int [] createArray(int givenSize)
    {
        Random rand = new Random();
        int [] randomArray = new int [givenSize];
        for(int i = 0 ; i < givenSize ; i ++)
        {
            randomArray [i] = rand.nextInt(101);
        }
        return randomArray;
    }

    public void findOddEvenSumTotal(int[] array)
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
    private static void arrayAverage(int[] arr)
     {
        int sum = 0; 
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        int average = sum / arr.length; 
        System.out.print("{");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] - average);
            if ( i != arr.length - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }

    private int sumAllNumbers(int[] array)
    {
        int sum = 0;
        for(int i : array)
        {
            sum += i;
        }
        return sum;
    }

}
