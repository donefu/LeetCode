package Easy;

public class Solution_1672_maximumWealth {
    public static void main(String[] args) {
        int[][] account = { { 1, 2, 3 }, { 2, 4, 6 } };
        System.out.println(maximumWealth(account));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] customer : accounts) {
            int currentCustomerWealth = 0;
            for (int bank : customer) {
                currentCustomerWealth += bank;
            }
            maxWealth = Math.max(maxWealth, currentCustomerWealth);
        }
        return maxWealth;
    }

    // Time Complexity = O(n * m)
    // Space Complexity = O(1)
}
