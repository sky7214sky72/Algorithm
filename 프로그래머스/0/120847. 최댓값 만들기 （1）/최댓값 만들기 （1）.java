class Solution {
    public int solution(int[] numbers) {
        quickSort(numbers, 0, numbers.length-1);
        return numbers[numbers.length-1] * numbers[numbers.length-2];
    }
    public void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);
            quickSort(array, low, partitionIndex-1);
            quickSort(array, partitionIndex+1, high);
        }
    }
    public int partition(int [] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;        
    }
    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }    
}