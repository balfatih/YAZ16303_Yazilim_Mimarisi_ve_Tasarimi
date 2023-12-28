import java.util.List;

// 2. Concrete Strategies
class AdinaGoreSiralamaStrategy implements KitapSiralamaStrategy {
    @Override
    public void sort(List<Kitap> kitaplar) {
        kitaplar.sort((b1, b2) -> b1.getAdi().compareTo(b2.getAdi()));
        System.out.println("Kitaplar, başlık sırasına göre sıralandı.");
    }
}












