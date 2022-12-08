package lesson_10;

import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class User {
    private String firstName;
    private String lastName;
    public int hash;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //this.hash = Random.nextInt();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return firstName.equals(user.firstName) && lastName.equals(user.lastName) && Objects.equals(hash, user.hash);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
