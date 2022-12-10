public abstract class Pelatih {

    private String nama;
    private int gaji;

    public void Pelatih(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    abstract String getIdentitas();
    abstract int getId();
}

