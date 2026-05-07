package SumDigits;

public class SumDigits {
    public int  sumDigits(int n){
        //define base case
        if(n==0) return 0;

        //recursive case
        return n % 10 + sumDigits(n / 10);


    }
}
