package BunnyEars;

public class BunnyEars {
    public int bunnyEars2(int n){
        if(n ==0){
            return 0;//base case
        }
        //recursion case
        //if n is even bunny have 3 ears
        //if n is odd bunny have 2 ears

        return n%2==0 ? 3 + bunnyEars2(n - 1) :  2 + bunnyEars2(n - 1);


    }
}
