package CreationalDP.Abstract_FactoryDP;

import CreationalDP.Abstract_FactoryDP.Color.Color;
import CreationalDP.Abstract_FactoryDP.Shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
