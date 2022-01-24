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
            //Le nom d'utilisateur ne peut être construit qu'avec des lettres ou des numéros, et doit faire moins de 16 caractères. 
            this.login = login;
        } else {
            throw new IllegalArgumentException("Login incorrect");
        }
    }
}
