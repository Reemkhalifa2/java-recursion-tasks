package Triangle;

public class Triangle {
    public int triangle(int n){
        //Base case
        if(n==0) return 0;

        // recursion case
        return n + triangle(n - 1);


    }

}
