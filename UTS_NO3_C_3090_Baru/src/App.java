// import java.util.Scanner;
import java.util.*;

import app.AsistenPraktikum_3090;
import app.StudentStaff_3090;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);
        AsistenPraktikum_3090 dataAsistenPraktikum_3090[] = new AsistenPraktikum_3090[1];
        StudentStaff_3090 datastStudentStaff_3090[] = new StudentStaff_3090[1];

        
        //~ Input Data Asisten praktikum
        System.out.println("Jumlah Asisten Praktikum : " + dataAsistenPraktikum_3090.length);
        System.out.println("== Input Data Asisten Praktikum ==");
        for(int i = 0; i < dataAsistenPraktikum_3090.length; i++){
            dataAsistenPraktikum_3090[i] = new AsistenPraktikum_3090();
            System.out.print("NIM              : ");
            dataAsistenPraktikum_3090[i].setNim(cin.nextLine());
            System.out.print("Nama             : ");
            dataAsistenPraktikum_3090[i].setNama(cin.nextLine());
            System.out.print("Jurusan          : ");
            dataAsistenPraktikum_3090[i].setJurusan(cin.nextLine());
            System.out.print("IPK              : ");
            dataAsistenPraktikum_3090[i].setIpk(Float.parseFloat(cin.nextLine()));
            System.out.print("MK Asistensi     : ");
            dataAsistenPraktikum_3090[i].setMkAsistensi(cin.nextLine());
            System.out.print("Jumlah Pertemuan : ");
            dataAsistenPraktikum_3090[i].setJmlPertemuan(Integer.parseInt(cin.nextLine()));
        }
        
        System.out.println();
        
        //~ Input Data Student Staff
        System.out.println("Jumlah Student Staff : " + datastStudentStaff_3090.length);
        System.out.println("== Input Data Asisten Praktikum ==");
        for(int i = 0; i < datastStudentStaff_3090.length; i++){
            datastStudentStaff_3090[i] = new StudentStaff_3090();
            System.out.print("NIM              : ");
            datastStudentStaff_3090[i].setNim(cin.nextLine());
            System.out.print("Nama             : ");
            datastStudentStaff_3090[i].setNama(cin.nextLine());
            System.out.print("Jurusan          : ");
            datastStudentStaff_3090[i].setJurusan(cin.nextLine());
            System.out.print("IPK              : ");
            datastStudentStaff_3090[i].setIpk(Float.parseFloat(cin.nextLine()));
            System.out.print("Unit Kerja       : ");
            datastStudentStaff_3090[i].setUnitKerja(cin.nextLine());
            System.out.print("Jam Kerja        : ");
            datastStudentStaff_3090[i].setJamKerja(Integer.parseInt(cin.nextLine()));
        }

        System.out.println();
        //~ Tampil data Asisten Praktikum
        for(int i = 0; i < datastStudentStaff_3090.length; i++){
            dataAsistenPraktikum_3090[i].tampilDataMhs();
        }
        System.out.println();
        //~ Tampil data Student Staff
        for(int i = 0; i < datastStudentStaff_3090.length; i++){
            datastStudentStaff_3090[i].tampilDataMhs();
        }
    }
}
