import java.util.List;

// 3. Context Sınıfı
class Kutuphane {
    private KitapSiralamaStrategy siralamaStrategy;

    public Kutuphane(){
        //
    }
    public void setSortingStrategy(KitapSiralamaStrategy siralamaStrategy) {
        this.siralamaStrategy = siralamaStrategy;
    }
    public void kitaplariListele(List<Kitap> kitaplar) {
        // Kitapları belirlenen stratejiye göre sırala ve listele
        siralamaStrategy.sort(kitaplar);
        for (Kitap kitap : kitaplar) {
            System.out.println(kitap);
        }
    }
    private KitapState guncelDurumu;
    public void setState(KitapState state) {
        this.guncelDurumu = state;
    }

    public void kitaplarinGuncelDurumunuListele(List<Kitap> kitaplar) {
        guncelDurumu.kitapGoruntule(kitaplar);
    }


}