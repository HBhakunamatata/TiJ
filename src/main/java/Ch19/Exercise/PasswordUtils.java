package Ch19.Exercise;


import java.util.List;

public class PasswordUtils {

    @UseCase(id = 47, description =
    "Passwords must contain at least one numeric")
    public boolean validatePassword (String password) {
        return password.matches("\\w*\\d\\w*");
    }

    @UseCase(id = 48)
    public String encryptPassword (String password) {
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49, description =
    "New passwords can’t equal previously used ones")
    public boolean checkForNewPassword (List<String> prePasswords, String newPassword) {
        return !prePasswords.contains(newPassword);
    }
}
