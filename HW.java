import java.util.Random;

public class HW {

    public static void main(String[] args) {

    }

    public int[] arrayCreater(int length) {
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            Random rand = new Random();

            int num = rand.nextInt(101);
            result[i] = num;
        }

        return result;
    }

    public int maxReturner(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public int minReturner(int[] array) {
        int min = 100;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }


    public int averageFinder(int[] array){
        int average = 0;

        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }

        return average / array.length;
    }
}