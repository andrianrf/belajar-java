public class OperasiMatematika {
    public static void main(String[] args) {

        /**
         * == Operasi Matematika
         * + Penjumlahan
         * - Pengurangan
         * * Perkalian
         * / Pembagian
         * % Sisa Bagi
         */

        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //Augmented Assignments
        int c = 100;

        c += 10; //c = c + 10
        System.out.println(c);

        c -= 10; //c = c - 10
        System.out.println(c);

        c *= 10; //c = c * 10
        System.out.println(c);

        c /= 10; //c = c / 10
        System.out.println(c);

        c %= 10; //c = c % 10
        System.out.println(c);

        /**
         * Unary Operator
         */
        int d = +100; //bilangan positif
        int e = -10; //bilangan negatif

        d++; // d = d + 1
        System.out.println(d);

        d--; // d = d - 1
        System.out.println(d);

        boolean kebalikan = !true; //Boolean kebalikan
        System.out.println(kebalikan);


    }
}
