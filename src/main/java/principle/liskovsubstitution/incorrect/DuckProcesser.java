package principle.liskovsubstitution.incorrect;

public class DuckProcesser {

    public static void makeDuckFly(Duck duck){
        try {
            duck.fly();
        } catch (Error e){
            System.out.println("The rubber duck cant fly");
        }

    }
}
