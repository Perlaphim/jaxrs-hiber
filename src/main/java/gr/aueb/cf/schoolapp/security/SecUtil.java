package gr.aueb.cf.schoolapp.security;

import org.mindrot.jbcrypt.BCrypt;

public class SecUtil {

    public SecUtil() {}

    public static String hashPassword(String password) {
        int workload = 12;
        String salt = BCrypt.gensalt(workload);
        return BCrypt.hashpw(password, salt);
    }

    public static boolean checkPassword(String inputPassword, String storedHashedPassword) {
        return BCrypt.checkpw(inputPassword, storedHashedPassword);
    }
}
