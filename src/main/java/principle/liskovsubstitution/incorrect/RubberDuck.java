package principle.liskovsubstitution.incorrect;

public class RubberDuck extends Duck {

    @Override
    public void fly() {
        throw new Error();
    }

    @Override
    public void swim() {
        System.out.println("The rubber duck swim");
    }

    @Override
    public void cuack() {
        System.out.println("The rubber duck cuack");
    }
}
