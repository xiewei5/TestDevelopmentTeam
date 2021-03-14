public class Dogs {

    String   name;
    int  age;
    float weight;

    public static void main(String[] args) {
        Dogs duoduo=new Dogs();
        duoduo.name="多多";
        duoduo.age=6;
        duoduo.weight=13.5f;
        Dogs Lucys=new Dogs();
        Lucys.name="Lucys";
        Lucys.age=6;
        Lucys.weight=13.5f;
        System.out.println(duoduo.name+"今天"+duoduo.age+"岁");
        System.out.println(Lucys.name+"体重"+duoduo.age+"千克");



    }


}
