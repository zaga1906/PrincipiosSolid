package principle.singleresponsibility.correct;

import principle.singleresponsibility.incorrect.User;
import principle.singleresponsibility.incorrect.UserRepository;

public class UserRegistry {

    public void registry(String email, String password){
        password = Hash.cifrar(password);
        User user = new User(email, password);
        UserRepository.save(user);
    }
}
