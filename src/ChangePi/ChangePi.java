package ChangePi;

public class ChangePi {
    public String changePi(String str){

        //Base Case
        if(str.isEmpty()) return "";

        //recursion Case
        return str.startsWith("pi") ?
                "3.14" + changePi(str.substring(2))
                :
                str.charAt(0) +  changePi(str.substring(0));

    }
}
