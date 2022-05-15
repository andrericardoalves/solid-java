package com.alves.util;

import com.alves.bo.IAreaCalculator;
import com.alves.domain.Shape;

import java.util.List;

public class ShapesPrinter {
    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes){
        return String.format("{shapesSum:%s}",(areaCalculator.sum(shapes))) ;
    }

    public String csv(List<Shape> shapes){
        return String.format("{shapesSum,%s}",(areaCalculator.sum(shapes))) ;
    }
}
