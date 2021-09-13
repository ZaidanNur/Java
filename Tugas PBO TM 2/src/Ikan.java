public class Ikan {
    private String nama_ikan;
    private String jenis_ikan;
    private String tempat_hidup;
    private String warna;

    public Ikan(String nama_ikan,String jenis_ikan,String tempat_hidup, String warna){
        this.nama_ikan = nama_ikan;
        this.jenis_ikan = jenis_ikan;
        this.tempat_hidup = tempat_hidup;
        this.warna = warna;
    }

    public String getNama_ikan() {
        return nama_ikan;
    }

    public String getJenis_ikan() {
        return jenis_ikan;
    }

    public String getTempat_hidup() {
        return tempat_hidup;
    }

    public String getWarna() {
        return warna;
    }

    void berenang(){
        System.out.println("Berenang, berenang, terus berenang");
    }
    void bernafas(){
        System.out.println("Blubuugh... blubuugh");
    }
    void bertelur(){
        System.out.println("aku bertelur");
    }
    public static void main(String[] args) {
        Ikan lele = new Ikan("Lele","Air tawar","Sungai, danau","Hitam");
        String nama_ikan = lele.getNama_ikan();
        String jenis_ikan = lele.getJenis_ikan();
        String tempat_hidup = lele.getTempat_hidup();
        String warna = lele.getWarna();

        System.out.println("Nama ika : "+nama_ikan);
        System.out.println("Jenis ikan : "+jenis_ikan);
        System.out.println("Tempat hidup : "+tempat_hidup);
        System.out.println("Warna : "+ warna);
        System.out.println();

        lele.berenang();
        lele.bernafas();
        lele.bertelur();
    }



}

