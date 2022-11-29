package app;

public class AsistenPraktikum_3090 extends Mahasiswa_3090 implements iPendapatan_3090{
    private String mkAsistensi;
    private int jmlPertemuan;

    public Double totalPendapatan(){
        return jmlPertemuan * 50000.0;
    }
    public void tampilDataMhs(){
        System.out.println("== Data Asisten Praktikum ==");
        super.tampilDataMhs();
        System.out.println("MK Asistensi     : " + mkAsistensi);
        System.out.println("Jumlah Pertemuan : " + jmlPertemuan);
        System.out.println("-----------------------------");
        System.out.println("Total Pendapatan : " + totalPendapatan());
    }
    public void setMkAsistensi(String mkAsistensi){
        this.mkAsistensi = mkAsistensi;
    }
    public void setJmlPertemuan(int jmlPertemuan){
        this.jmlPertemuan = jmlPertemuan;
    }
}