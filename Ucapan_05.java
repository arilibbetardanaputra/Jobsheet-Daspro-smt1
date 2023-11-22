import java.util.Scanner;

public class Ucapan_05  {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Nama Orang yang ingin Anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    } 
    
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " +nama+ "\nMay the force be with you");
    }
}
