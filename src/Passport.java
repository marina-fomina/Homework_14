import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private final int passportNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate birthDate;

    private static final String DEFAULT_VALUE = "default";

    public Passport(int passportNumber, String firstName, String middleName, String lastName, LocalDate birthDate) {
        this.passportNumber = passportNumber;
        setFirstName(firstName);
        this.middleName = middleName;
        setLastName(lastName);
        this.birthDate = birthDate;
    }

    public String toString() {
        return getLastName() + " " + getFirstName() + " " + getMiddleName() + ". Дата рождения - " + getBirthDate()
                + ". Номер паспорта - " + getPassportNumber() + ".";
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = ValidationUtils.validOrDefault(firstName, DEFAULT_VALUE);
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = ValidationUtils.validOrDefault(lastName, DEFAULT_VALUE);
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportNumber == passport.passportNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }
}
