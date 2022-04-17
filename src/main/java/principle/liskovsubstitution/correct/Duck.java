package principle.liskovsubstitution.correct;

public class Duck implements IFly, ISwim, ICuack{
    @Override
    public void cuack() {
        System.out.println("The duck cuack");
    }

    @Override
    public void fly() {
        System.out.println("The duck fly");
    }

    @Override
    public void swim() {
        System.out.println("The duck swim");
    }
}
