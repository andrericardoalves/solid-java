package com.alves.bo;

import com.alves.domain.Shape;

import java.util.List;

public class AreaCalculator implements IAreaCalculator{
    @Override
    public double sum(List<Shape> shapes) {
        return shapes.stream()
                .map(x -> x.area())
                .reduce(0.0, Double::sum );
    }
}
