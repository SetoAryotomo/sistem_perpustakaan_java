public class Main {
    public static void main(String[] args) {
        System.out.println("Sistem Perpustakaan.");
        System.out.println("=========================");
        BukuDiktat b1 = new BukuDiktat("123","Ganesha","Pemrograman java Dasar","Paijo");
        BukuDiktat b2 = new BukuDiktat("124","Andi Offset","Pemrograman java Lanjut","Paijo");
        BukuDiktat b3 = new BukuDiktat("125","Andi Offset","Pemrograman Web Dasar","Sri Sulastri");
        BukuDiktat b4 = new BukuDiktat("125","Andi Offset","Pemrograman Web Lanjut","Sri Sulastri");

        Majalah m1 = new Majalah("131","Elek Media","Komputek","200");
        Majalah m2 = new Majalah("132","Elek Media","Trunbus","100");

        Anggota a1 = new Anggota("112","Ariel");
        Anggota a2 = new Anggota("113","Fadil");
        a1.addBuku(b1);
        a1.addBuku(b2);
        a1.displayBukuDipinjam();
        System.out.println("");
        a2.addBuku(b3);
        a2.addBuku(b1);
        a2.addBuku(m1);
        a2.displayBukuDipinjam();
        System.out.println("");
    }
}
