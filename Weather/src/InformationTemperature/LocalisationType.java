package InformationTemperature;
public class LocalisationType {
    private double latitude;
    private double longitude;

    public LocalisationType(double latitude, double longitude) {
        setLatitude(latitude);
        setLongitude(longitude);
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        if(latitude >-90.0 || latitude <90.0)
            // Une coordonnée de latitude est comprise entre -90° et 90°
            this.latitude = latitude;
        else
            throw new IllegalArgumentException("Latitude incorrect");
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        if(longitude >-180.0 || longitude <180.0)
            // Une coordonnée de longitude est comprise entre -180° et 180°
            this.longitude = longitude;
        else
            throw new IllegalArgumentException("Longitude incorrect");

    }
}
