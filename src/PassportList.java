import java.util.HashSet;
import java.util.Set;

public class PassportList {
    private final Set<Passport> passports = new HashSet<>();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Паспорта:").append('\n');
        for (Passport passport : this.passports) {
            stringBuilder.append(passport).append('\n');
        }
        return stringBuilder.toString();
    }

    public void addOrUpdatePassport(Passport passport) {
        this.passports.add(passport);
    }

    public Passport findByNumber(int number) {
        for (Passport passport : passports) {
            if (passport.getPassportNumber() == number) {
                return passport;
            }
        }
        return null;
    }
}
