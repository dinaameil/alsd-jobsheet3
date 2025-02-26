import java.util.Scanner;
public class DosenDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen08[] arrayOfDosen08 = new Dosen08[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            arrayOfDosen08[i] = new Dosen08();
            arrayOfDosen08[i].inputData(sc);;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            arrayOfDosen08[i].cetakInfo();
        }

         System.out.println("\nData Semua Dosen:");
         DataDosen08.dataSemuaDosen08(arrayOfDosen08);
        
         DataDosen08.jumlahDosenPerJenisKelamin08(arrayOfDosen08);
        
         DataDosen08.rerataUsiaDosenPerJenisKelamin08(arrayOfDosen08);
 
         DataDosen08.infoDosenPalingTua08(arrayOfDosen08);

         DataDosen08.infoDosenPalingMuda08(arrayOfDosen08);
    }    
}
