import java.util.ArrayList;

public class Anggota {
    private String idAnggota;
    private String namaAnggota;
    private ArrayList<Buku> listBuku;

    public Anggota(String idAnggota, String namaAnggota) {
        this.idAnggota = idAnggota;
        this.namaAnggota = namaAnggota;
        this.listBuku = new ArrayList<Buku>();
    }

    public void addBuku(Buku b) {
        if (b.getStatusPinjam() == false) {
            b.setStatusPinjam(true);
            listBuku.add(b);
            System.out.println("buku berhasil dipinjam..");
        } else {
            System.out.println("buku gagal dipinjam..");
        }
    }

    public void displayBukuDipinjam() {
        System.out.println("Daftar Buku yg dipinjam: " + namaAnggota + " (id: " + idAnggota + ")");
        System.out.println("----------------------------------");
        for (Buku b : listBuku) {
            System.out.print("id:" + b.getIdBuku() + ", penerbit:" + b.getPenerbit() );
            if (b instanceof BukuDiktat) {
                BukuDiktat bd = (BukuDiktat) b;
                System.out.print(", judul: " + bd.getJudul() + ", pengarang: " + bd.getPengarang());
            } else if (b instanceof Majalah) {
                Majalah m = (Majalah) b;
                System.out.print(", nama: " + m.getNamaMajalah() + ", Edisi: " + m.getEdisi());
            }
            System.out.println();
        }
    }
    
}
