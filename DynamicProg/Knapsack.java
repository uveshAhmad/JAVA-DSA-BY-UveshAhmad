public class Knapsack {
    static int count_recCalls = 0;
    static int count_memoCalls = 0;

    // By Simple Recursion
    static int Knapsack(int value[], int weight[], int capacity, int item) {
        // Base Case
        if (capacity == 0 || item == 0) {
            return 0;
        }
        if (weight[item - 1] <= capacity) { // For valid Condition
            // include and Add
            count_recCalls++;
            int ans_1 = value[item - 1] + Knapsack(value, weight, capacity - weight[item - 1], item - 1);
            // exclude and not Add
            count_recCalls++;
            int ans_2 = Knapsack(value, weight, capacity, item - 1);
            return Math.max(ans_1, ans_2);
        } else { // for Invalid condition
            count_recCalls++;
            return Knapsack(value, weight, capacity, item - 1);
        }
    }

    // Memoisation

    static int KnapsackMemo(int value[], int weight[], int capacity, int item, int dp[][]) {
        if (capacity == 0 || item == 0) {
            return 0;
        }
        if (dp[item][capacity] != 0) { // For Alredy calculate Condition.
            return dp[item][capacity];
        }
        if (weight[item - 1] <= capacity) { // For valid Condition
            // include and Add
            count_memoCalls++;
            int ans_1 = value[item - 1] + Knapsack(value, weight, capacity - weight[item - 1], item - 1);
            // exclude and not Add
            count_memoCalls++;
            int ans_2 = Knapsack(value, weight, capacity, item - 1);
            dp[item][capacity] = Math.max(ans_1, ans_2);
            return dp[item][capacity];
        } else { // for Invalid condition
            count_memoCalls++;
            dp[item][capacity] = Knapsack(value, weight, capacity, item - 1);
            return dp[item][capacity];
        }
    }
    //Tbulation
    static int ks(int n , int wt[] , int val[] , int W){
    int k[][]=new int[n+1][W+1];
    int i , w;
    for(i=0; i<=n; i++){
        for(w=0)
    }

    }


    public static void main(String[] args) {
        int value[] = { 15, 14, 10, 45, 30 };
        int weight[] = { 2, 5, 1, 3, 4 };
        int capacity = 7;
        int dp[][] = new int[value.length + 1][capacity + 1];
        int res = Knapsack(value, weight, 7, value.length);
        System.out.println("By Simple Recursion " + res + " Number of Calls = " + count_recCalls);
        res = KnapsackMemo(value, weight, 7, value.length, dp);
        System.out.println("By Memoisation " + res + " Number of Calls= " + count_memoCalls);
    }
}