package CreationalDP.Abstract_FactoryDP;

import CreationalDP.Abstract_FactoryDP.Color.ColorFactory;
import CreationalDP.Abstract_FactoryDP.Shape.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }

        return null;
    }
}
