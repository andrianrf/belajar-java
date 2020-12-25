public class TipeDataArray {
    public static void main(String[] args) {

        /**
         * == Tipe Data Array
         * Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
         * Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat
         */

        String[] arrayString;
        arrayString = new String[3]; //contoh pembuatan array apabila ditentukan panjang maksimal arraynya
        arrayString[0] = "Andrian";
        arrayString[1] = "Ramadhan";
        arrayString[2] = "Febriana";

        //Array Initializer (tidak didefinisikan jumlah arraynya, namun didefinisikan dari awal value dari array tersebut)
        int[] arrayInt = new int[]{
                10, 90, 80, 67, 29
        };
        long[] arrayLong = {
                10, 90, 80, 67, 29
        };

        //Operasi di Array
        arrayLong[0] = 100; //mengubah value array
        System.out.println(arrayLong[0]); //mengambil value array dari index yang ditentukan
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length); // mengambil panjang array

        //Array di dalam Array
        String[][] members = {
                {"Andrian", "Ramadhan", "Febriana"},
                {"Sri", "Dewi", "Maryati"},
                {"Muhammad", "Ferdian", "Andriansyah"}
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[1][0]);
        System.out.println(members[2][0]);

    }
}
