package praktek;

public class Anggota {
    public String nama;
	public int id;
	
	public Anggota(String nama, int id) {
		this.nama=nama;
		this.id=id;
	}
	
	public void tampilkanDataAnggota() {
		System.out.println("Nama: " + nama);
                System.out.println("ID: " + id);
	}
}