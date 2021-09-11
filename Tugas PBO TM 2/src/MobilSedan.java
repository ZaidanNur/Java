public class MobilSedan {
    private String warna;
    private int tahun_produksi;
    private String tipe_mobil;
    private String bahan_bakar;
    private String no_polisi;

    // Constractor
    public MobilSedan(String warna,int tahun_produksi,String tipe_mobil,String bahan_bakar,String no_polisi){
        this.warna = warna;
        this.tahun_produksi = tahun_produksi;
        this.tipe_mobil = tipe_mobil;
        this.bahan_bakar = bahan_bakar;
        this.no_polisi = no_polisi;
    }

    public String getWarna(){
        return warna;
    }
    void setWarna(String warnaBaru){
        this.warna = warnaBaru;
    }
    int getTahun_produksi(){
        return tahun_produksi;
    }
    String getTipe_mobil(){
        return tipe_mobil;
    }
    String getBahan_bakar(){
        return bahan_bakar;
    }
    String getNo_polisi(){
        return no_polisi;
    }
    void melaju(){
        System.out.println("aduh jalan");
    }
    void mengerem(){
        System.out.println("Prrtttt....");
    }
    void naikkanGigi(){
        System.out.println("gigi naik 1");
    }
    void turunkanGigi(){
        System.out.println("gigi turun 1");
    }
    void menghidupkanLampuSen(){}
    void menggerakkanViper (){}

    public static void main(String[] args) {
        MobilSedan mobil1 = new MobilSedan("Merah",1990,"","","");
        mobil1.naikkanGigi();
        mobil1.turunkanGigi();
        System.out.println(mobil1);
        String warna = mobil1.getWarna();
        System.out.println(warna);
    }
}
