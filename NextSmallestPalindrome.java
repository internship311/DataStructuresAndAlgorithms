
public class NextSmallestPalindrome  
{ 
    static void utilityFunction(int array[], int numIndex)  
    { 
        //Practise Yourself :  Write your code Here
        while(numIndex >= 0) {
            if(array[numIndex] == 9) {
                array[numIndex] = 0;
                numIndex--;
            }
            else {
                array[numIndex] += 1;
                break;
            }
        }
    }
    
    static void swap(int array[], int start, int end) {
        while(start >= 0 && end <= array.length - 1) {
            //int temp = array[start];
            array[end] = array[start];
            //array[end] = temp;
            start--;
            end++;
        }
    }
     //The function that prints next palindrome of a given number array[] with n digits.
    static void nextPalindromeProblem(int array[], int n)  
    { 
        //Practise Yourself :  Write your code Here
        int left = 0, right = array.length - 1;
        
        if(array.length % 2 == 0) {
            int mid = right - (right - left) / 2;
            
            left = mid - 1;
            right = mid;
            
            while(array[left] == array[right]) {
                if(left == 0 && right == array.length - 1) {
                    break;
                }
                left--;
                right++;
            }
            
            if(array[left] > array[right]) {
                swap(array, left, right);
            }
            else if(array[left] < array[right]) {
                utilityFunction(array, mid - 1);
                
                left = mid - 1;
                right = mid;
                
                while(array[left] == array[right]) {
                    if(left == 0 && right == array.length - 1) {
                        break;
                    }
                    left--;
                    right++;
                }
                
                swap(array, left, right);
            }
            else if(array[left] == array[right]){
                utilityFunction(array, mid - 1);
                
                left = mid - 1;
                right = mid;
                
                while(array[left] == array[right]) {
                    if(left == 0 && right == array.length - 1) {
                        break;
                    }
                    left--;
                    right++;
                }
                
                swap(array, left, right);
            }
        }
        else {
            int mid = right - (right - left) / 2;
            
            left = mid;
            right = mid;
            
            while(array[left] == array[right]) {
                if(left == 0 && right == array.length - 1) {
                    break;
                }
                left--;
                right++;
            }
            
            if(array[left] > array[right]) {
                swap(array, left, right);
            }
            else if(array[left] <= array[right]) {
                utilityFunction(array, mid);
                left = mid;
                right = mid;
                
                while(array[left] == array[right]) {
                    if(left == 0 && right == array.length - 1) {
                        break;
                    }
                    left--;
                    right++;
                }
                
                swap(array, left, right);
            }
        }
    } 
  
  
    static void printarray(int array[]) { 
        for (int i = 0; i < array.length; i++) 
            System.out.print(array[i]); 
        System.out.println(); 
    } 
  
    public static void main(String[] args)  
    { 
        int array[] = { 1,9 }; 
        nextPalindromeProblem(array, array.length);
        printarray(array);
    } 
} 


/* Try more Inputs
case 1: 
actual = nextPalindromeProblem([9, 4, 1, 8, 7, 9, 7, 8, 3, 2, 2],11)
expected = 94188088149

case2: 
 actual = nextPalindromeProblem([1,2,1],3)
 expected = 131
 
case3: 
actual = nextPalindromeProblem([2,3,5,4,5],5)
expected = 23632
*/