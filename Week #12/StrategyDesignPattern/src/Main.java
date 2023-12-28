import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Kitap> kitaplar = new ArrayList<>();
        /*
        kitaplar.add(new Kitap("Design Patterns", "Erich Gamma", 400));
        kitaplar.add(new Kitap("Clean Code", "Robert C. Martin", 464));
        kitaplar.add(new Kitap("Java: The Complete Reference", "Herbert Schildt",
                1248));
        */
        kitaplar.add(new Kitap("Design Patterns", "Erich Gamma",
                400, true, false));
        kitaplar.add(new Kitap("Clean Code", "Robert C. Martin",
                464, false, false));
        kitaplar.add(new Kitap("Java: The Complete Reference", "Herbert Schildt",
                1248, false, true));


        Kutuphane kutuphane = new Kutuphane();
        // Başlık sıralama stratejisi
        KitapSiralamaStrategy adinaGoreSiralamaStrategy = new AdinaGoreSiralamaStrategy();
        // Yazar sıralama stratejisi
        KitapSiralamaStrategy yazaraGoreSiralamaStrategy = new YazaraGoreSiralamaStrategy();
        // Sayfa sayısı sıralama stratejisi
        KitapSiralamaStrategy sayfaSayisinaGoreSiralamaStrategy = new SayfaSayisinaGoreSiralamaStrategy();

         // Popüler kitaplar durumu
        KitapState popularKitapState = new PopulerKitaplarState();
        // Önerilen kitaplar durumu
        //KitapState onerilenKitaplarState = new OnerilenKitaplarState();
        kutuphane.setSortingStrategy(adinaGoreSiralamaStrategy);
        kutuphane.kitaplariListele(kitaplar);
        kutuphane.setState(popularKitapState);
        kutuphane.kitaplarinGuncelDurumunuListele(kitaplar);
        /*
        // Sıralama stratejisini değiştir
        kutuphane.setSortingStrategy(yazaraGoreSiralamaStrategy);
        kutuphane.displayBooks(kitaplar);

        // Sıralama stratejisini bir kez daha değiştir
        kutuphane.setSortingStrategy(sayfaSayisinaGoreSiralamaStrategy);
        kutuphane.displayBooks(kitaplar);

         */
    }
}