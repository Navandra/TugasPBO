public class Lapangan {

    private String namaLap;
    private Float harga;
    private int jam;

    public Lapangan(){
    }

    public String getNamaLap(){
        return namaLap;
    }

    public Float getHarga() {
        return harga;
    }

    public int getJam() {
        return jam;
    }

    public void setNamaLap(String namaLap) {
        this.namaLap = namaLap;
    }

    public void setHarga(Float harga) {
        this.harga = harga;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public void setHargaPerJam(Float harga, int jam) {
        this.harga = harga * jam;
    }
}
