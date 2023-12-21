public class BasitGorev implements Gorev {

    private String gorevAdi;

    public BasitGorev(String gorevAdi) {
        this.gorevAdi = gorevAdi;
    }

    @Override
    public String getGorevAdi() {
        return gorevAdi;
    }
}
