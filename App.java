public class App {
    
    public static void main(String[] args) 
    {

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
