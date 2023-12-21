public class RamEkleDecorator extends BilgisayarDecorator{
    public RamEkleDecorator(Bilgisayar bilgisayar) {
        super(bilgisayar);
    }

    @Override
    public double fiyat() {
        return super.fiyat() + 2500;
    }

    @Override
    public String aciklama() {
        return super.aciklama() + " 8 GB RAM eklendi... ";
    }
}
