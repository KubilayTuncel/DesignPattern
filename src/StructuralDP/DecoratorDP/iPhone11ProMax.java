package StructuralDP.DecoratorDP;

public class iPhone11ProMax extends iPhone11Pro{
    public iPhone11ProMax(iPhone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName()+ " Max";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+1000;
    }

    public String extraMethod(){
        return "Gold Renk";
    }
}
