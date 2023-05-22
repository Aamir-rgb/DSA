package com.DP;

public class Power {

    public static int power(int a,int b,int dp[]){
        int res = 0;
       if(dp[b]!=0){
           return dp[b];
       }
       res = (int)Math.pow(a,b/2)*(int)Math.pow(a,b/2);
       res = dp[b];
       return res;
    }
    public static void main(String[] args) {
        int dp[] =new int[1];
      System.out.println(power(2,9,dp));
    }
}
