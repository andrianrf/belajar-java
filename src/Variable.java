public class Variable {
    public static void main(String[] args) {
        /**
         * ==Variable
         * Variable adalah tempat untuk menyimpan data
         * Java adalah bahasa static type, sehingga sebuah  variable hanya bisa digunakan untuk menyimpan tipe data yang sama, tidak bisa berubah-ubah tipe data seperti di bahasa pemrograman PHP atau JavaScript
         * Untuk membuat variable di Java kita bisa menggunakan nama tipe data lalu diikuti dengan nama variable nya
         * Nama variable tidak boleh mengandung whitespace (spasi, enter, tab), dan tidak boleh seluruhnya number
         */

        String name;
        name = "Andrian Ramadhan Febriana";

        int age = 25;
        String address = "Bandung";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        /**
         * ==Kata Kunci var
         * Sejak versi Java 10, Java mendukung pembuatan variabel dengan kata kunci var, sehingga kita tidak perlu menyebutkan tipe datanya
         * Namun perlu diingat, saat kita menggunakan kata kunci var untuk membuat variable, kita harus menginisiasi value / nilai dari variable tersebut secara langsung
         */

        //var name2; //error, harus diinisialisasi valuenya
        //name2 = "Andrian Ramadhan Febriana";

        var name2 = "Andrian Ramadhan Febriana";
        var age2 = 25;
        var address2 = "Indonesia";

        System.out.println(name2);
        System.out.println(age2);
        System.out.println(address2);

        /**
         * ==Kata Kunci final
         * Secara default, variable di Java bisa diubah-ubah nilainya
         * Jika kita ingin membuat sebuah variable yang datanya tidak boleh diubah setelah pertama kali dibuat, kita bisa menggunakan kata kunci final
         * Istilah variabel seperti ini, banyak juga yang menyebutnya konstan
         */

        final String name3 = "Andrian Ramadhan Febriana";
        //name3 = "Nama diubah"; //error, karena variable tersebut final/constant

        System.out.println(name3);

    }
}
