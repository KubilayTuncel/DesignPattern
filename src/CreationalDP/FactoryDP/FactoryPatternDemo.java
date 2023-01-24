package CreationalDP.FactoryDP;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape circle1 = new Circle();
        circle1.draw();

        Shape square1 = new Square();
        square1.draw();

        Shape rectangle1 = new Rectangle();
        rectangle1.draw();

        //cagirilan yerde domain class'im bilinmesin ve ya tekrar tekrar new leme yapmamak icin
        // factory design pattern kullaniliyor.
        //Güzel bir pattern main ile domain arasindaki bagliligi ortadan kaldiriyor.
        System.out.println("*************************");
        System.out.println("Factory Desing Pattern ile cözüm");
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("daire");
        Shape shape2 = shapeFactory.getShape("dikdörtgen");
        Shape shape3 = shapeFactory.getShape("kare");

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
