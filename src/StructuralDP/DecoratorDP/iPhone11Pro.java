package StructuralDP.DecoratorDP;

public class iPhone11Pro extends PhoneDecorator{
    public iPhone11Pro(iPhone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName() + "11 Pro";
    }

    @Override
    public int cameraCount() {
        return super.cameraCount()+1;
    }

    @Override
    public double getPrice() {
        return super.getPrice()+500;
    }
}
