package InformationTemperature;
public class TemperatureType {
    private double temperature;
    private UOMTemperature unite;

    public TemperatureType(double temperature) {
        setTemperature(temperature);
    }

    public void setTemperature(double temperature) {
        if(temperature >-470 || temperature <338 )
            this.temperature = temperature;
        else
            throw new IllegalArgumentException("Temperature incorrect");
    }

    public UOMTemperature getUnite() {
        return unite;
    }

    public void setUnite(UOMTemperature unite) {
        this.unite = unite;
    }
}
