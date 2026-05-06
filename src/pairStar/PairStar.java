package pairStar;

public class PairStar {
    public String pairStar(String str){

        //Base Case
        if(str.length() <=1) return str;

        //recursion case
        return str.charAt(0) == str.charAt(1) ?
                str.charAt(0) + "*" + pairStar(str.substring(1))
                :
                str.charAt(0) + pairStar(str.substring(1));






    }

}
