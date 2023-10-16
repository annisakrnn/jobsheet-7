import java.util.Scanner;
public class DoWhileModifikasi2 {

     public static void main (String[] args) {
        Scanner scan04 = new Scanner(System.in);

          int jatahCuti, jumlahHari;
    String konfirmasi;

    System.out.print("Jatah Cuti: ");
    jatahCuti = scan04.nextInt();

    do {
        System.out.print("Apakah Anda ingin mengambil cuti (ya/tidak)? ");
        konfirmasi = scan04.next();

        if (konfirmasi.equalsIgnoreCase("ya")) {
            System.out.print("Jumlah Hari: ");
            jumlahHari = scan04.nextInt();

            if (jumlahHari <= jatahCuti) {
                jatahCuti -= jumlahHari;
                System.out.println("Sisa Jatah Cuti: " + jatahCuti);
            } else {
                System.out.println("Sisa jatah cuti Anda tidak mencukupi");
            }
        }else {
            break;
        }
    } while (jatahCuti > 0);
    }
}
     
