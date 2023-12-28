import java.util.List;
// 2. Concrete Strategies

class YazaraGoreSiralamaStrategy implements KitapSiralamaStrategy {
    @Override
    public void sort(List<Kitap> kitaplar) {
        kitaplar.sort((b1, b2) -> b1.getYazar().compareTo(b2.getYazar()));
        System.out.println("Kitaplar yazar adına göre sıralandı.");
    }
}