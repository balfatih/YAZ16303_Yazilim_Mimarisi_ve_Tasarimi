public class Main {
    public static void main(String[] args) {

        Bilgisayar temelBilgisyayar = new TemelBilgisayar();
        System.out.println("Fiyat: " +temelBilgisyayar.fiyat()+" TL");
        System.out.println("Açıklama: "+ temelBilgisyayar.aciklama());


        //RAM eklenmiş
        Bilgisayar ramBilgisayar = new RamEkleDecorator(new TemelBilgisayar());
        System.out.println("Fiyat: " + ramBilgisayar.fiyat()+ " TL");
        System.out.println("Açıklama: " + ramBilgisayar.aciklama());

        //Depolama Birimi ve RAM eklenen
        Bilgisayar depolamaRamliBilgisayar = new DepolamaBirimiEkleDecorator(new RamEkleDecorator(new TemelBilgisayar()));
        System.out.println("Fiyat: " + depolamaRamliBilgisayar.fiyat()+ " TL");
        System.out.println("Açıklama: " + depolamaRamliBilgisayar.aciklama());

        //Sadece Depolama
        Bilgisayar depolamaBilgisayar = new DepolamaBirimiEkleDecorator(new TemelBilgisayar());
        System.out.println("Fiyat: " + depolamaBilgisayar.fiyat()+ " TL");
        System.out.println("Açıklama: " + depolamaBilgisayar.aciklama());


    }
}