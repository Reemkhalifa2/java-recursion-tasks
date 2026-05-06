package Count7;

public class Count7 {
    public int count7(int n){
        if(n==0){
            return 0;//the base case
        }
        //recursion case
        int lastDigit = n % 10;
        int remaining = n / 10;

        if (lastDigit == 7) {
            return 1 + count7(remaining);
        } else {
            return count7(remaining);
        }
    }

}
