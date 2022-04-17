package principle.interfacesegregation.incorrect;

public class RubberDuck implements IDuck {
    @Override
    public void cuack() {
        System.out.println("The rubber duck cuack");
    }

    @Override
    public void fly() {
        System.out.println("The rubber duck cant fly");
    }

    @Override
    public void swim() {
        System.out.println("The rubber duck swim");
    }
}
