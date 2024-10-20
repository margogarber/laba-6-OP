import java.util.Random;

public class Main{
    public static void main(String[] args) {

        long[] arr = new long[1000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextLong(10000);
        }

        long startTime = System.currentTimeMillis();
        bubbleSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("Bubble Sort: ");
        printArray(arr);
        System.out.println("Took " + (endTime - startTime) + " ms");

        arr = new long[1000];
        Random random2 = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random2.nextLong(10000);
        }

        startTime = System.currentTimeMillis();
        selectionSort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("Selection Sort: ");
        printArray(arr);
        System.out.println("Took " + (endTime - startTime) + " ms");
    }
    public static void bubbleSort(long[] arr){
        int length = arr.length;
        for(int i=0; i < length - 1; i++){
            for(int j = 0; j < length - i - 1; j++){
                if(arr[j] < arr[j + 1]){
                    long temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void selectionSort(long[] arr){
        int length = arr.length;
        for(int i=0; i < length - 1; i++){
            int maxIndex = i;
            for(int j=i+1; j < length; j++){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            long temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(long[] arr){
        for (long numb : arr){
            System.out.print(numb + " ");
        }
        System.out.println();
    }
}
