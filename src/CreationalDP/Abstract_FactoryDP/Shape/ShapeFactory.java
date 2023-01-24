package CreationalDP.Abstract_FactoryDP.Shape;

import CreationalDP.Abstract_FactoryDP.AbstractFactory;
import CreationalDP.Abstract_FactoryDP.Color.Color;


public class ShapeFactory  extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape==null) {
            return null;
        }

        if (shape.equalsIgnoreCase("DAIRE")) {
            return new Circle();
        }else if(shape.equalsIgnoreCase("DIKDÖRTGEN")){
            return new Rectangle();
        }else if (shape.equalsIgnoreCase("KARE")){
            return new Square();
        }

        return null;
    }

}
