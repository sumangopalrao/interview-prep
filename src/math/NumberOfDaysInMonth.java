// Given a year and month, return the number of days in that month.
//https://leetcode.com/problems/number-of-days-in-a-month/description/ 

package Math;

public Solution {
  public int numberOfDays(int year, int month) {
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
}
