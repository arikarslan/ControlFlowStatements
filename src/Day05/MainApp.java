package Day05;

public class MainApp {
    public static void main (String[] args) {
        //mantiksal operatörler
       /*
       &= anpersan(and) |= pyke(or )  ! = ünlem(degildir)
        */
        // && short cut and, || short cut or
            boolean b1 =  false&false;
            boolean b2 = false&true;
            boolean b3 = true&true;
            // if there is a false, it is false.

    boolean b4 = false|false;
    boolean b5 = false|true;
    boolean b6 = true|true;
    // if there is a true, it is true .
            boolean b7 = ! (true&false);
            boolean b8 = ! (true|false);
            // the opposit will be showed




        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b6);

        System.out.println();

        System.out.println(b7);
        System.out.println(b8);

    }
}
