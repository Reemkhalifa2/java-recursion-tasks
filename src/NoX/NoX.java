package NoX;

public class NoX {
    public String noX(String str){

        //Base case
        if(str.length() == 0) return "";

        //recursion case
        return  str.charAt(0) == 'x' ?
                noX(str.substring(1))
                :
                str.charAt(0) + noX(str.substring(1));




    }
}
