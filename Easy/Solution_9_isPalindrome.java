package Easy;

/**
 * Solution_9_isPalindrome
 */
public class Solution_9_isPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    static boolean isPalindrome(int x) {
        int result = 0;
        int temp = x;
        while (temp > 0) {
            result = (result * 10) + (temp % 10);
            temp /= 10;
        }
        return (x == result);
    }

}