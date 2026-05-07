package Count8;

public class Count8 {

    public int count8(int n){

        //Base case
        if(n == 0) return 0;

        //recursion case

        Integer lastDigit = n % 10;
        Integer secondLastDigit = (n / 10) % 10;
        Integer remaining=  n / 10;

        if (lastDigit == 8 &&secondLastDigit ==8) return 2 + count8(remaining) ;
        else if(lastDigit == 8) return 1 + count8(remaining);
        else return count8(remaining);







    }
}
