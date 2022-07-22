class Solution {
    public int search(int[] array, int value) {
        int start = 0, end = array.length - 1;
        
        while(start <= end) {
            int mid = end - (end - start) / 2;
            if(array[mid] == value) {
                return mid;
            }
            else if(array[mid] >= array[start]) {
                if(value >= array[start] && array[mid] > value) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if(value < array[start] && array[mid] < value) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) 
    { 
        int array[] = { 3,4, 5, 6, 7, 8, 9, 10, 1, 2}; 
        int n = array.length; 
        int value = 2; 
        int i = findNumber(array, value); 
        if (i != -1) 
            System.out.println("Index: " + i); 
        else
            System.out.println("Value not found"); 
    }
}