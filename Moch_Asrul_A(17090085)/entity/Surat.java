package entity;

public class Surat {

    private String nama_pengirim;
    private String tanggal;
    private String tujuan;

    public String getNamaPengirim() {
        return nama_pengirim;
    }

    public void setNamaPengirim(String nama_pengirim) {
        this.nama_pengirim = nama_pengirim;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setaTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public Surat(String nama_pengirim, String tanggal, String tujuan) {
        this.nama_pengirim = nama_pengirim;
        this.tanggal = tanggal;
        this.tujuan = tujuan;
    }


    public boolean equals(Object object) {
        Surat temp = (Surat) object;
        return nama_pengirim.equals(temp.getNamaPengirim());
    }

}