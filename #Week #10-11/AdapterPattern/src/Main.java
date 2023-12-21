public class Main {
    public static void main(String[] args) {

        //Mevcut sistemdeki görev
        Gorev basitGorev = new BasitGorev("Temel Görevler");

        //farklı bir görev tipi
        GelistirilmisGorev gelistirilmisGorev = new GelistirilmisGorev("Gelişmiş Görevler");

        //adaptasyon işlemleri
        Gorev adapter = new GelistirilmisGorevAdapter(gelistirilmisGorev);

        System.out.println("Basit Görev: "  + basitGorev.getGorevAdi());
        System.out.println("Gelişmiş Görev: "+ adapter.getGorevAdi());
    }
}

/*
*
* Hedef (Target)
* Adapte edilen sınıf (Adaptee)
* Adapter
* */