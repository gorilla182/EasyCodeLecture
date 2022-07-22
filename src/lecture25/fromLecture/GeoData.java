 package lecture25.fromLecture;

public class GeoData {
    private final int id;
    private final double longLatitude;
    private final double latitude;

    public GeoData(int id, double longLatitude, double latitude) {
        this.id = id;
        this.longLatitude = longLatitude;
        this.latitude = latitude;

    }
    @Override
    public String toString(){
        return "GeoData { id=" + id +", longLatitude='" + longLatitude + ",latitude = '"+latitude+"'}";
    }
}
