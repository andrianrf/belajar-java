public class Komentar {
    public static void main(String[] args) {
        /**
         * Komentar
         * Kadang dalam membuat program, kita sering menempatkan komentar di kode program tersebut
         * Komentar adalah kode program yang akan di hiraukan saat proses kompilasi, sehingga di binary code Java, tidak akan ada kode komentar tersebut
         * Biasanya komentar digunakan untuk dokumentasi
         */

        System.out.println(sum(2,3));
    }

    /**
     * //text dibawah autotext hanya menambahkan beberapa nilai
     *
     * Menghitung jumlah a+b
     *
     * @param a nilai a
     * @param b nilai b
     * @return a+b
     */
    static int sum(int a, int b){
        // jumlahkan a + b
        return a+b;
    }
}
