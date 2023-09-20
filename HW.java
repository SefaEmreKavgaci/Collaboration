import java.util.Random;

public class HW {

    public static void main(String[] args) {
        
    }

    public int[] arrayCreater(int length){
        int[] result = new int[length];

        for(int i = 0; i < length; i++){
            Random rand = new Random();

            int num = rand.nextInt(101);
            result[i] = num;
        }

        return result;
    }
}