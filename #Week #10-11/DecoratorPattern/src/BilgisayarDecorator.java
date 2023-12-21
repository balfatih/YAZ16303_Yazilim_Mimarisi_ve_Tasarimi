abstract class BilgisayarDecorator implements Bilgisayar {

    protected Bilgisayar bilgisayar;

    public BilgisayarDecorator(Bilgisayar bilgisayar) {
        this.bilgisayar = bilgisayar;
    }

    @Override
    public double fiyat() {
        return bilgisayar.fiyat();
    }

    @Override
    public String aciklama() {
        return bilgisayar.aciklama();
    }
}
