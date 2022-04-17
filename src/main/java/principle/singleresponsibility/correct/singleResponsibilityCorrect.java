package principle.singleresponsibility.correct;

public class singleResponsibilityCorrect {

    public static void main(String[] args){

        String email= "edgar5271@hotmail.com";
        String password= "hola_mundo";
        UserRegistry userRegistry = new UserRegistry();
        userRegistry.registry(email, password);
    }
}
