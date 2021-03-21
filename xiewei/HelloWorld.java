import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.lang.Math.random;

public class HelloWorld {
    public static void Test2_1(){
        //定义字符串
        String hobby ="爱慕课";
        String url ="www.imooc.com";

        //输出字符串
        System.out.println("hobby:" +   hobby        );
        System.out.println("url:" +     url       );
    }
    public static void Test2_2(){
        String s1 = "imooc";
        String s2 = "imooc";

        //定义字符串s3，保存“I love”和s1拼接后的内容
        String s3="I love"+s1;

        // 比较字符串s1和s2
        // imooc为常量字符串，多次出现时会被编译器优化，只创建一个对象
        System.out.println("s1和s2内存地址相同吗？" + (s1 == s2));

        //比较字符串s1和s3
        System.out.println("s1和s3内存地址相同吗？" +  (s1==s3)               );

        String s4 = "I love " + s1;
        //比较字符串s4和s3
        // s1是变量，s4在运行时才知道具体值，所以s3和s4是不同的对象
        System.out.println("s3和s4内存地址相同吗？" + (s4 == s3));
    }
    public static void Test2_3(){
        // Java文件名
        String fileName = "HelloWorld.java";
        // 邮箱
        String email = "laurenyang@imooc.com";

        // 判断.java文件名是否正确：合法的文件名应该以.java结尾
        /*
        参考步骤：
        1、获取文件名中最后一次出现"."号的位置
        2、根据"."号的位置，获取文件的后缀
        3、判断"."号位置及文件后缀名
        */
        //获取文件名中最后一次出现"."号的位置
        int index =fileName.lastIndexOf('.');

                // 获取文件的后缀
        String prefix =fileName.substring(index+1);
        //System.out.println(prefix.toLowerCase());

        // 判断必须包含"."号，且不能出现在首位，同时后缀名为"java"
        if (index>0 && fileName.endsWith("java")){
            System.out.println("Java文件名正确");
        } else {
            System.out.println("Java文件名无效");
        }

        // 判断邮箱格式是否正确：合法的邮箱名中至少要包含"@", 并且"@"是在"."之前
         /*
        参考步骤：
        1、获取文件名中"@"符号的位置
        2、获取邮箱中"."号的位置
        3、判断必须包含"@"符号，且"@"必须在"."之前
        */
        // 获取邮箱中"@"符号的位置
        int index2 =email.indexOf('@');

        // 获取邮箱中"."号的位置
        int index3 = email.indexOf('.');

        // 判断必须包含"@"符号，且"@"必须在"."之前
        if (index2 != -1 && index3 > index2) {
            System.out.println("邮箱格式正确");
        } else {
            System.out.println("邮箱格式无效");
        }
    }
    public static void Test2_4(){
        // 定义一个字符串
        String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";

        // 出现次数
        int num = 0;

        // 循环遍历每个字符，判断是否是字符 a ，如果是，累加次数
        for (int i=0;i<s.length()-1;i++)
        {
            // 获取每个字符，判断是否是字符a
            if ( s.charAt(i)==('a')) {
                // 累加统计次数
                num++;
            }
        }
        System.out.println("字符a出现的次数：" + num);
    }
    public static void Test2_5(){
        // 创建一个StringBuilder对象，用来存储字符串
        StringBuilder hobby=new StringBuilder("爱慕课");

        System.out.println(hobby);
    }
    public static void Test2_6(){
        // 创建一个空的StringBuilder对象
        StringBuilder str=new StringBuilder();

        // 追加字符串
        str.append("jaewkjldfxmopzdm");

        // 从后往前每隔三位插入逗号
        for(int i=str.length()-1;i>0;i--){
            i-=2;
            str.insert(i,',');
        }



        // 将StringBuilder对象转换为String对象并输出
        System.out.print(str.toString());
    }
    public static void Test3_1(){
        // 定义int类型变量，值为86
        int score1 = 86;

        // 创建Integer包装类对象，表示变量score1的值
        Integer score2=new Integer(score1);

        // 将Integer包装类转换为double类型
        double score3=score2.doubleValue();

        // 将Integer包装类转换为float类型
        float score4=score2.floatValue();

        // 将Integer包装类转换为int类型
        int score5 =score2.intValue();

        System.out.println("Integer包装类：" + score2);
        System.out.println("double类型：" + score3);
        System.out.println("float类型：" + score4);
        System.out.println("int类型：" + score5);
    }
    public static void Test3_2(){
        // 定义double类型变量
        double a = 91.5;

        // 手动装箱
        Double b = new Double(a);

        // 自动装箱
        Double c =a;

        System.out.println("装箱后的结果为：" + b + "和" + c);

        // 定义一个Double包装类对象，值为8
        Double d = new Double(87.0);

        // 手动拆箱
        double e =  d.doubleValue()             ;

        // 自动拆箱
        double f =   d             ;

        System.out.println("拆箱后的结果为：" + e + "和" + f);
    }
    public static void Test3_4(){
        double m = 78.5;
        //将基本类型转换为字符串
        /*基本类型转换为字符串有三种方法：
        1. 使用包装类的 toString() 方法
        2. 使用String类的 valueOf() 方法
        3. 用一个空字符串加上基本类型，得到的就是基本类型数据对应的字符串
        *
        * */
        String str1 = String.valueOf(m);

        System.out.println("m 转换为String型后与整数20的求和结果为： "+(str1+20));

        String str = "180.20";
        // 将字符串转换为基本类型
        /*将字符串转换成基本类型有两种方法：
        1. 调用包装类的 parseXxx 静态方法
        2. 调用包装类的 valueOf() 方法转换为基本类型的包装类，会自动拆箱*/
        Double a = Double.valueOf(str);                       ;

        System.out.println("str 转换为double型后与整数20的求和结果为： "+(a+20));
    }
    public static void Test3_6(){
        // 使用format()方法将日期转换为指定格式的文本
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 创建Date对象，表示当前时间
        Date now=new Date();

        // 调用format()方法，将日期转换为字符串并输出
        System.out.println(sdf1.format(now)                          );
        System.out.println(sdf2.format(now));
        System.out.println(sdf3.format(now));

        // 使用parse()方法将文本转换为日期
        String d = "2014-6-1 21:05:36";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 调用parse()方法，将字符串转换为日期
        Date date = null;
        try {
            date = sdf.parse(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }
    public static void Test3_7(){
        // 创建Calendar对象
        Calendar c =Calendar.getInstance();

        // 将Calendar对象转换为Date对象
        Date date =c.getTime();
        // 创建SimpleDateFormat对象，指定目标格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 将日期转换为指定格式的字符串
        String now = sdf.format(date);
        System.out.println("当前时间：" + now);
    }
    public static void Test3_8(){
        // 定义一个整型数组，长度为10
        int[] nums =new int[10];

        //通过循环给数组赋值
        for (int i = 0; i < nums.length; i++) {
            // 产生10以内的随机数
            int x =(int)(Math.random()*10);

            nums[i] = x;// 为元素赋值
        }

        // 使用foreach循环输出数组中的元素
        for (int num : nums                    ) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        //Test2_1();
        //Test2_2();
        //Test2_3();
        //Test2_4();
        //Test2_5();
        //Test2_6();
        //Test3_2();
        //Test3_4();
        //Test3_6();
        //Test3_7();
        //Test3_8();
    }
}