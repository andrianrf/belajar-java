public class TernaryOperator {
    public static void main(String[] args) {
        /**
         * Ternary Operator
         * Ternary operator adalah operator sederhana dari if statement
         * Ternary operator terdiri dari  kondisi yang dievaluasi, jika menghasilkan true maka nilai pertama diambil, jika false, maka nilai kedua diambil
         */

        // Tanpa Ternary Operator
        var nilai = 75;
        String ucapan;
        if (nilai >= 75) {
            ucapan = "Selamat Anda Lulus";
        } else {
            ucapan = "Silahkan Coba Lagi";
        }

        // Dengan Ternary Operator
        String ucapan1 = nilai >= 75 ? "Selamat Anda Lulus": "Silahkan Coba Lagi";
        System.out.println(ucapan1);
    }
}
