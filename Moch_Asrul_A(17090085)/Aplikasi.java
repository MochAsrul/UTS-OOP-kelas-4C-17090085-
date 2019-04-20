import service.*;
import entity.*;
import java.util.*;

public class Aplikasi {

    private static SuratService service;
    private static Scanner scanner;

    public static void main(String[] args) {
        service = new SuratService();
        scanner = new Scanner(System.in);

        int opsi = 5;
        do {
            showMenu();
            try {
                scanner = new Scanner(System.in);
                opsi = scanner.nextInt();
            } catch(InputMismatchException e) {
                System.err.println("inputan salah, coba untuk memilih sesuai menu");
                opsi = 0;
            } catch(NoSuchElementException nsee) {

            }
            prosesOpsi(opsi);
        } while(opsi != 5);
    }

    private static void prosesOpsi(int pilihan) {
        switch(pilihan) {
            case 1:
                showFormTambahData();
                break;
            case 2:
                showFormEditData();
                break;
            case 3:
                showDeleteData();
                break;
            case 4:
                service.showAllData();
                break;
            case 5:
                System.out.println("Terima kasih telah menggunakan Aplikasi saya");

        }
    }

    private static void showDeleteData() {
        scanner = new Scanner(System.in);
        System.out.println("\n=--= Form Hapus Data =--=");
        System.out.print("NAMA PENGIRIM : ");
        String nama_pengirim = scanner.nextLine();
        service.deleteData(nama_pengirim);
    }

    private static void showFormEditData() {
        scanner = new Scanner(System.in);
        String nama_pengirim, tanggal, tujuan;

        System.out.println("\n=--= Form Ubah Data =--=");
        System.out.print("NAMA PENGIRIM : ");
        nama_pengirim = scanner.nextLine();
        System.out.print("TANGGAL : ");
        tanggal = scanner.nextLine();
        System.out.print("TUJUAN : ");
        tujuan = scanner.nextLine();
        service.updateData(new Surat(nama_pengirim, tanggal, tujuan));
    }

    private static void showFormTambahData() {
        scanner = new Scanner(System.in);
        String nama_pengirim, tanggal, tujuan;

        System.out.println("\n=--= Form Entry Data =--=");
        System.out.print("NAMA PENGIRIM : ");
        nama_pengirim = scanner.nextLine();
        System.out.print("TANGGAL : ");
        tanggal = scanner.nextLine();
        System.out.print("TUJUAN : ");
        tujuan = scanner.nextLine();
        service.addData(new Surat(nama_pengirim, tanggal, tujuan));
    }

    private static void showMenu() {
        System.out.println("=---= Aplikasi Surat Keluar =---=");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. KELUAR");
        System.out.println("-------------------");
        System.out.print  ("pilihan > ");
    }

}