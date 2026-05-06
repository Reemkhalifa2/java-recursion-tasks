package CountX;

public class CountX {
    public int countX(String str){
        if(str.isEmpty()) return 0; //base case

        //recursion case
        return str.charAt(0)== 'x' ?
                (1 + countX(str.substring(1)))
                :
                countX(str.substring(1));
    }

}
