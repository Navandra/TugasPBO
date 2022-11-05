public class Pelatih {
    private String namaPelatih, jenisLatihan;
    private int jamLatihan, istirahat;

    public Pelatih(){
    }

    public Pelatih(String namaPelatih, String jenisLatihan, int jamLatihan, int istirahat){
        this.namaPelatih = namaPelatih;
        this.jenisLatihan = jenisLatihan;
        this.jamLatihan = jamLatihan;
        this.istirahat = istirahat;
    }

    public void setNamaPelatih(String namaPelatih) {
        this.namaPelatih = namaPelatih;
    }

    public void setJenisLatihan(String jenisLatihan) {
        this.jenisLatihan = jenisLatihan;
    }

    public void setJamLatihan(int jamLatihan) {
        this.jamLatihan = jamLatihan;
    }

    public void setIstirahat(int istirahat) {
        this.istirahat = istirahat;
    }

    public String getNamaPelatih() {
        return namaPelatih;
    }

    public String getJenisLatihan() {
        return jenisLatihan;
    }

    public int getJamLatihan() {
        return jamLatihan;
    }

    public int getIstirahat() {
        return istirahat;
    }

    public void lamaLatihan(int jamLatihan, int istirahat){
        this.jamLatihan = jamLatihan-istirahat;
    }
}
