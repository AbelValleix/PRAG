package InformationTemperature;
public enum UOMWindSpeed {
    km("km/h"),
    mph("m/h");

    UOMWindSpeed(String valeur){
        this.valeur = valeur;
    }

    String valeur;

}
