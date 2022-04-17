package principle.interfacesegregation.incorrect;

public class interfaceSegregationIncorrect {

    public static void main(String[] args) {

        Duck duck = new Duck();
        System.out.println("\nThe duck can fly, swim and cuack.");
        duck.fly();
        duck.swim();
        duck.cuack();

        RubberDuck rubberDuck  = new RubberDuck();
        System.out.println("\nThe rubber duck can swim and cuack but cant fly.");
        rubberDuck.fly();
        rubberDuck.swim();
        rubberDuck.cuack();


    }
}
