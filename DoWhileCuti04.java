import java.util.Scanner;
public class DoWhileCuti04 {

    public static void main (String[] args) {
        Scanner scan04 = new Scanner(System.in);

         int jatahCuti, jumlahHari;
    String konfirmasi;
    System.out.print("Jatah cuti: ");
    jatahCuti = scan04.nextInt();
    do {
        System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
        konfirmasi = scan04.next();

        if (konfirmasi.equalsIgnoreCase("y"));
        System.out.print("Jumlah hari: ");
        jumlahHari = scan04.nextInt();

        if (jumlahHari <= jatahCuti) {
            jatahCuti -= jumlahHari;
            System.out.println("Sisa jatah cuti: " + jatahCuti);
        } else {
            System.out.println("Sisa jatah cuti Anda tidak mencukupi");
            break;
        }
    } while (jatahCuti > 0);
   } 
}
    