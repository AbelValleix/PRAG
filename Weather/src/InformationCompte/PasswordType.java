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
            //Le mot de passe doit faire moins de 16 caractères
            this.password = password;
        } else {
            throw new IllegalArgumentException("Password incorrect");
        }
    }
}
