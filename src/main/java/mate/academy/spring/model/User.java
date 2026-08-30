package mate.academy.spring.model;

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
    private Integer age;
    private String name;

    public User() {
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{"
                + "id=" + id
                + ", age=" + age
                + ", name='" + name + '\''
                + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        if (age == null && user.age == null
                && name == null && user.name == null) {
            return true;
        }
        if (age == null && user.age == null) {
            return name.equals(user.name);
        }
        if (name == null && user.name == null) {
            return age.equals(age);
        }
        return age.equals(user.age) && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += 31 * result + (age != null ? age : 0);
        result += 31 * result + (name != null ? name.length() : 0);
        return result;
    }
}
