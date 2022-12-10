public class AsistenPelatih extends Pelatih{

    private String namaAsisten, tugasAsisten;
    int gajiAsis, idAsisten;

    public AsistenPelatih(String namaAsisten, int idAsisten) {
        this.namaAsisten = namaAsisten;
        this.idAsisten = idAsisten;
        this.gajiAsis = gajiAsis;
    }

    @Override
    String getIdentitas() {
        return namaAsisten ;
    }
    @Override
    int getId(){
        return idAsisten;
    }
}
