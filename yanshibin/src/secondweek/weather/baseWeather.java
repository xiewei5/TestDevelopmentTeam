package secondweek.weather;

public interface baseWeather {
    public String query24h(String appcode,String area);
    public String query7d(String area, String areaid, String querydate);
    public String query15d(String area,String areaid);
}
