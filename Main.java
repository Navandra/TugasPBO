public class Main {
    public static void main(String[] args) {

        Pelatih pmn = new Pemain(10, "Neymar");
        Pelatih ap = new AsistenPelatih("Anthony", 1001);

        System.out.println("Identitas Pemain : "+pmn.getIdentitas());
        System.out.println("Nomor Pemain : "+pmn.getId());
        System.out.println("Identitas Asisten Pelatih : "+ ap.getIdentitas());
        System.out.println("Id Asisten Pelatih : "+ap.getId());
    }
}