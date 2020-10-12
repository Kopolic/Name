package ru.sapteh;

public abstract class Animal implements Voice, Eat, Drive{
    private int age;
    private int weight;
    private String name;

    public Animal(int age, int weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }
    public Animal (){};
    public Animal (int age, int weight){
        this.age = age;
        this.weight = age;
    }

    public Animal(int age){
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    public String voice(){
        return null;
    }
    public String eat(){
        return null;
    }
    public String drive(){
        return null;
    }

}
