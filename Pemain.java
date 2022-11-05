import java.util.Scanner;

public class Pemain {

    private String namaPemain, posisi;
    private int noPunggung , bayar ;

    public void setNamaPemain(String namaPemain) {
        this.namaPemain = namaPemain;
    }

    public void setNoPunggung(int noPunggung) {
        this.noPunggung = noPunggung;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
    }

    public String getNamaPemain() {
        return namaPemain;
    }

    public int getNoPunggung() {
        return noPunggung;
    }

    public String getPosisi() {
        return posisi;
    }

    public int getBayar() {
        return bayar;
    }

    final static void profilPemain(){
        Scanner in = new Scanner(System.in);
        System.out.println("Profil Pemain");
        System.out.println("Masukkan Nama Pemain");
        String namaPemain = in.nextLine();
        System.out.println("Masukkan no punggung : ");
        int noPunggung = in.nextInt();
        System.out.println("Masukkan posisi : ");
        String posisi = in.nextLine();
    }
}

