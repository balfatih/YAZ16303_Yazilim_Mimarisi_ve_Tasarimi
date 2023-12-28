import java.util.List;

public class OnerilenKitaplarState implements KitapState{
    @Override
    public void kitapGoruntule(List<Kitap> kitaplar) {
        System.out.println("Önerilen kitaplar:");
        for (Kitap kitap : kitaplar) {

            if (kitap.isOnerilen()) {
                System.out.println(kitap);
            }
        }
    }
}
