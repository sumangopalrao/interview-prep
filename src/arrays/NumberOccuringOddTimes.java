package arrays;

public class NumberOccuringOddTimes {

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 4, 4, 1, 5};
        int sum = a[0];
        for(int i=1; i< a.length; i++)
        {
            sum = sum ^ a[i];
        }
        System.out.println("Sum is "+ sum);

    }

}
