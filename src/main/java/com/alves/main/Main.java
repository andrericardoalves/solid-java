package com.alves.main;

import com.alves.bo.AreaCalculator;
import com.alves.bo.IAreaCalculator;
import com.alves.domain.*;
import com.alves.util.ShapesPrinter;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        Square square = new Square(4);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(2,3);
        Cube cube = new Cube(3);

        List<Shape> shapes = List.of(square, circle, rectangle, cube);
        areaCalculator.sum(shapes);

        ShapesPrinter printer = new ShapesPrinter(areaCalculator);

        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));
    }
}
