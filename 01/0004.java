public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            boolean swapped = false;
            for (int i = start; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            end--;
            for (int i = end; i > start; i--) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    swapped = true;
                }
            }
            start++;
            if (!swapped) {
                break;
            }
        }
    }