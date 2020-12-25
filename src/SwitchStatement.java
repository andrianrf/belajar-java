public class SwitchStatement {
    public static void main(String[] args) {
        /**
         * == Switch Statement
         * Kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya menggunakan perbandingan ==
         * Switch adalah statement percabangan yang sama dengan if, namun  lebih sederhana cara pembuatannya
         * Kondisi di switch statement hanya untuk perbandingan ==
         */

        var nilai = "B";
        switch (nilai) {
            case "A":
                System.out.println("Anda lulus dengan baik");
                break;
            case "B": //tanpa break dia akan membaca kebawah sampai menemukan break
            case "C":
                System.out.println("Anda Lulus");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

        /**
         *  == Switch Lambda
         *  Di Java versi 14, diperkenalkan switch expression dengan lambda
         * Ini lebih mempermudah saat penggunaan switch expression karena kita tidak perlu lagi menggunakan kata kunci break
         */


        switch (nilai) {
            case "A" -> System.out.println("Anda lulus dengan baik");
            case "B", "C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }

        /**
         * Kata Kunci yield
         * Di Java 14, ada kata kunci baru yaitu yield, dimana kita menggunakan kata kunci yield untuk mengembalikan nilai pada switch statement
         * Ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement
         */

        //Switch tanpa yield
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Anda lulus dengan baik";
            case "B", "C" -> ucapan = "Anda lulus";
            case "D" -> ucapan = "Anda tidak lulus";
            default -> ucapan = "Mungkin Anda Salah Jurusan";
        }
        System.out.println(ucapan);

        //Switch dengan yield
        String ucapan1 = switch (nilai){
            case "A":
                yield "Anda lulus dengan baik";
            case "B", "C":
                yield "Anda lulus";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Mungkin Anda Salah Jurusan";
        };
        System.out.println(ucapan1);



    }
}
