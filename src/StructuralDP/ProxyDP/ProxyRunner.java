package StructuralDP.ProxyDP;

public class ProxyRunner {

    public static void main(String[] args) {


        ProxyClass proxyClass1 = new ProxyClass("c://resim1.jpg");
        ProxyClass proxyClass2 = new ProxyClass("c://resim2.jpg");

        proxyClass1.showImage(); //sadece bu method geldi. Cünkü if icerisinde sadece bu method'u actik.
        //mesela Student'lar sadece get leme islemi yapabilirken, Admin setleme islemini de yapyabilsin demek istersek
        //bu Proxy design pattern kullanmak faydali

    }
}
