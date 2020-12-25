public class IfStatement {
    public static void main(String[] args) {
        /**
         * == If Statement
         * Dalam Java, if adalah salah satu kata kunci yang digunakan untuk percabangan
         * Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
         * Hampir di semua bahasa pemrograman mendukung if expression
         */

        var nilai = 70;
        var absen = 90;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("Anda Lulus");
        }

        /**
         * == Else Statement
         * Blok if akan dieksekusi ketika kondisi if bernilai true
         * Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai false
         * Hal ini bisa dilakukan menggunakan else expression
         */

        if (nilai >= 75 && absen >= 75) {
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Anda Tidak Lulus");
        }

        /**
         * == Else If Statement
         * Kada dalam If, kita butuh membuat beberapa kondisi
         * Kasus seperti ini, di Java kita bisa menggunakan Else If expression
         * Else if di Java bisa lebih dari satu
         */

        if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai Anda C");
        } else if (nilai >= 50 && absen >= 50) {
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }
    }
}
