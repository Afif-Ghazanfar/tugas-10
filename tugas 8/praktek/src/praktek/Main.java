package praktek;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Book[] koleksi = new Book[5];
        koleksi[0] = new Book("Laut Bercerita", "Leila", "2017", false);
        koleksi[1] = new Book("Filosofi Teras", "Henry", "2018", false);
        koleksi[2] = new Book("Atomic Habits", "James", "2018", false);
        koleksi[3] = new Book("Sebuah Seni untuk Bersikap Bodo Amat", "Mark", "2016", false);
        koleksi[4] = new Book("Bicara Itu Ada Seninya", "Oh Su Hyang", "2018", false);

        int pilihan;

        do {
            System.out.println("\n===== SISTEM PERPUSTAKAAN =====");
            System.out.println("1. Lihat semua buku");
            System.out.println("2. Cari buku berdasarkan judul");
            System.out.println("3. Pinjam buku");
            System.out.println("4. Kembalikan buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Daftar Book ---");
                    for(Book b : koleksi) {
                        System.out.println("Judul: " + b.judul);
                        System.out.println("Penulis: " + b.penulis);
                        System.out.println("Tahun Terbit: " + b.tahunTerbit);
                        System.out.println("=========================");
                        }
                    System.out.println("Tekan enter untuk melanjutkan...");
                    input.nextLine();
                    break;

                case 2:
                    System.out.print("Masukkan judul buku yang dicari: ");
                    String cari = input.nextLine();
                    boolean ditemukan = false;
                    for (Book b : koleksi) {
                        if (b.judul.equalsIgnoreCase(cari)) {
                            b.tampilkanDataBuku();
                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Buku tidak ditemukan!");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan judul buku yang ingin dipinjam: ");
                    String pinjam = input.nextLine();
                    boolean ada = false;
                     for (Book b : koleksi) {
                        if (b.judul.equalsIgnoreCase(pinjam)) {
                            ada = true;
                            if (b.isBooked) {
                                System.out.println("Maaf, buku telah dipinjam!");
                            } else {
                                b.isBooked = true;
                                System.out.println("Buku \"" + b.judul + "\" berhasil dipinjam!");
                            }
                            break;
                        }
                    }
                    if (!ada) {
                        System.out.println("Buku tidak ditemukan!");
                    }

                    break;
                    
                case 4:
                    System.out.print("Masukkan judul buku yang dikembalikan: ");
                    String kembali = input.nextLine();
                    boolean ditemukanKembali = false;
                    for (Book b : koleksi) {
                        if (b.judul.equalsIgnoreCase(kembali)) {
                            ditemukanKembali = true;
                            if (b.isBooked) {
                                b.isBooked = false;
                                System.out.println("Buku \"" + b.judul + "\" telah dikembalikan.");
                            } else {
                                System.out.println("Buku ini belum dipinjam.");
                            }
                            break;
                        }
                    }
                    if (!ditemukanKembali) {
                        System.out.println("Buku tidak ditemukan!");
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari sistem...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);
        input.close();
    }
}