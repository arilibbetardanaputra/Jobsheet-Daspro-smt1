import java.util.Scanner;

public class Kubus05 {
    static final int JUMLAH_MAHASISWA = 5;
    static final int JUMLAH_MINGGU = 7;

    static int[][] nilaiMahasiswa = new int[JUMLAH_MAHASISWA][JUMLAH_MINGGU];
    static String[] namaMahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};

    public static void main(String[] args) {
        inputDataNilaiMahasiswa();
        tampilkanNilaiMahasiswa();
        cariHariNilaiTertinggi();
        tampilkanMahasiswaNilaiTertinggi();
    }

    static void inputDataNilaiMahasiswa() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.println("Input nilai untuk mahasiswa " + namaMahasiswa[i] + ":");
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.print("Minggu ke " + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }
    }

    static void tampilkanNilaiMahasiswa() {
        System.out.println("\nNilai Mahasiswa:");
        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.print(namaMahasiswa[i] + ": ");
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void cariHariNilaiTertinggi() {
        int hariTertinggi = 0;
        int nilaiTertinggi = 0;

        for (int j = 0; j < JUMLAH_MINGGU; j++) {
            int totalNilaiHari = 0;
            for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
                totalNilaiHari += nilaiMahasiswa[i][j];
            }
            if (totalNilaiHari > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiHari;
                hariTertinggi = j + 1;
            }
        }

        System.out.println("\nNilai tertinggi ada pada minggu ke-" + hariTertinggi);
    }

    static void tampilkanMahasiswaNilaiTertinggi() {
        int mahasiswaTertinggi = 0;
        int nilaiTertinggi = 0;

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            int totalNilaiMahasiswa = 0;
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                totalNilaiMahasiswa += nilaiMahasiswa[i][j];
            }
            if (totalNilaiMahasiswa > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiMahasiswa;
                mahasiswaTertinggi = i;
            }
        }

        System.out.println("\nMahasiswa dengan nilai tertinggi adalah " + namaMahasiswa[mahasiswaTertinggi]
                + " dengan nilai " + nilaiTertinggi + " (minggu ke-)");
        for (int j = 0; j < JUMLAH_MINGGU; j++) {
            System.out.print((j + 1) + ": " + nilaiMahasiswa[mahasiswaTertinggi][j] + " ");
        }
    }
}
