// Inheritance (Kalıtım): Lisans öğrencisi öğrenci sınıfından kalıtım alır
class LisansOgrencisi extends Ogrenci implements NotRaporlayici {
    private int krediSayisi;
    private double notOrtalamasi;

    public LisansOgrencisi(String ad, String soyad, int ogrenciNo, int krediSayisi, double notOrtalamasi) {
        super(ad, soyad, ogrenciNo);
        this.krediSayisi = krediSayisi;
        this.notOrtalamasi = notOrtalamasi;
    }

    @Override
    public double hesaplaNotOrtalamasi() {
        return notOrtalamasi;
    }

    @Override
    public void notRaporuOlustur() {
        System.out.println("Lisans Öğrenci Not Raporu");
        bilgileriGoster();
        System.out.println("Kredi Sayısı: " + krediSayisi);
        System.out.println("Not Ortalaması: " + hesaplaNotOrtalamasi());
    }
}