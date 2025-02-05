import java.util.Random;
public class App {
    public static void main(String[] args) {
        
    }
    public static void createArray(int givenSize)
    {
        Random rand = new Random();
        int [] randomArray = new int [givenSize];
        for(int i = 0 ; i < givenSize ; i ++)
        {
            randomArray [i] = rand.nextInt(101);
        }
    }
}