package com.michaldebicki;

public class Series {
    public static int nSum(int n){
        int returnNumber = 0;
        for (int i = 0 ; i <= n ; i++){
             returnNumber += i;
        }
        return returnNumber;
    }
    public static int factorial(int n) {
        int returnNumber = 1;
        for (int i = 1; i <= n; i++) {
            returnNumber *= i;
        }
        return returnNumber;
    }
    public static int fibonacci(int n){
        if ((n==1)||(n==2))
            return 1;
        else if(n==0)
            return 0;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }


}
