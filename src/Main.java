import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Orang maulana = new Orang("001", "maulana", 20,
                new Date(), "martapura", "islam", "belum kawin",
                "mahasiswa");
        Orang iskandar = new Orang( "002", "iskandar", 21,
                new Date(), "karang intan", "islam", "kawin",
                "wiraswasta");
        Orang bii = new Orang( "003", "bii", 19,
                new Date(), "banjarmasin", "islam", "kawin",
                "swasta");
        //dst ...
        Karyawan lana = new Karyawan("001", "lana", 23,
                new Date(), "banjarmasin", "islam", "kawin",
                "swasta", "supervisor");

        System.out.println(lana.getJabatan());//,mengakses jabatan object menggunakan fungsi
        // jabatan lana adalah "supervisor"

        Karyawan basir = new Karyawan("002", "basir", 25,
                new Date(), "banjarmasin", "islam", "kawin",
                "swasta", "manager");
        //dst ...
    }

    Karyawan lana = new Karyawan("001", "lana", 23,
            new Date(), "banjarmasin", "islam", "kawin",
            "swasta", "suvervisor");

    System.out.println(lana.getJabatan());
}
