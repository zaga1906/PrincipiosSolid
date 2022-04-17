package principle.singleresponsibility.incorrect;

public class UserRepository {

    public static void save(User user){
        System.out.println("Se guardo el usuario con email: " + user.getEmail() + " y contraseña: " + user.getPassword());
    }
}
