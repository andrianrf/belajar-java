public class ForEach {
    public static void main(String[] args) {
        /**
         * For Each
         * Kadang kita biasa mengakses data array menggunakann perulangan
         * Mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat counter, lalu mengakses array menggunakan counter yang kita buat
         * Namun untungnya, di Java terdapat perulangan for each, yang bisa digunakan untuk mengakses seluruh data di Array secara otomatis
         */

        String[] array = {
                "Andrian", "Ramadhan", "Febriana"
        };

        //Tanpa for each
        for (int i = 0;i< array.length;i++){
            System.out.println(array[i]);
        }

        //for each
        for(String value: array){
            System.out.println(value);
        }
    }
}
