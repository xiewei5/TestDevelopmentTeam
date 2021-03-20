package thirdweek;

public class section3_2 {
    public static void main(String[] args) {
    double a = 91.5;
    // 手动装箱
    Double b = new Double(a);
    // 自动装箱
    Double c = a;
    System.out.println("装箱后的结果为：" + b + "和" + c);

    // 定义一个Double包装类对象
    Double d = new Double(87.0);
    // 手动拆箱
    double e = d.doubleValue();
    // 自动拆箱
    double f = d;

    System.out.println("拆箱后的结果为：" + e + "和" + f);
}
}
