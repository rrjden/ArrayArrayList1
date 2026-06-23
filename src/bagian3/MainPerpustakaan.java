package bagian3;

public class MainPerpustakaan {

    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();

        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Sang Pemimpi", "Andrea Hirata", 2006));
        perpus.tambahBuku(new Buku("Bumi", "Tere Liye", 2014));

        System.out.println("=== Daftar Buku ===");
        perpus.tampilkanSemuaBuku();

        System.out.println("\n=== Meminjam Buku ===");
        perpus.pinjamBuku("Bumi");

        System.out.println("\n=== Mengembalikan Buku ===");
        perpus.kembalikanBuku("Bumi");

        System.out.println("\n=== Cari Buku Berdasarkan Penulis ===");
        perpus.cariPenulis("Andrea Hirata");
    }
}