abstract class Ogrenci {
    private String ad;
    private String soyad;
    private int ogrenciNo;

    public Ogrenci(String ad, String soyad, int ogrenciNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.ogrenciNo = ogrenciNo;
    }

    // Soyut metod: Öğrenci notlarını hesaplamak için alt sınıflar tarafından implemente edilmelidir
    public abstract double hesaplaNotOrtalamasi();

    // Bilgileri gösteren metot
    public void bilgileriGoster() {
        System.out.println("Öğrenci Adı: " + ad);
        System.out.println("Öğrenci Soyadı: " + soyad);
        System.out.println("Öğrenci Numarası: " + ogrenciNo);
    }
}
