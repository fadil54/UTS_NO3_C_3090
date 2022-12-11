package app;

public class Mahasiswa_3090 {
    protected String nama, nim, jurusan;
    protected float ipk;

    public void tampilDataMhs(){
        System.out.println("NIM              : " + nim);
        System.out.println("Nama             : " + nama);
        System.out.println("Jurusan          : " + jurusan);
        System.out.println("Ipk              : " + ipk);
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    public void setIpk(float ipk){
        this.ipk = ipk;
    }
}
