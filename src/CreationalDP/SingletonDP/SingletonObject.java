package CreationalDP.SingletonDP;

public class SingletonObject {

    String message = "merhaba";

    //1. Adim : static bir objeyi class icerisinde private access ile olusturuyoruz
    private static SingletonObject instance = new SingletonObject();

    //2. Adim : parametresiz cont. private cekiyoruz.
    //Cont. private cekmemizin mantigi Singleton Design pattern.
    //Bu kisimdan soru gelebilir.
    private SingletonObject() {};

    //3. Adim : Burasi Singleton kalbi
    // Burada new'leme islemini ana class'ta olusturmamak icin ve objeyi runner class'ta
    // cagirabilmek icin public static bir method olusturduk.
    //Bu sekilde farkli calisma alanlarinda tek obje üyerinden islem yapiyoruz.
    //Spring boot framework'te bean mantiginin arkasinda Singleton method olmasinin sebebi bu.
    public static SingletonObject getInstance() {
        return instance;
    }

    public void changeMessage() {
        this.message = this.message + " Batch 104";
    }

}
