// Given a list of versions and API which says a bad version, find the version which is bad
package sorting.searching;

public class FirstBadVersion {

    private static boolean isBadVersion(int i) {
        return i >= 2;
    }

    public static int firstBadVersion(int n) {

        if (n == 1) {
            return isBadVersion(1) ? 1 : -1;
        }

        int low = 1;
        int high = n;
        int mid = low + (high - low) / 2;

        while (mid <= high && mid >= low) {
            if (isBadVersion(mid)) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
            mid = low + (high - low) / 2;
        }
        return mid;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(2));
    }
}
