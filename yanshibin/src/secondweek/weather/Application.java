package secondweek.weather;

import com.imooc.weather.HourWeather;
import com.imooc.weather.WeatherUtils;
import com.imooc.weather.impl.WeatherUtilsImpl;

import java.util.List;
import java.util.Scanner;

import java.net.HttpURLConnection;
import java.net.URL;

public class Application {
    public static void main(String[] args) {
        System.out.print("天气预报查询：\n输入1：查询未来24小时天气预报\n" +
                "输入2：查询未来3天天气预报\n输入3：查询未来7天天气预报\n");
        System.out.print("请输入你的选择：");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println("用户输入："+i);
        if (i==1){
            System.out.print("请输入城市名称查询未来24小时天气预报:");
            String city = scanner.next();
            System.out.println(city+"未来24小时天气预报：");
            WeatherUtils weatherUtils = new WeatherUtilsImpl();
            List<HourWeather> weatherlist = weatherUtils.w24h("89b3d33757314ff5a82dd5d72fb4673a", city);
            System.out.println(weatherlist);
        }
    }
}
