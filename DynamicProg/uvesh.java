public class uvesh {
    static int recCount = 0;
    static int memCount = 0;

    static int fib(int n) {
        recCount++;
        if (n == 0 || n == 1) {
            return n;
        }
        int first = fib(n - 1);
        int second = fib(n - 2);
        int result = first + second;
        return result;
    }

//  static int temp;
    static int  tabulation(int n  , int arr[]){
        arr[0]=0;
        arr[1]=1;
        for(int i=2; i<=arr.length-1; i++){
            arr[i]= arr[i-1]+arr[i-2];
            // temp=arr[i];
        }
        // return  temp;
        // return arr[n];
        return arr[arr.length-1];
    }

    static int memoization(int n, int cache[]) {
        memCount++;
        if (n == 0 || n == 1) {
            return n;
        }
        if (cache[n] != 0) {
            return cache[n];
        }
        int first = memoization(n - 1, cache);
        int second = memoization(n - 2, cache);
        int result = first + second;
        cache[n] = result;
        return cache[n];

    }

    public static void main(String[] args) {

        // Dinamic programming;
        // problem in recursion
        // -- overlapping subproblem
        // -- sub-structure property
        // DP provides two type of solution
        // -- Memoization - it works like cache
        // -- Tabulation

        int n = 8;
        int cache[] = new int[n + 1];
        int arr[] = new int[n+1];
        int res = memoization(n, cache);
        res = fib(n);
        System.out.println(res);
        System.out.println(res);
        System.out.println(recCount);
        System.out.println(memCount);
     res=  tabulation(n, arr);
     System.out.println(res);
    }
}
