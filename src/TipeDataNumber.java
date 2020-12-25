public class TipeDataNumber {
    public static void main(String[] args) {

        //Melihat Min/Max Value bisa dilihat menggunakan
        //Double.MIN_VALUE
        //Double.MAX_VALUE
        //Mulai dari java 5, tipe data number bisa disisipkan _ untuk mempermudah membaca data

        //== Tipe Primitive ==//
        //Integer Number
        byte iniByte = 100; // -128 127 1byte
        short iniShort = 1000; // -32.768 32.767 2bytes
        int iniInt = 1_000_000; // -2.147.483.648 2.147.483.647 4bytes
        long iniLong = 1_000_000; // -9,223,372,036,854,775,808 9,223,372,036,854,775,807 8bytes type long bisa diidentifikasi juga dengan akhiran L

        //Floating Point Number
        float iniFloat = 10.12F; // 3.4e-038 3.4e+038 4bytes
        double iniDouble = 12.2424; // 1.7e−308 1.7e+308 8bytes

        //Literals
        int decimalInt = 25; //tipe desimal biasa
        int hexInt = 0xA132B; //hexa decimal diawali 0x
        int binInt = 0b01010101; //binary diawali 0b

        /*
        Konfersi tipe data number
        Widening Casting (Otomatis) : byte -> short -> int -> long -> float -> double
        Narrowing Casting (Manual) : double -> float -> long -> int -> char ->  short -> byte
        */
        iniDouble = iniByte;
        iniByte = (byte) iniDouble;

    }
}
