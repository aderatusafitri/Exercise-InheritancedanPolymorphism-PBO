public class Main {
    public static void main(String[] args) {

        Bentuk b = new Bentuk("Merah");
        b.printInfo();

        System.out.println();

        BujurSangkar bs = new BujurSangkar(4, "Biru");
        bs.printInfo();

        System.out.println("Sisi = " + bs.getSisi());
        System.out.println("Luas = " + bs.hitungLuas());

        bs.setSisi(5);
        bs.setWarna("Hijau");

        System.out.println("Setelah diubah:");
        bs.printInfo();

        System.out.println();

        Lingkaran l = new Lingkaran(7, "Kuning");
        l.printInfo();

        System.out.println("Radius = " + l.getRadius());
        System.out.println("Phi = " + Lingkaran.PHI);

        l.setRadius(10);
        l.setWarna("Ungu");

        System.out.println("Setelah diubah:");
        l.printInfo();

        System.out.println();

        Silinder s = new Silinder(10, 7, "Putih");
        s.printInfo();

        System.out.println("Tinggi = " + s.getTinggi());
        System.out.println("Radius = " + s.getRadius());
        System.out.println("Luas alas = " + s.hitungLuas());
        System.out.println("Volume = " + s.hitungVolume());

        s.setTinggi(20);
        s.setRadius(5);
        s.setWarna("Hitam");

        System.out.println("Setelah diubah:");
        s.printInfo();
    }
}