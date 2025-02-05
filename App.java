public class App {
     private static findMax()
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

        private static findMin()
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
    public static void main(String[] args) {
        
    }
}
