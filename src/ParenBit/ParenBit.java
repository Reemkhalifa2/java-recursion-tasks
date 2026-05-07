package ParenBit;

public class ParenBit {
    public String  parenBit(String str){

        //Base case
        if (str.startsWith("(") && str.endsWith(")")) {
            return str;
        }
        //recursion case
        if (!str.startsWith("(")) {
            return parenBit(str.substring(1));
        }

        return parenBit(str.substring(0, str.length() - 1));
    }




}
