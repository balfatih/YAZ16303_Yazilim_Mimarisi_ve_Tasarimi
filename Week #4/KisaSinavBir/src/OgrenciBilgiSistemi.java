public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        LisansOgrencisi lisansOgrenci = new LisansOgrencisi("Fatih", "Bal", 12345, 120, 3.25);
        lisansOgrenci.notRaporuOlustur();

        YuksekLisansOgrencisi yuksekLisansOgrenci = new YuksekLisansOgrencisi("Mehmet", "Demir", 54321, 85);
        yuksekLisansOgrenci.notRaporuOlustur();
    }
}