package CreationalDP.SingletonDP;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        // SingletonObject obj1= new SingletonObject(); parametresiz Cont. private cektik. Cünkü class i Sibgleton a ayarladik

        SingletonObject obj2 = SingletonObject.getInstance();
        System.out.println(obj2.message);
        obj2.changeMessage();

        SingletonObject obj3 = SingletonObject.getInstance();
        System.out.println("obj3 icin : "+obj3.message);

    }
}
