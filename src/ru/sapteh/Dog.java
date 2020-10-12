package ru.sapteh;

public class Dog extends Animal {

    private String LoveGame;
    public Dog (String LoveGame, int age, int weight, String name){
        super(age, weight, name);
        this.LoveGame = LoveGame;

    }
    public String getLoveGame() {
        return LoveGame;
    }

    public void setLoveGame(String LoveGame) {
        this.LoveGame = LoveGame;
    }

    @Override
    public String eat(){
        return "Meat";
    }
    @Override
    public String voice(){
        return "Breaking";
    }
    @Override
    public String drive(){
        return "Walk the earth";
    }

    public String toString() {
        return "Name: " + getName() + "\n" +
                "Game: " + getLoveGame() + "\n" +
                "Age: " + getAge() + "\n" +
                "Weight: " + getWeight() + "\n" +
                "Voice: " + voice()+ "\n" +
                "Eat: " + eat() + "\n" +
                "Drive: " + drive();
    }

}
