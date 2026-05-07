package EndX;

public class EndX {
    public String endX(String str){

        //Base case
        if(str.length() == 0) return "";

        //recursion case
        return str.charAt(0)== 'x' ?
                endX(str.substring(1)) + "x"
                :
                str.charAt(0) + endX(str.substring(1)) ;

    }

}
