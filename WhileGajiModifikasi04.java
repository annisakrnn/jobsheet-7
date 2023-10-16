import java.util.Scanner;
public class WhileGajiModifikasi04 {

    public static void main (String[] args) {
        Scanner scan04 = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan");
        jumlahKaryawan = scan04.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan, Pegawai");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan04.next();
            System.out.println("Masukkan jumlah jam lembur");
            jumlahJamLembur = scan04.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            }else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }
            else if (jabatan.equalsIgnoreCase("pegawai")) {
                gajiLembur = jumlahJamLembur * 50000;
            } else {
                System.out.println("Jabatan Invalid");
            }
                
            totalGajiLembur += gajiLembur;
        }
            System.out.println("Total gaji lembur: " + totalGajiLembur);

    }
}