package InformationTemperature;
public class WindSpeedType {
    private double windSpeed;
    private UOMWindSpeed unite;

    public WindSpeedType(double windSpeed, UOMWindSpeed unite) {
        setWindSpeed(windSpeed);
        setUnite(unite);
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        if(windSpeed >0 || windSpeed <450 )
            this.windSpeed = windSpeed;
        else
            throw new IllegalArgumentException("Vitesse incorrect");

    }

    public UOMWindSpeed getUnite() {
        return unite;
    }

    public void setUnite(UOMWindSpeed unite) {
        this.unite = unite;
    }
}
