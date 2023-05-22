package com.DP;

public class Fibonacci {
    public static int getFib(int n,int []dp){
        if(n <=0) return -1;
        if(n <=2 ) return 1;
        if(dp[n]!=0) return dp[n];
        int res = getFib(n-1,dp)+getFib(n-2,dp);
        dp[n] = res;
        return res;
    }
    public static void main(String[] args) {
        int n = 15;
        int dp[] = new int[n+1];

        long startTime = System.nanoTime();
        System.out.println(getFib(n,dp));
        long elapsedTime = startTime - startTime;
        System.out.println("Time Spent in DP is "+elapsedTime);

        long startTimeRec = System.nanoTime();
        System.out.println(getFibRec(n));
        long elapsedTimeRec = startTimeRec - startTime;
        System.out.println("Time Spent in Recursion is "+elapsedTimeRec);


    }

    public static int getFibRec(int n){
        if(n <=0) return -1;
        if(n <=2 ) return 1;
        return getFibRec(n-1)+getFibRec(n-2);
    }

    public static int getFibTabular(int n){
        int dp[] = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3;i <=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
