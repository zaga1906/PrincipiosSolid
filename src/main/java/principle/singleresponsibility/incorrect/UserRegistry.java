package principle.singleresponsibility.incorrect;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UserRegistry {

    public void registry(String email, String password) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5"); //-------------------------------
        byte[] array = messageDigest.digest(password.getBytes());//                                     |
        StringBuffer stringBuffer = new StringBuffer();//                                               |
        for (int i = 0; i < array.length; ++i) {//                                                      |------- Cifrar password
            stringBuffer.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));//    |
        }//                                                                                             |
        password = stringBuffer.toString();//------------------------------------------------------------
        User user = new User(email, password);//                                                        |------- Guardar usuario
        UserRepository.save(user);//---------------------------------------------------------------------
    }
}
