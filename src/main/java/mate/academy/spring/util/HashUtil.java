package mate.academy.spring.util;

public interface HashUtil {
    char[] hashPassword(char[] password, byte[] salt);

    byte[] getSalt();
}
