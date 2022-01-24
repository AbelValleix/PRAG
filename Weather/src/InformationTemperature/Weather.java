package InformationTemperature;

public class Weather {
    private TemperatureType temperature;
    private AirQualityType airQuality;
    private HumidityType humidity;
    private LocalisationType localisation;
    private WindSpeedType wind;

    public Weather(TemperatureType temperature, AirQualityType airQuality, HumidityType humidity, LocalisationType localisation, WindSpeedType wind) {
        this.temperature = temperature;
        this.airQuality = airQuality;
        this.humidity = humidity;
        this.localisation = localisation;
        this.wind = wind;
    }

    public Weather(TemperatureType temperature, HumidityType humidity, LocalisationType localisation) {
        // Constructeur "essentiel", pas de vitesse de vent ou de qualité de l'air dans l'application
        this.temperature = temperature;
        this.humidity = humidity;
        this.localisation = localisation;
    }

    public TemperatureType getTemperature() {
        return temperature;
    }

    public void setTemperature(TemperatureType temperature) {
        this.temperature = temperature;
    }

    public AirQualityType getAirQuality() {
        return airQuality;
    }

    public void setAirQuality(AirQualityType airQuality) {
        this.airQuality = airQuality;
    }

    public HumidityType getHumidity() {
        return humidity;
    }

    public void setHumidity(HumidityType humidity) {
        this.humidity = humidity;
    }

    public LocalisationType getLocalisation() {
        return localisation;
    }

    public void setLocalisation(LocalisationType localisation) {
        this.localisation = localisation;
    }

    public WindSpeedType getWind() {
        return wind;
    }

    public void setWind(WindSpeedType wind) {
        this.wind = wind;
    }
}
