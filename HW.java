import java.util.Random;
import java.util.Scanner;

public class HW {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        boolean isCreated = false;

        int[] array = new int[0];

        while(choice != 9){
            System.out.println("1) Create an array");
            System.out.println("2) Display the array");
            System.out.println("3) Find the minumum number of the array.");
            System.out.println("4) Find the maximum number of the array.");
            System.out.println("5) Find the average of the array.");
            System.out.println("6) Display the array with differences of each index from average of the array.");
            System.out.println("7) Find the sum of the even indexes.");
            System.out.println("8) Find the sum of the odd indexes.");
            System.out.println("9) Exit!");

            System.out.print("What do you want to do? ");
            choice = scanner.nextInt();

            if(choice == 1){
                System.out.print("What length of array do you want to create?");
                int length = scanner.nextInt();

                array = arrayCreater(length);

                isCreated = true;

                System.out.println("Array created successfully.\n");
            }
            else if(choice == 2 && isCreated){
                String print = "";

                for (int i = 0; i < array.length; i++) {
                    print += array[i] + " ";
                }

                System.out.println(print);
            }
            else if(choice == 3 && isCreated){
                System.out.println("The minimum number of the array is " + minReturner(array));
            }
            else if(choice == 4 && isCreated){
                System.out.println("The maximum number of the array is " + maxReturner(array));
            }
            else if(choice == 5 && isCreated){
                System.out.println("The average of the array is " + averageFinder(array));
            }
            else if(choice == 6 && isCreated){
                System.out.println("The array with made subtraction with the average of the array with each index is:");
                int[] tempArray = averageSubtracter(array);

                String print = "";

                for (int i = 0; i < tempArray.length; i++) {
                    print += tempArray[i] + " ";
                }

                System.out.println(print);
            }
            else if(choice == 7 && isCreated){
                System.out.println("The sum of the each even index is " + evenSum(array));
            }
            else if(choice == 8 && isCreated){
                System.out.println("The sum of the each odd index is " + oddSum(array));
            }
            else if(choice == 9){
                System.out.println("Goodbye...");
            }
            else{
                System.out.println("Your input is invalid!\n");
            }
        }


        scanner.close();
    }

    public static int[] arrayCreater(int length) {
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            Random rand = new Random();

            int num = rand.nextInt(101);
            result[i] = num;
        }

        return result;
    }

    public static int maxReturner(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static int minReturner(int[] array) {
        int min = 100;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }


    public static int averageFinder(int[] array){
        int average = 0;

        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }

        return average / array.length;
    }

    public static int[] averageSubtracter(int[] array){
        int average = averageFinder(array);
        int[] temp = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            temp[i] -= array[i] - average;
        }

        return temp;
    }

    public static int oddSum(int[] array){
        int oddSum = 0;

        for (int i = 0; i < array.length; i++) {
            if((i + 1) % 2 == 0){
                oddSum += array[i]; 
            }
        }

        return oddSum;
    }

    public static int evenSum(int[] array){
        int evenSum = 0;

        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0){
                evenSum += array[i]; 
            }
        }

        return evenSum;
    }
}