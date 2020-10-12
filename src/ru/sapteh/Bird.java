package ru.sapteh;

public class Bird extends Animal{

    private String breed;
    public Bird (String breed, int age, int weight, String name){
        super(age, weight, name);
        this.breed = breed;

    }
    public String getBreed () {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    @Override
    public String eat(){
        return "Seeds";
    }
    @Override
    public String voice(){
        return "Tweets";
    }
    @Override
    public String drive(){
        return "Flying in air";
    }

    public String toString() {
        return "Name: " + getName() + "\n" +
                "Breed: " + getBreed() + "\n" +
                "Age: " + getAge() + "\n" +
                "Weight: " + getWeight() + "\n" +
                "Voice: " + voice()+ "\n" +
                "Eat: " + eat() + "\n" +
                "Drive: " + drive();
    }

}
