package principle.singleresponsibility.correct;

import principle.singleresponsibility.incorrect.User;

public class UserRepository {

    public static void save(User user){
        System.out.println("Se guardo el usuario con email: " + user.getEmail() + " y contraseña: " + user.getPassword());
    }
}
