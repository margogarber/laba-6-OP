public class Main{
    public static void main(String[] args) {
        long[] arr = new long[]{200L, 500L, 100L, 300L, 800L};

        bubbleSort(arr);
        System.out.println("Bubble Sort: ");
        printArray(arr);

        arr = new long[]{500L, 1000L, 450L, 200L, 843L};
        selectionSort(arr);
        System.out.println("Selection Sort: ");
        printArray(arr);

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
                if(arr[j] < arr[maxIndex]){
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