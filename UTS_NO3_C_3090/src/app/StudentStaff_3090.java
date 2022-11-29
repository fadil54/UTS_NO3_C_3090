package app;

public class StudentStaff_3090 extends Mahasiswa_3090 implements iPendapatan_3090{
    private int jamKerja;
    private String unitKerja;

    public Double totalPendapatan(){
        return jamKerja * 30000.0;
    }
    public void tampilDataMhs(){
        System.out.println("== Data Student Staff ==");
        super.tampilDataMhs();
        System.out.println("Unit Kerja : " + unitKerja);
        System.out.println("Jam Kerja  : " + jamKerja);
        System.out.println("-----------------------------");
        System.out.println("Total Pendapatan : " + totalPendapatan());
    }
    public void setUnitKerja(String unitKerja){
        this.unitKerja = unitKerja;
    }
    public void setJamKerja(int jamKerja){
        this.jamKerja = jamKerja;
    }
}
