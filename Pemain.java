public class Pemain extends Pelatih{

    private String namaPemain;
    private int bayar, nomorPunggung;

    public Pemain( int nomorPunggung, String namaPemain) {
        this.nomorPunggung = nomorPunggung;
        this.namaPemain = namaPemain;
    }
    @Override
    String getIdentitas(){
        return namaPemain ;
    }

    @Override
    int getId(){
        return nomorPunggung;
    }
}
