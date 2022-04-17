package principle.liskovsubstitution.correct;

public class liskovSubstitutionCorrect {

    public static void main(String[] args) {

        System.out.println("\nRubberDuck \nThe method makeDuckFly of class DuckProcesser does not accept rubber ducks because not implement the interface IFly =(.");
        // RubberDuck rubberDuck = new RubberDuck();
        // no se puede enviar ya que no implementa la interfas IFly porque RubberDuck no vuela.
        // DuckProcesser.makeDuckFly(rubberDuck);

        System.out.println("\nDuck");
        Duck duck = new Duck();
        DuckProcesser.makeDuckFly(duck);
        
    }
}
