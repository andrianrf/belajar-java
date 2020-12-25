public class MethodVariableArgument {
    public static void main(String[] args) {
        /**
         * Method Variable Argument
         * Kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti
         * Biasanya, agar bisa seperti ini, kita akan menggunakan Array sebagai parameter di method tersebut
         * Namun di Java, kita bisa menggunakan variable argument, untuk mengirim data yang berisi jumlah tak tentu, bisa nol atau lebih
         * Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter
         */

        //pemanggilan method tanpa variable argument
        sayCongratsNoVarArgument("Andrian", new int[]{ 10, 20, 30 });

        //pemanggilan method menggunakan variable argument
        sayCongratsVarArgument("Ramadhan", 80, 90, 100);

    }

    //method tanpa variable argument
    static void sayCongratsNoVarArgument(String name, int[] values) { //int values dideklarasikan sebagai array

        int total = 0;
        for (var value : values) {
            total += value;
        }
        int finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus, Total Nilai Anda "+total);
        } else {
            System.out.println("Maaf " + name + ", Anda tidak lulus, Total Nilai Anda "+total);
        }
    }

    static void sayCongratsVarArgument(String name, int... values){ //integer dideklarasikan bukan array, namun boleh diisi oleh beberapa value dan hasilnya nanti akan menjadi array

        int total = 0;
        for (var value : values) { //values akan dideklarasikan sebagai array
            total += value;
        }
        int finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus, Total Nilai Anda "+total);
        } else {
            System.out.println("Maaf " + name + ", Anda tidak lulus, Total Nilai Anda "+total);
        }
    }

}
