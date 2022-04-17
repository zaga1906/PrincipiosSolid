package principle.liskovsubstitution.incorrect;

public class liskovSubstitutionIncorrect {

    public static void main(String[] args) {

        System.out.println("\nRubberDuck");
        RubberDuck rubberDuck = new RubberDuck();
        DuckProcesser.makeDuckFly(rubberDuck);

        System.out.println("\nDuck");
        Duck duck = new Duck();
        DuckProcesser.makeDuckFly(duck);

    }
}
