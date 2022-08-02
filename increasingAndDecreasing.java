// GFG Problem

import java.util.*;

class GFG {
    
    static int findMaximum(int array[], int start, int end) 
    { 
        //Practise Yourself : Write your code Here
        while(start <= end) {
            int mid = end - (end - start) / 2;
            
            if(start == end) {
                return array[start];
            }
            
            if(array[mid] > array[mid - 1] && array[mid] > array[mid + 1]) {
                return array[mid];
            }
            else if(array[mid] > array[mid - 1] && array[mid] < array[mid + 1]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return 0;
    }
    
	public static void main (String[] args) {
		int array[] = {64, 63,62, 50, 49, 41, 32, 23}; 
        int n = array.length; 
        System.out.println("The maximum Value "+  findMaximum(array, 0, n-1)); 
	}
}