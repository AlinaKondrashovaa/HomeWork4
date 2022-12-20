package Task;

import java.util.Random;

public abstract class Animal {
    protected String Name;

    public Animal(String name) {
        this.Name = name;
    }

    public void PrintAnimalInfo(){
        System.out.println("Animal name: " + Name);
    }

    public abstract void Run(int length);
    public abstract void Jump(double height);
    public abstract void Swim(int length);

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public static int generateRandomInt(int upperRange){
        Random random = new Random();
        return random.nextInt(upperRange);
    }

    public static double generateRandomDouble(double upperRange){
        Random random = new Random();
        return random.nextDouble(upperRange);
    }

}



