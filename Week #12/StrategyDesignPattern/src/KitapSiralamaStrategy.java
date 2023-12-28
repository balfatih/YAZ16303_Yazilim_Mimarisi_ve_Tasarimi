import java.util.List;

// 1. Strategy Arayüzü
interface KitapSiralamaStrategy {
    void sort(List<Kitap> kitaplar);
}