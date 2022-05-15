package com.alves.domain;

public class Cube implements Shape, ThreeDimensionalShape{

    public  final int SIX_SQUARE_FACES = 6;
    public  final int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    public int getEdge(){
        return edge;
    }

    @Override
    public double area() {
        return SIX_SQUARE_FACES * Math.pow(getEdge(), 2);
    }

    @Override
    public double volume() {
        return Math.pow(getEdge(), 3);
    }
}
