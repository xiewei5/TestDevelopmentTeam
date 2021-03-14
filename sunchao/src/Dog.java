public class Dog {
    String name;
    int age;
    float weight;
    public static void main(String[] args) {
        Dog duoduo = new Dog();
        duoduo.name= "多多";
        duoduo.age=6;
        duoduo.weight=13.5f;
        Dog lucky = new Dog();
        lucky.name="Lucky";
        lucky.age=3;
        lucky.weight=10.2f;
        System.out.println(duoduo.name+"今天"+duoduo.age+"岁");
        System.out.println(lucky.name+"体重"+lucky.weight+"千克");

    }
}
