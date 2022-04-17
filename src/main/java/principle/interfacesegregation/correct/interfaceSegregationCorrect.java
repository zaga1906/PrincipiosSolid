package principle.interfacesegregation.correct;

public class interfaceSegregationCorrect {

    public static void main(String[] args) {

        Duck duck = new Duck();
        System.out.println("\nThe duck can fly, swim and cuack.");
        duck.fly();
        duck.swim();
        duck.cuack();

        RubberDuck rubberDuck  = new RubberDuck();
        System.out.println("\nThe rubber duck can swim and cuack but can't fly so I do not need to implement the interface IFly in the class RubberDuck.");
        // rubberDuck.fly();
        rubberDuck.swim();
        rubberDuck.cuack();

    }
}
