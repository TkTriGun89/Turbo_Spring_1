package com.factoryshapes.shapes;

public interface IShapeFactory {
    Shapes createShape(String shapeType, long shapeSize1, long shapeSize2);
}
