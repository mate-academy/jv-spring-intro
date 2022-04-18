package mate.academy.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object user) {
        if (user == null) {
            return false;
        }
        if (user == this) {
            return true;
        }
        if (user.getClass().equals(User.class)) {
            User current = (User) user;
            return this.getAge() == current.getAge() && this.getName().equals(current.getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 17 * result + 31 * age;
        result = 31 * result + 53 * (name == null ? 0 : name.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "User{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", age=" + age
                + '}';
    }
}
