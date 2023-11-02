
// Inheritance (Kalıtım): Yüksek lisans öğrencisi öğrenci sınıfından kalıtım alır
class YuksekLisansOgrencisi extends Ogrenci implements NotRaporlayici {
    private int tezNotu;

    public YuksekLisansOgrencisi(String ad, String soyad, int ogrenciNo, int tezNotu) {
        super(ad, soyad, ogrenciNo);
        this.tezNotu = tezNotu;
    }

    @Override
    public double hesaplaNotOrtalamasi() {
        return tezNotu;
    }

    @Override
    public void notRaporuOlustur() {
        System.out.println("Yüksek Lisans Öğrenci Not Raporu");
        bilgileriGoster();
        System.out.println("Tez Notu: " + hesaplaNotOrtalamasi());
    }
}