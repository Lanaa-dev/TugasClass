import java.util.Date;

public class Karyawan extends Orang {
    private String jabatan;

    public Karyawan(String id, String nama, int umur, Date tanggalLahir, String alamat, String agama, String statusPerkawinan, String pekerjaan, String jabatan) {
        super(id, nama, umur, tanggalLahir, alamat, agama, statusPerkawinan, pekerjaan);
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    @Override
    public void kenalan(){
        System.out.println("Halo nama saya " + super.getNama ( ) +
                " \nSaya menjabat sebagai " + this.jabatan);
    }
}
