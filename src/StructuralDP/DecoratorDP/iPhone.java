package StructuralDP.DecoratorDP;

public class iPhone implements Phone{
    @Override
    public String getName() {
        return "IPhone";
    }

    @Override
    public int cameraCount() {
        return 2;
    }

    @Override
    public double getPrice() {
        return 7999.9;
    }
}
