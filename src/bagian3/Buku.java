package bagian3;

public class Buku {
    private String judul;
    private String penulis;
    private int tahun;
    private boolean dipinjam;

    public Buku(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.dipinjam = false;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void pinjam() {
        dipinjam = true;
    }

    public void kembalikan() {
        dipinjam = false;
    }

    @Override
    public String toString() {
        return judul + " | " + penulis + " | " + tahun +
                (dipinjam ? " (Dipinjam)" : " (Tersedia)");
    }
}