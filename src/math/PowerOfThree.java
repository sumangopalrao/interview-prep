package math;

public class PowerOfThree {

    public static void main(String[] args) {
        int n = 27;
//        double x = Math.log((double)n / 3);
//        if ((x * 10) % 10 == 0)
//            System.out.println(true);
//        else System.out.println(false);
        boolean res =  n > 0 && (Math.pow(3, 19) % n) ==0;
        System.out.println(res);
    }
}
