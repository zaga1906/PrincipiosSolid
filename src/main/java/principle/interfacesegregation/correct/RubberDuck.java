package principle.interfacesegregation.correct;

public class RubberDuck implements ISwim, ICuack {

    @Override
    public void cuack() {
        System.out.println("The rubber duck cuack");
    }

    @Override
    public void swim() {
        System.out.println("The rubber duck swim");
    }
}
