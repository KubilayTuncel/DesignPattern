package BehavioralDP.ObserverDP;

public class ObserverRunner {

    public static void main(String[] args) {

        //Üyelik sistemi gibi sistemin üzerindeysek bu yapiyi kullanmak gerekir.

        ObserverRunner observer = new ObserverRunner();
        observer.observerDemo();
    }

    void observerDemo() {
        Channel channel1 = new NewsChannel();
        Channel channel2 = new NewsChannel();
        Channel channel3 = new NewsChannel();

        NewsAgency agency = new NewsAgency();

        agency.addObserver(channel1);
        agency.addObserver(channel2);
        agency.addObserver(channel3);

        agency.sendNews("Java artik TechPro ile cok daha kolay");
        agency.sendNews("SpringBoot artik kolay");
        agency.sendNews("SpringSecurity sac beyazlatir");

        System.out.println("Channel 1 Haberleri : ");
        channel1.printNews();
        System.out.println("************************");
        System.out.println("Channel 2 Haberleri : ");
        channel2.printNews();
        System.out.println("************************");
        System.out.println("Channel 3 Haberleri : ");
        channel3.printNews();
    }
}
