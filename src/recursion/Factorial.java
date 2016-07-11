package recursion;

public class Factorial {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int n = 4;
        System.out.println("The factorial is" + fact(n));

    }
    
    
    public static int fact(int n)
    {
        if (n == 0)
            return 1;
        else return n*fact(n-1);
    }

}
