public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
//        System.out.println(2147483647);
//        System.out.println(32);
//        System.out.println(1L);
//        Object number = 1L;
//        System.out.println(number.getClass());
//        System.out.println(-9223372036854775808L);
//        System.out.println(9223372036854775807L);
//        System.out.println(64);
//        Object number1 = 1;
//        System.out.println(number1.getClass());
//        System.out.println(-32768);
//        System.out.println(-128);
//        System.out.println(127);
//        System.out.println(8);
//        System.out.println(0);
//        System.out.println(65535);
//        System.out.println(16);
//        System.out.println(1000.0D);
//        System.out.println(1000.0D);
//        System.out.println(4.9E-324D);
//        System.out.println(1.7976931348623157E308D);
//        System.out.println(64);
//        System.out.println(1.0F);
//        System.out.println(1000.0F);
//        System.out.println(1000.0F);
//        System.out.println(1.4E-45F);
//        System.out.println(3.4028235E38F);
//        System.out.println(32);
        String s = "";
        for (int i = 0; i < 5; i++) {
            s += i + " ";
        }
        System.out.println(s);
    }

    public void basicForLoop1() {
        String s = "";
        for (int i = 0; i < 5; i++) {
            s += i + " ";
        }
        System.out.println(s);
        //assertEquals(s, __);
    }
    public void forLoopBreakLabel() {
        int count = 0;
        outerLabel:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                count++;
                System.out.println(count);
                if (count > 2) {
                    break outerLabel;
                }
            }
            count += 10;
            System.out.println(count);
        }
        // What does break with a label mean?
        // What gets executed? Where does the program flow continue?
        System.out.println("Policz: " + count);
    }


}
