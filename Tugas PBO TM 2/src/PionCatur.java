public class PionCatur {
    String jenis_pion;
    String warna;
    String bentuk_lintasan;

    PionCatur(String jenis_pion,String warna, String bentuk_lintasan){
        this.jenis_pion = jenis_pion;
        this.warna = warna;
        this.bentuk_lintasan = bentuk_lintasan;
    }

    public String getJenis_pion() {
        return jenis_pion;
    }

    public String getWarna() {
        return warna;
    }

    public String getBentuk_lintasan() {
        return bentuk_lintasan;
    }

    void berjalan (){
        System.out.println("Pion "+jenis_pion+" berjalan dengan bentuk lintasan "+bentuk_lintasan);

    }
    void memakan(){
        System.out.println("Pion "+jenis_pion+" memakan pion X");
    }
    void dimakan(){
        System.out.println("Pion "+jenis_pion+" dimakan");
    }

    public static void main(String[] args) {
        PionCatur kuda = new PionCatur("Kuda","Hitam","L");

        System.out.println("Ini pion "+kuda.getJenis_pion());
        System.out.println("Berwara "+kuda.getWarna());
        System.out.println("Lintasan jalanya berbentuk "+kuda.getBentuk_lintasan());
        System.out.println();

        kuda.berjalan();
        kuda.memakan();
        kuda.dimakan();
    }
}
