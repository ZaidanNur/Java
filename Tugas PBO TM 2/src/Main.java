public class Main {
    public static void main(String[] args) {

        MobilSedan mobil1 = new MobilSedan("Hijau",1990,"Seri A","Solar","P 2080 M");
//        String warna = mobil1.warna;

        String warna1 = mobil1.getWarna();
        System.out.println(warna1);
        mobil1.melaju();

        Ikan lele = new Ikan("Lele","Air tawar","Sungai, danau","Hitam");
    }
}
