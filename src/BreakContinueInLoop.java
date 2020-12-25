public class BreakContinueInLoop {
    public static void main(String[] args) {
        /**
         * Break & Continue
         * Pada switch statement, kita sudah mengenal kata kunci break, yaitu untuk menghentikan case dalam switch
         * Sama dengan pada perulangan, break juga digunakan untuk menghentikan seluruh perulangan.
         * Namun berbeda dengan continue, continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan ke perulangan selanjutnya
         */
        //Break
        var counter = 1;
        while (true) {
            System.out.println("Perulangan Ke-" + counter);
            counter++;

            if (counter > 10) {
                break;
            }
        }

        //Continue
        for (counter = 1; counter <= 100; counter++) {
            if (counter % 2 == 0) {
                continue;
            }
            System.out.println("Perulangan Ganjil-" + counter);
        }
    }
}
