import java.util.Scanner;

public class RekeningBank {
    private int nomor_rekening;
    private String nama_nasabah;
    private int jumlah_tabungan;

    RekeningBank(int nomor_rekening,String nama_nasabah,int jumlah_tabungan){
        this.nomor_rekening = nomor_rekening;
        this.nama_nasabah = nama_nasabah;
        this.jumlah_tabungan = jumlah_tabungan;
    }

    public int getNomor_rekening() {
        return nomor_rekening;
    }

    public String getNama_nasabah() {
        return nama_nasabah;
    }

    public int getJumlah_tabungan() {
        return jumlah_tabungan;
    }

    public void setJumlah_tabungan(int jumlah_tabungan) {
        this.jumlah_tabungan = jumlah_tabungan;
    }

    int menarik(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah yang ingin ditarik : ");
        int tarik = sc.nextInt();
        int sisa = this.jumlah_tabungan - tarik;
        this.jumlah_tabungan = sisa;
        return this.jumlah_tabungan;

    }
    int transfer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah yang ingin ditransfer : ");
        int transfer = sc.nextInt();
        int sisa = this.jumlah_tabungan - transfer;
        this.jumlah_tabungan = sisa;
        return this.jumlah_tabungan;

    }
    int menabung(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah yang ingin ditabung : ");
        int tabung = sc.nextInt();
        int sisa = this.jumlah_tabungan + tabung;
        this.jumlah_tabungan = sisa;
        return this.jumlah_tabungan;

    }

    public static void main(String[] args) {
        RekeningBank aku = new RekeningBank(1080,"Zaidan Nur",2000000);

        System.out.println("no rekening : "+aku.getNomor_rekening());
        System.out.println("nama nasabah : "+aku.getNama_nasabah());
        System.out.println("jumlah tabungan : "+aku.getJumlah_tabungan());
        System.out.println();

        aku.menarik();
        System.out.println("jumlah tabungan : "+aku.getJumlah_tabungan());
        aku.transfer();
        System.out.println("jumlah tabungan : "+aku.getJumlah_tabungan());
        aku.menabung();
        System.out.println("jumlah tabungan : "+aku.getJumlah_tabungan());

    }

}
