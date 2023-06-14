package Day06;

public class BitwiseOperators {
    public static void main(String[] args) {
        //Bitwise Operators
        //&,|,^,~,<<,>>,>>>
        //                76543210
        int x = 5 ;     //00000101
        int y = 7 ;     //00000111
        int z = x&y;    //00000101

        int sayi = 128; //01000000
        sayi=sayi>>1;
        y=y>>1;

        System.out.println(sayi);
        System.out.println(y);

    }

    }
