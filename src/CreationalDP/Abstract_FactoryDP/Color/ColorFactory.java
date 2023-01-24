package CreationalDP.Abstract_FactoryDP.Color;

import CreationalDP.Abstract_FactoryDP.AbstractFactory;
import CreationalDP.Abstract_FactoryDP.Shape.Shape;

public class ColorFactory extends AbstractFactory {


    @Override
    public Color getColor(String color) {
        if(color==null) return null;

        if (color.equalsIgnoreCase("red")){
            return new Red();
        }else if (color.equalsIgnoreCase("green")){
            return new Green();
        }else if (color.equalsIgnoreCase("blue")){
            return new Blue();
        }

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }

}
