package StrCopies;

public class StrCopiesDemo {
    public static void main(String[] args) {
        //object of StrCopies Class
        StrCopies strCopies = new StrCopies();

        //Test
        System.out.println(strCopies.strCopies("catcowcat", "cat", 2));
        System.out.println(strCopies.strCopies("catcowcat", "cow", 2));
        System.out.println(strCopies.strCopies("catcowcat", "cow", 1));
    }



}
