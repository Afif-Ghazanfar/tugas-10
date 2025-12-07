package praktek;

public class Book {
    public String judul;
    public String penulis;
    public String tahunTerbit;
    public boolean isBooked;
    
    public Book(String judul, String penulis, String tahunTerbit, boolean isBooked) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.isBooked = isBooked;
    }
    
    public void tampilkanDataBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println(isBooked ? "Buku telah dipinjam" : "Buku belum dipinjam");
    }
}