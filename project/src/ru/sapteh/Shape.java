package ru.sapteh;

public abstract class Shape {
    private String color;
    private int x;
    private int y;

    public Shape (String color, int x, int y){

    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String getColor(){
        return color;
    }
    public abstract double area();
    public abstract String draw();

}
