public class BasicBubbleSort {
    public static void bubbleSort(int[] array) {
        int n;
        n = array.length;
        for (int count1 = 0; count1 < n - 1; count1++) {
            for (int count2 = 0; count2 < n - count1 - 1; count2++) {
                if (array[count2] > array[count2 + 1]) {
                    int temp;
                    temp = array[count2];
                    array[count2] = array[count2 + 1];
                    array[count2 + 1] = temp;
                }
            }
        }
    }
}