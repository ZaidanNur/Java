public class MobilSedan {
    private String warna;
    final int tahun_produksi;
    final String tipe_mobil;
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
        System.out.println("Ciiittt....");
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
        MobilSedan mobil1 = new MobilSedan("Merah",1990,"Sedan B20","Bensin","P 1080 Z");
        String warna_mobil = mobil1.getWarna();
        int tahun_pembuatan = mobil1.getTahun_produksi();
        String tipe_mobil = mobil1.getTipe_mobil();
        String bahan_bakar = mobil1.getBahan_bakar();
        String no_polisi = mobil1.getNo_polisi();

        System.out.println("Warna mobil : "+warna_mobil);
        System.out.println("Tahun pembuatan : "+tahun_pembuatan);
        System.out.println("Tipe mobil : "+tipe_mobil);
        System.out.println("Bahan bakar : "+bahan_bakar);
        System.out.println("Plat nomor : "+no_polisi);

        System.out.println();
        mobil1.melaju();
        mobil1.naikkanGigi();
        mobil1.turunkanGigi();
        mobil1.mengerem();

    }
}
