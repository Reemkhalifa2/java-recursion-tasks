package StrCount;

public class StrCountDemo {
    public static void main(String[] args) {
        // Object of StrCount
        StrCount strCount = new StrCount();

        //Test
        System.out.println(strCount.strCount("catcowcat", "cat"));
        System.out.println(strCount.strCount("catcowcat", "cow"));
        System.out.println(strCount.strCount("catcowcat", "dog"));

    }

}
