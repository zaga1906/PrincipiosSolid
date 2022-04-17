package principle.interfacesegregation.incorrect;

public class Duck implements IDuck {
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
