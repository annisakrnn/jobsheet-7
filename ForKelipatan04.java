import java.util.Scanner;
public class ForKelipatan04 {

    public static void main (String[] args) {
        Scanner scan04 = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan04.nextInt();

        for (int i =1; i<=50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 samapai 50 adalah %d\n", kelipatan, jumlah);
        

            }
        }
    }
}