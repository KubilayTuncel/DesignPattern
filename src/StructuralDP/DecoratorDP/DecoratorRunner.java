package StructuralDP.DecoratorDP;

public class DecoratorRunner {
    public static void main(String[] args) {
        Phone phone = new iPhone11ProMax(new iPhone());

        System.out.println("Name : "+phone.getName());
        System.out.println("Price : "+phone.getPrice());
        System.out.println("Camera count : "+phone.cameraCount());

    }
}
