package InformationCompte;
public class PasswordType {
    private String password;

    public PasswordType(String password) {
        setPassword(password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if (password.length() < 16) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Password incorrect");
        }
    }
}