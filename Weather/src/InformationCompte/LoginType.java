package InformationCompte;
import java.util.regex.Pattern;

public class LoginType {
    private String login;

    public LoginType(String login) {
        setLogin(login);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        boolean b = Pattern.matches("[a-zA-Z0-9]", login);
        if (b = true && login.length() < 16) {
            this.login = login;
        } else {
            throw new IllegalArgumentException("Login incorrect");
        }
    }
}
