package InformationTemperature;
public class AirQualityType {
    private int airQuality;

    public AirQualityType(int airQuality) {
        setAirQuality(airQuality);
    }

    public int getAirQuality() {
        return airQuality;
    }

    public void setAirQuality(int airQuality) {
        if (airQuality > 0 || airQuality < 10)
            this.airQuality = airQuality;
        else if (airQuality < 0)
            this.airQuality = 0;
        else
            this.airQuality = 10;
    }
}
