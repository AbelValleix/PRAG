package InformationTemperature;
public enum UOMWindSpeed {
    km("km/h"),
    mph("m/h");
    //L'unité de vitesse de vent est définie en km/h ou miles/h
    UOMWindSpeed(String valeur){
        this.valeur = valeur;
    }

    String valeur;

}
