import java.util.List;
// 2. Concrete Strategies

class SayfaSayisinaGoreSiralamaStrategy implements KitapSiralamaStrategy {
    @Override
    public void sort(List<Kitap> kitaplar) {
        kitaplar.sort((b1, b2) -> Integer.compare(b1.getSayfaSayisi(), b2.getSayfaSayisi()));
        System.out.println("Kitaplar sayfa sayısına göre sıralandı.");
    }
}