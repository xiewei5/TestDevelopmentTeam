package secondweek.weather;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.print("天气预报查询：\n输入1：查询未来24小时天气预报\n" +
                "输入2-7：查询未来n天天气预报(2≤n≤7)\n");
        System.out.print("请输入你的选择：");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i==1){
            System.out.print("请输入城市名称查询未来24小时天气预报:");
            String city = scanner.next();
            System.out.println(city+"未来24小时天气预报：");
            baseWeather weather = new baseWeatherImpl();
            String result = weather.query24h("89b3d33757314ff5a82dd5d72fb4673a",city);
            System.out.println(result);
        }else if(i>=2 && i<=7){
            System.out.print("请输入城市名称查询未来"+i+"天天气预报:");
            String city = scanner.next();
            System.out.println(city+"未来"+i+"天天气预报：");
            baseWeather weather = new baseWeatherImpl();

            int cd = 0;
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
            String currentDate = df.format(new Date());// new Date()为获取当前系统时
            try {
                cd = Integer.parseInt(currentDate);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            for (int j=1;j<=i;j++){
                Calendar calendar2 = Calendar.getInstance();
                SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
                calendar2.add(Calendar.DATE, j);
                String j_days_after = sdf2.format(calendar2.getTime());
                System.out.println(j_days_after);

                String result = weather.query7d("89b3d33757314ff5a82dd5d72fb4673a",city,j_days_after);
                System.out.println(result);
            }
        }else {
            System.out.print("暂不支持你输入的查询条件！");
        }
    }
}
