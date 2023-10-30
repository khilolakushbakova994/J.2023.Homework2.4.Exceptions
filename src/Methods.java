
public class Methods {

    public final static String LATIN = "[a-zA-Z0-9-_]{4,20}";

    public static boolean credential(String login, String password, String confirmPassword) {
        if (!login.matches(LATIN)) {
            throw new WrongLoginException("Неверно введен логин, используйте латинские буквы и цифры");
        }
        if (!password.matches(LATIN)) {
            throw new WrongPasswordException(" Попробуйте другой пароль");
        }
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Пароль не совпадает , попробуйте еще раз");
        }
        return true;
    }
}
