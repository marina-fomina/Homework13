import java.util.Objects;

public class LoginAndPasswordValidation {
    private static final String INVALID_LENGTH = "Длина должна быть от 1 до 20 символов.";
    private static final String INVALID_SYMBOL = "Строка должна содержать в себе только латинские буквы, цифры и знак подчеркивания.";
    private static final String PASSWORDS_DONT_MATCH = "Пароль и подтверждение пароля не совпадают.";

    public static boolean validateLoginAndPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (isLengthNotInRange(login, 1, 20)) {
            throw new WrongLoginException(INVALID_LENGTH);
        }
        if (isSymbolsNotValid(login)) {
            throw new WrongLoginException(INVALID_SYMBOL);
        }
        if (isLengthNotInRange(password, 1, 20)) {
            throw new WrongPasswordException(INVALID_LENGTH);
        }
        if (isSymbolsNotValid(password)) {
            throw new WrongPasswordException(INVALID_SYMBOL);
        }
        if (!Objects.equals(password, confirmPassword)) {
            throw new WrongPasswordException(PASSWORDS_DONT_MATCH);
        }
        return true;
    }

    private static boolean isLengthNotInRange(String value, int min, int max) {
        if (value == null) {
            return true;
        }
        int length = value.length();
        return length < min || length > max;
    }

    private static boolean isSymbolsNotValid(String value) {
        if (value == null || value.isBlank()) {
            return true;
        }
        for (char c : value.toCharArray()) {
            boolean symbolIsAcceptable = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (Character.isDigit(c)) || (c == '_');
            if (!symbolIsAcceptable) {
                return true;
            }
        }
        return false;
    }
}
