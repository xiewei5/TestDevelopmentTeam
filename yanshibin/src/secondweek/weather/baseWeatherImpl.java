package secondweek.weather;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

public class baseWeatherImpl implements baseWeather {
    @Override
    public String query24h(String appcode, String area) {
        String host = "https://ali-weather.showapi.com";
        String path = "/hour24";
        String method = "GET";
//        String appcode = "你自己的AppCode";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("area", area);
//        querys.put("areaid", areaid);

        String result = null;
        try {
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            System.out.println(response.toString());
            //获取response的body
            result = EntityUtils.toString(response.getEntity());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public String query7d(String appcode, String area, String querydate) {
        String host = "http://ali-weather.showapi.com";
        String path = "/area-to-weather-date";
        String method = "GET";
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("area", area);
//        querys.put("areaCode", "530700");
//        querys.put("areaid", "101291401");
        querys.put("date", querydate);
        querys.put("need3HourForcast", "1");

        String result = null;
        try {
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            System.out.println(response.toString());
            //获取response的body
            result = EntityUtils.toString(response.getEntity());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public String query15d(String appcode, String area) {
        return null;
    }
}
