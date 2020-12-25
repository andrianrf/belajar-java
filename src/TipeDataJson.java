/**
 * Agar bisa mengimport org.json.simple.JSONObject
 * download json-simple-1.1.1.jar di https://code.google.com/archive/p/json-simple/downloads
 * simpan json-simple-1.1.1.jar di project/lib/json-simple-1.1.1.jar
 * klik kanan project open module setting
 * libraries > add java > json-simple-1.1.1.jar
 *
 * It thinks that your current version is 5.
 * Solution 1: Just go to "Project Settings>Build, Execution...> compiler>java compiler"
 * and then change your bytecode version to your current java version.
 */

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class TipeDataJson {
    public static void main(String[] args) {
        JSONObject json = new JSONObject();
        json.put("nama", "Andrian Ramadhan Febriana");
        json.put("usia", 25);

        /* Di JSON, tidak bisa membaca langsung dari object array, ada fungsi khusus untuk membuat sebuah array di json
        JSONArray jsonArrayHobi = new JSONArray();
        jsonArrayHobi.add("menulis");
        jsonArrayHobi.add("membaca");
        jsonArrayHobi.add("bersepeda");
        json.put("hobi2", jsonArrayHobi);
         */

        String[] hoby = new String[]{"Membaca", "Menulis", "Main Komputer"};
        //untuk mengconvert array ke json array, harus dibuat object json array kemudian diloop sebagai string untuk menyimpan dan mendeklarasikan array tersebut kedalam string
        JSONArray hobyJsonArray = new JSONArray();
        for (int i = 0; i < hoby.length; i++) {
            hobyJsonArray.add(hoby[i]);
        }
        json.put("hoby", hobyJsonArray); //memasukan array ke json

        JSONObject alamat = new JSONObject();
        alamat.put("jalan", "Wiranta No. 61a");
        alamat.put("rt", "01");
        alamat.put("rw", "11");
        alamat.put("kodepos", "40121");

        json.put("alamat", alamat); //memasukan json ke json

        JSONArray socialMedia = new JSONArray();
        JSONObject facebook = new JSONObject();
        facebook.put("url", "https://www.facebook.com/andrianrf");
        facebook.put("description", "Facebook Personal");
        socialMedia.add(facebook);

        /*

         */
        JSONObject github = new JSONObject();
        github.put("url", "https://www.github.com/andrianrf");
        github.put("description", "Github Personal");
        socialMedia.add(github);

        json.put("socialMedia", socialMedia); //double json in array json

        System.out.println(json);

    }
}
