package Day05;

public class IfStatement {
    public static void main(String[] args) {
        //resit olup olmama
        int yas = 18;
        if (yas < 18) {
            System.out.println("resit degildir");

        } else if (yas >= 18) {
            System.out.println("resittir");

        }

        //Yasi 70`den büyük,18 den kücük olma durumu
        if (yas < 18 | yas >= 70) {
            System.out.println("sosyal yardim alabilir");

        } else {
            System.out.println("sosyal yardim alamaz");

        }

         int x = 65;
          int y = 0b01000001;
           int z = 0x41;


          System.out.println(x);
             System.out.println(y);
                 System.out.println(z);


    }
}




