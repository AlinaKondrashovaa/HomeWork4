package Task;

public class Main {
    public static void main(String[] args){
        Cat Cat1 = new Cat("Маруся");
        Cat1.PrintAnimalInfo();
        Cat1.Run(100);
        System.out.println("Cat run limit: " + Cat1.getRunAbility() + " meters");
        Cat1.Jump(0.5);
        System.out.println("Cat jump limit: " + Cat1.getJumpAbility()+ " meters");
        Cat1.Swim(5);
        System.out.println("Cat's can't swim" + "\n");
        Dog Dog1 = new Dog("Борис");
        Dog1.PrintAnimalInfo();
        Cat1.Run(200);
        System.out.println("Dog run limit: " + Dog1.getRunAbility() + " meters");
        Cat1.Jump(0.1);
        System.out.println("Dog jump limit: " + Dog1.getJumpAbility()+ " meters");
        Cat1.Swim(5);
        System.out.println("Dog swim limit: " + Dog1.getSwimAbility()+ " meters");
    }
}
