@Override
        protected void compute() {
            if (end - start <= 10) { // Sequential sort for small chunks
                for (int i = start; i < end - 1; i++) {
                    for (int j = start; j < end - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
            } else {
                int mid = (start + end) / 2;
                BubbleSortTask leftTask = new BubbleSortTask(arr, start, mid);


                BubbleSortTask rightTask = new BubbleSortTask(arr, mid, end);
                invokeAll(leftTask, rightTask);
                merge(arr, start, mid, end);
            }
        }