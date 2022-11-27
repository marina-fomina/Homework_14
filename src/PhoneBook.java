import java.util.HashMap;
import java.util.Objects;

public class PhoneBook {
    private final String name;
    private final String phoneNumber;

    private final String DEFAULT_VALUE = "default";

    public PhoneBook(String name, String phoneNumber) {
        this.name = ValidationUtils.validOrDefault(name, DEFAULT_VALUE);
        this.phoneNumber = ValidationUtils.validOrDefault(phoneNumber, DEFAULT_VALUE);
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return Objects.equals(name, phoneBook.name) && Objects.equals(phoneNumber, phoneBook.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }
}
