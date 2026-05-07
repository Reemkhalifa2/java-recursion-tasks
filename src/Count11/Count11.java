package Count11;

public class Count11 {
    public int count11(String str){
        // Base case
        if (str.length() < 2) return 0;

        //recursion case
        return str.startsWith("11") ?
                1 + count11(str.substring(2))
                :
                count11(str.substring(1));


    }

}
