import java.util.List;

public class PopulerKitaplarState implements KitapState{
    @Override
    public void kitapGoruntule(List<Kitap> kitaplar) {
        // Popüler kitapları ekrana yazdır
        System.out.println("Popüler kitaplar:");
        for (Kitap kitap : kitaplar) {

            if (kitap.isPopulerMi()) {
                System.out.println(kitap);
            }
        }
    }
}
