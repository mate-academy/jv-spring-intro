package mate.academy.spring.model;

import java.util.Arrays;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, length = 50)
    private String login;
    private char[] password;
    private byte[] salt;

    public User() {
    }

    public User(String login, char[] password) {
        this.login = login;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public byte[] getSalt() {
        return salt;
    }

    public void setSalt(byte[] salt) {
        this.salt = salt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(login, user.login)
                && Arrays.equals(password, user.password) && Arrays.equals(salt,
                user.salt);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, login);
        result = 31 * result + Arrays.hashCode(password);
        result = 31 * result + Arrays.hashCode(salt);
        return result;
    }

    @Override
    public String toString() {
        return "User{"
                + "id = " + id
                + ", login = '" + login + '\''
                + '}';
    }
}
