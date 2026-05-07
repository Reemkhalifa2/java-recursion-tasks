package CountHi;

public class CountHi {
    public int countHi(String str){

        //Base Case
        if(str.length() < 2) return 0;

        //recursion case
        return str.substring(0, 2).equals("hi")?
                1 + countHi(str.substring(2))
                :
                countHi(str.substring(1));


    }

}
