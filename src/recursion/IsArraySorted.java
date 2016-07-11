package recursion;

public class IsArraySorted {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int[] A = { 1, 3, 7, 2 };
        if(checkIfSorted(A, A.length) == 1)
        {
             System.out.println("The array is not sorted");
        }
        else if(checkIfSorted(A, A.length) == 0)
        {
             System.out.println("The array is sorted");
        }

    }
    
    public static int checkIfSorted(int[] arr, int i)
    {
        if( i==1 || arr.length == 1)
        {
            return 0;
        }
        if(arr[i-1] < arr[i-2])
            return 1;
        
        return checkIfSorted(arr, i-1);

    }

}
