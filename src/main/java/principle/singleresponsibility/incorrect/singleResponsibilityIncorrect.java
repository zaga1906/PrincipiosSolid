package principle.singleresponsibility.incorrect;

import java.security.NoSuchAlgorithmException;

public class singleResponsibilityIncorrect {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        String email= "edgar5271@hotmail.com";
        String password= "hola_mundo";
        UserRegistry userRegistry = new UserRegistry();
        userRegistry.registry(email, password);

    }
}
