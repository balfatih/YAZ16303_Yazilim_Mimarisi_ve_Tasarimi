// Kitap sınıfı
class Kitap {
    private String adi;
    private String yazar;
    private int sayfaSayisi;
    private boolean populerMi;
    private boolean onerilen;

    public Kitap(String adi, String yazar, int sayfaSayisi) {
        this.adi = adi;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
    }

    public Kitap(String adi, String yazar, int sayfaSayisi, boolean populerMi, boolean onerilen) {
        this.adi = adi;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
        this.populerMi = populerMi;
        this.onerilen = onerilen;
    }


    public String getAdi() {
        return adi;
    }

    public String getYazar() {
        return yazar;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public boolean isPopulerMi() {
        return populerMi;
    }

    public boolean isOnerilen() {
        return onerilen;
    }


    @Override
    public String toString() {
        return "Kitap{" +
                "Başlık ='" + adi + '\'' +
                ", Yazar ='" + yazar + '\'' +
                ", Sayfa Sayısı =" + sayfaSayisi +
                '}';
    }
}



