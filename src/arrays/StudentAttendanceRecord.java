// Program to find out student's attendance record
// https://leetcode.com/problems/student-attendance-record-i/

package arrays;

public class StudentAttendanceRecord {

    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("PPALLL"));

    }

    public static boolean checkRecord(String s) {

        int i = s.length() - 1;
        int absenceCount = 0;
        while (i >= 0) {
            if (s.charAt(i) == 'A') {
                absenceCount++;
            }

            if (absenceCount > 1) {
                return false;
            }

            if (s.charAt(i) == 'L' && (i-1) >=0 && (i-2) >=0) {
                if (s.charAt(i-1) == 'L' && s.charAt(i - 2) == 'L')
                    return false; 
            }

            i--;
        }

        return true;

    }
    
}
