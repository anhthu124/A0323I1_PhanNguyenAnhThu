package ss14ThuatToanSapXep.Demo;

public class Demo {
    public static void main(String[] args) {
        int[] numbers = {6, 12, 14, 0, 5, 7, -1, 16, -5};

    }

    // bong bongs cai tien
    public static void bubbleSort(int[] arr) {
        boolean isSwap = true;
        for (int i = 0; i < arr.length - 1 && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = 1;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

        }
    }

    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

}
