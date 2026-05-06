package StrCount;

public class StrCount {

    public int strCount(String str, String sub){

        //Base Case
        if (str.length()< sub.length()) return 0;

        //recursion case
        return str.startsWith(sub) ?
                1 + strCount(str.substring(sub.length()), sub)
                :
                strCount(str.substring(1), sub);
    }
}
