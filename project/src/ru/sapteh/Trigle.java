package ru.sapteh;

public class Trigle extends Shape {

    private int base;
    private int height;

    public Trigle(String color, int x, int y, int base, int height) {
        super(color, x, y);
        this.base = base;
        this.height = height;
    }
    public int getBase(){
        return base;
    }
    public int getHeight(){
        return height;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double area(){
        return 0.5 * base * height;
    }
    @Override
    public String draw (){
        return "Trigle";
    }
    @Override
    public String toString(){
        return "Color " + super.getColor() + "\n" +
                "Коорд x " + super.getX() + "\n" +
                "Коорд y " + super.getY() + "\n" +
                "Base " + getBase() + "\n" +
                "Height " + getHeight() + "\n" +
                "Area " + area() + "\n" +
                "Draw " + draw();

    }
}
