package ParenBit;

public class ParenBitDemo {

    public static void main(String[] args) {

        // Create object of ParenBit class
        ParenBit pb = new ParenBit();

        // Test
        System.out.println(pb.parenBit("xyz(abc)123"));
        System.out.println(pb.parenBit("x(hello)"));
        System.out.println(pb.parenBit("(xy)1"));
    }
}