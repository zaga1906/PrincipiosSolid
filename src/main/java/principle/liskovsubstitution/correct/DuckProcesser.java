package principle.liskovsubstitution.correct;

import principle.liskovsubstitution.incorrect.Duck;

public class DuckProcesser {

    public static void makeDuckFly(IFly duck){
        duck.fly();

    }
}
