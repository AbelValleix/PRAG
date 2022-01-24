package InformationCompte;
public class Account {
    private PasswordType password;
    private LoginType login;

    public Account(PasswordType password, LoginType login) {
        //Constructeur de Compte, un Login & Password correct sont obligés
        this.password = password;
        this.login = login;
    }

    public PasswordType getPassword() {
        return password;
    }

    public void setPassword(PasswordType password) {
        this.password = password;
    }

    public LoginType getLogin() {
        return login;
    }

    public void setLogin(LoginType login) {
        this.login = login;
    }
}
