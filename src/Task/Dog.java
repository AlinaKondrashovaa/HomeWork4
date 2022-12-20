package Task;

public class Dog extends Animal {
    private int runAbility;
    private double jumpAbility;
    private int swimAbility;

    public Dog(String name) {
        super(name);
        this.jumpAbility = generateRandomDouble(0.5);
        this.runAbility = generateRandomInt(500);
        this.swimAbility = generateRandomInt(10);
    }

    @Override
    public void Run(int length) {
        boolean b = (length < runAbility);
        System.out.println("Run: " + b);
    }

    @Override
    public void Jump(double height) {
        boolean b = (height < jumpAbility);
        System.out.println("Jump: " + b);
    }

    @Override
    public void Swim(int length) {
        boolean b = (length < (swimAbility/100));
        System.out.println("Swim: " + b);
    }

    public int getRunAbility() {
        return runAbility;
    }

    public void setRunAbility(int runAbility) {
        this.runAbility = runAbility;
    }

    public double getJumpAbility() {
        return jumpAbility;
    }

    public void setJumpAbility(double jumpAbility) {
        this.jumpAbility = jumpAbility;
    }

    public int getSwimAbility() {
        return swimAbility;
    }

    public void setSwimAbility(int swimAbility) {
        this.swimAbility = swimAbility;
    }
}
