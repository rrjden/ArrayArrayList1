package bagian3;

import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> daftarBuku;

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanSemuaBuku() {
        for (Buku buku : daftarBuku) {
            System.out.println(buku);
        }
    }

    public void pinjamBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                if (!buku.isDipinjam()) {
                    buku.pinjam();
                    System.out.println("Buku berhasil dipinjam.");
                } else {
                    System.out.println("Buku sedang dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    public void kembalikanBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                buku.kembalikan();
                System.out.println("Buku berhasil dikembalikan.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    public void cariPenulis(String penulis) {
        boolean ditemukan = false;

        for (Buku buku : daftarBuku) {
            if (buku.getPenulis().equalsIgnoreCase(penulis)) {
                System.out.println(buku);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada buku dari penulis tersebut.");
        }
    }
}