package StrCopies;

public class StrCopies {
    public Boolean  strCopies(String str, String sub, int n){

        //base case
        if(n==0) return true;
        if(str.length()< sub.length()) return false;

        // recursion case
        return str.substring(0, sub.length()).equals(sub) ?
                strCopies(str.substring(1), sub, n - 1)
                :
                strCopies(str.substring(1), sub, n);




    }

}
