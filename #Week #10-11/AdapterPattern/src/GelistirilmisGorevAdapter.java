public class GelistirilmisGorevAdapter implements Gorev{

    private GelistirilmisGorev gelistirilmisGorev;

    public GelistirilmisGorevAdapter(GelistirilmisGorev gelistirilmisGorev) {
        this.gelistirilmisGorev = gelistirilmisGorev;
    }
    @Override
    public String getGorevAdi() {
        return gelistirilmisGorev.taskIsımGetir();
    }
}
