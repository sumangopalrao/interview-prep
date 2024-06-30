// Given a year and month, return the number of days in that month.
//https://leetcode.com/problems/number-of-days-in-a-month/description/ 

package math;

public class NumberOfDaysInMonth {
  public static int numberOfDays(int year, int month) {
        if (month == 9 || month == 4 || month == 6 || month == 11) {
            return 30;
        }
        if (month == 2) {
            if (year % 4 ==  0) {
                if (year % 100 == 0) {
                    if(year % 400 == 0) {
                        return 29;
                    }
                    return 28;
                }
                return 29;
            }
            return 28;
        }

        return 31;
        
    }

    public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(numberOfDays(1992, 7));
	}
}
