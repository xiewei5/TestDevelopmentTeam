public class MethodSample01 {
    public  String  isOddNumber(int num){
        if(num%2==0){
            return num+"是偶数";
        }else{
            return num+"是奇数";
        }
    }
    public static void main(String[] args) {
        int a=10;
        if(a%2==0){
            System.out.println(a+"是偶数");
        }else{
            System.out.println(a+"是奇数");
        }
        int b=5;
       /* if(b%2==0){
            System.out.println(b+"是偶数");
        }else{
            System.out.println(b+"是奇数");
        }*/
        MethodSample01 methodSample01=new MethodSample01();
        String r1= methodSample01.isOddNumber(b);
        System.out.println(r1);
    }

}
