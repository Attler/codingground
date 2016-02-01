import java.util.Random;
import java.util.Arrays;

public class HelloWorld{
    
    static int MAX = 100;

     public static void main(String []args){
        int[] A;
        A = createRandIntArray(20);
        System.out.println(Arrays.toString(A));
        
        int mResult;
        mResult = minSum(A);
        System.out.println(mResult);
     }
     
     /*
     Let A be an unsorted array of length n consisting of integers.
     Write an algorithm to find the minimum value of A[i] + A[j] over 0 to n
     but with i != j
     Must run in O(n) time
     */
     
    static int minSum(int[] Arr){
        if(Arr == null || Arr.length < 2){ return -1; }   // Return -1 for null or arrays too short
        int i = Arr[0];         // set i to val of first int in Arr
        int j = Arr[1];         // set j to val of second int in Arr
        int cur;
        for(int k = 0; k < Arr.length; k++){
            cur = Arr[k];
            if(cur < j && cur != i){
                if(cur < i){
                    j = i;
                    i = cur;
                }else{
                    j = cur;
                }
            }
        }
        return i + j;
    }

    static int[] createRandIntArray(int n){
         Random rand = new Random();
         int[] result = new int[n];
         for(int i = 0; i < n; i++){
             result[i] = rand.nextInt(MAX);
         }
         return result;
     }
}
