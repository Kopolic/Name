package ru.sapteh;

public class Cat extends Animal {

    private String color;
    public Cat (String color, int age, int weight, String name){
        super(age, weight, name);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String eat(){
        return "Meat";
    }
    @Override
    public String voice(){
        return "The noises";
    }
    @Override
    public String drive(){
        return "Walk the earth";
    }

    public String toString() {
        return "Name: " + getName() + "\n" +
                "Color: " + getColor() + "\n" +
                "Age: " + getAge() + "\n" +
                "Weight: " + getWeight() + "\n" +
                "Voice: " + voice()+ "\n" +
                "Eat: " + eat() + "\n" +
                "Drive: " + drive();
    }

}