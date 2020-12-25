import java.util.Date;

public class ExpressionStatementBlock {
    public static void main(String[] args) {
        /**
         * == Expression
         * Expression adalah konstruksi dari variabel, operator dan pemanggilan method yang mengevaluasi menjadi sebuah single value
         * Expression adalah core component dari statement
         */

        //Contoh Expresion
        int value;

        /**
         * == Statement
         * Statement bisa dibilang adalah kalimat lengkap dalam bahasa.
         * Sebuah statement berisikan execution komplit, biasanya diakhiri dengan titik koma
         * Ada beberapa jenis statement :
         * Assignment expression
         * Penggunaan ++ dan --
         * Method invocation
         * Object creation expression
         */
        //assignment statement
        double aValue = 123.456; //memasukan value

        //increment statement
        aValue++; //pernyataan untuk meningkatkan value

        //method invocation statement
        System.out.println("Hello World!"); //pernyataan untuk memanggil method

        // Object creation statement
        Date date = new Date(); //pernyataan untuk membuat objek

        /**
         * Block
         * Block adalah kumpulan statement yang terdiri dari nol atau lebih statement.
         * Block diawali dan diakhiri dengan kurung kurawal { }
         */

        //Contoh block adalah psvm ini

    }
}
