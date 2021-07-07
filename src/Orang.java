import java.util.Date;

public class Orang {
    // field
    private String id;
    private String nama;
    private int umur;
    private Date tanggalLahir;
    private String alamat;
    private String agama;
    private String statusPerkawinan;
    private String pekerjaan;

    //Constructor

    public Orang(String id, String nama, int umur, Date tanggalLahir, String alamat, String agama, String statusPerkawinan, String pekerjaan) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
        this.agama = agama;
        this.statusPerkawinan = statusPerkawinan;
        this.pekerjaan = pekerjaan;
    }

    // deklarasi method

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getStatusPerkawinan() {
        return statusPerkawinan;
    }

    public void setStatusPerkawinan(String statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public void kenalan(){
        System.out.println("Halo nama saya " + this.nama) ;
    }
}
