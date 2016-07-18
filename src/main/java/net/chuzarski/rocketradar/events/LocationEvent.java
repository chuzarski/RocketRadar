package net.chuzarski.rocketradar.events;


public class LocationEvent {

    public double latitude;
    public double longitude;
    public long time;

    public LocationEvent(double lat, double lon) {
        latitude = lat;
        longitude = lon;
        time = System.currentTimeMillis();
    }


}
