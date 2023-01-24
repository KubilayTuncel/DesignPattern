package StructuralDP.DecoratorDP;

public class iPhone11 extends PhoneDecorator{
    public iPhone11(iPhone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName() + "11";
    }


}
