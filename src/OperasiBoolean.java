public class OperasiBoolean {
    public static void main(String[] args) {

        var absen = 70;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75; //hasilnya false
        var lulusNilaiAkhir = nilaiAkhir >=75; //hasilnya true

        var lulus = lulusAbsen && lulusNilaiAkhir; //hasilnya false
        System.out.println(lulus);

    }
}
