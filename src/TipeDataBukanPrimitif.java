public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        /**
         * ==Tipe Data Primitif
         * Tipe data primitif adalah tipe bawaan di dalam bahasa pemrograman. Tipe data primitif tidak bisa diubah lagi
         * Tipe data number, char, boolean adalah tipe data primitif. Tipe data primitif selalu memiliki default value
         * contoh : byte, short, int, long, float, double, char, boolean
         */

        /**
         * == Tipe Data Bukan Primitif
         * Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki default value, dan bisa bernilai null
         * Tipe data bukan primitif bisa memiliki method/function (yang akan dibahas nanti)
         * Di Java, semua tipe data primitif memiliki representasi tipe data bukan primitif nya
         * contoh : Byte, Short, Integer, Long, Float, Double, Character, Boolean
         */

        Integer iniInteger = 10;
        Long iniLong = 10L; //harus diakhiri L
        Boolean iniBoolean = true;
        Short iniShort; //null

        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniBoolean);
        System.out.println(iniShort=10);

        // Konversi dari tipe primitif
        int age = 30;
        Integer ageObject = age;

        int ageAgain = ageObject;
        float floatAge = ageObject;
        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();

    }
}
