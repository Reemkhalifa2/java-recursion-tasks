package CountAbc;

public class CountAbc {
    public int countAbc(String str){

        // Base Case
        if(str.length() < 3) return 0;

        // recursion case
        return str.startsWith("abc")  || str.startsWith("aba") ?
                1 + countAbc(str.substring(1))
                :
                countAbc(str.substring(1));

    }
}
