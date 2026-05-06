public class Factorial {

    public int factorial(int n){
        if (n==1){ // base case
            return 1;
        }
        return n * factorial(n-1);// recursive case
    }

}
