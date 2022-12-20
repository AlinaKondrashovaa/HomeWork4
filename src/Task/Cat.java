package Task;

public class Cat extends Animal {
    private int runAbility;
    private double jumpAbility;
    public Cat(String name) {
        super(name);
        this.jumpAbility = generateRandomDouble(2);
        this.runAbility = generateRandomInt(200);
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
        boolean b = false;
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
}
