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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + (name != null ? name.hashCode() : 0);
        hash = 31 * hash + age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!obj.getClass().equals(User.class)) {
            return false;
        }
        User user = (User) obj;
        if (!this.name.equals(user.getName())) {
            return false;
        } else if (this.age != user.getAge()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User={id=" + id
                + ", name='" + name
                + "', age=" + age
                + "}";
    }
}
