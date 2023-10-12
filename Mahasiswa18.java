import java.util.Scanner;

public class Mahasiswa18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaMahasiswa, jenisKelamin, namaMahasiswiPerempuan = " ";
        int totalMahasiswaPerempuan = 0;

        for (int counter = 0; counter <= 30; counter++) {
            System.out.print("\nMasukkan nama mahasiswa ke-" + (counter + 1) + " : ");
            namaMahasiswa = input.nextLine();
            System.out.print("Masukkan jenis kelamin mahasiswa (L/P) ke-" + (counter + 1) + " : ");
            jenisKelamin = input.nextLine();

            if (jenisKelamin.equalsIgnoreCase("p")) {
                namaMahasiswiPerempuan += namaMahasiswa;
                totalMahasiswaPerempuan++;
            }
        }

        System.out.printf("Nama Mahasiswa Perempuan    : %s \t \n", namaMahasiswiPerempuan);
        System.out.println("Total Mahasiswa Perempuan   : " + totalMahasiswaPerempuan);
    }
}