import java.util.Scanner;
public class One_Week {

    /**
     * yaojw
     * @param args
     */
    public static void main(String[] args) {
        //1-4
        System.out.println("hello imooc");
        //2-1
        System.out.println("hello imooc");
        //2-2
        System.out.println("hello imooc");
        //2-3 选择题：B
        //2-4
        String hobby="慕课网";
        System.out.println(hobby);
        //2-5
        String a="我爱慕课网";
        String b="www.imooc.com";
        System.out.println(a+""+b);
        //2-6
        String name="爱慕课";
        char   sex='男';
        int    num=18;
        double price=120.5;
        boolean isOK=true;
        System.out.println(name);
        System.out.println(sex);
        System.out.println(num);
        System.out.println(price);
        System.out.println(isOK);
        //2-7
        String city="湖南";
        System.out.println("我的家乡在："+city);

        //2-8  选择题：B
        //2-9
        double avg1=78.5;
        int rise1=5;
        double rise=rise1;
        double avg2=avg1+rise;
		System.out.println("考试平均分："+avg1);
		System.out.println("调整后的平均分："+avg2);
        //2-10
        double heightAvg1=176.2;
        int heightAvg2=(int)heightAvg1;
        System.out.println(heightAvg1);
        System.out.println(heightAvg2);
        //2-11
        final char A='男';
        final char B='女';
        System.out.println(A+""+B);
        //2-12
    //	System.out.println("Java");
        System.out.println("imooc");
	/*	System.out.println("Oracle");
		System.out.println("MySQL");*/
        //2-13  选择题 D
        //3-1
        int a2=12;
        int b2=24;
        int sum=a2+b2;
        System.out.println("两数之和为："+sum);
        //3-2
        int age1=24;
        int age2=18;
        int age3=36;
        int age4=27;
        int sum2=age1+age2+age3+age4;
        double avg=(age1+age2+age3+age4)/4;
        int minus=age1-age2;
        int newAge=--age1;
        System.out.println("年龄总和："+sum2);
        System.out.println("平均年龄："+avg);
        System.out.println("年龄差值："+minus);
        System.out.println("自减后的年龄："+newAge);
        //3-3
        int one = 10 ;
        int two = 20 ;
        int three = 0 ;
        three =one +two;
        System.out.println(three);
        three +=one;
        System.out.println(three);
        three -=one;
        System.out.println(three);
        three*=one;
        System.out.println(three);
        three/=one;
        System.out.println(three);
        three%=one;
        System.out.println(three);
        //3-4
        int a3=16;
        double b3=9.5;
        String str1="hello";
        String str2="imooc";
        System.out.println("a等于b：" + (a3 == b3));
        System.out.println("a大于b：" + (a3 > b3));
        System.out.println("a小于等于b：" + (a3 <= b3));
        System.out.println("str1等于str2：" + (str1 ==  str2));
        //3-5
        boolean a1 = true; // a同意
        boolean b1 = false; // b反对
        boolean c = false; // c反对
        boolean d = true; // d同意
        System.out.println((a1&&b1)+"未通过");
        System.out.println((a1||b1)+"通过");
        System.out.println((!a1)+"未通过");
        System.out.println((c^a1)+"通过");
        //3-6 选择题 C
        //3-7
        int score=68;
        String mark =(score>=60)?"及格":"不及格";
        System.out.println("考试成绩如何："+mark);
        //3-8
        int m = 5;
        int n = 7;
        int x=(m*8/(n+2))%m;
        System.out.println("m:" + m);
        System.out.println("n:" + n);
        System.out.println("x:" + x);
        //3-9  选择题 C
        //3-10 选择题 C
        //4-1
        int one1 = 20 ;
        if(one1%2==0){
            System.out.println("one是偶数");
        }
        //4-2
        int age=25;
        if(age>=18){
            System.out.println("成年了");
        }else{
            System.out.println("未成年");
        }
        //4-3
        int ageE=25;
        if(ageE>60){
            System.out.println("老年");
        }else if(ageE>18){
            System.out.println("少年");
        }else if(ageE>40){
            System.out.println("少年");
        }else{
            System.out.println("童年");
        }
        //4-4
        int scoreE = 94;
        String sexE = "女";
        if(score>80){
            if(sexE.equals("男")){
                System.out.println("进入男子组决赛");
            }else{
                System.out.println("进入女子组决赛");
            }
        }else{
            System.out.println("淘汰");
        }
        //4-5 选择题 C
        //4-6
        char today='日';
        switch(today){
            case '一':
                System.out.println("奖励笔记本一台");
            case '二':
                System.out.println("奖励IPAD 2一个");
            case '四':
                System.out.println("奖励移动电源一个");
            case '六':
                System.out.println("吃油条");
                break;
            default:
                System.out.println("吃主席套餐");
        }

        //4-7
        int i = 1; // 代表 1 - 5 之间的数字
        // 当变量小于等于 5 时执行循环
        while (    i<=5   ) {
            // 输出变量的值，并且对变量加 1，以便于进行下次循环条件判断
            System.out.println(i);
            i++;
        }

        //4-8
        int sums = 0; // 保存 1-50 之间偶数的和
        int nums = 2; // 代表 1-50 之间的偶数
        do {
            //实现累加求和
            sums=sums+nums;
            nums=nums+2;
        // 每执行一次将数值加2，以进行下次循环条件判断
        } while ( nums<=50   ); // 满足数值在 1-50 之间时重复执行循环
        System.out.println(" 50以内的偶数之和为：" + sums );

        //4-9
        int summ = 0; // 保存不能被3整除的数之和
    // 循环变量 i 初始值为 1 ,每执行一次对变量加 1，只要小于等于 100 就重复执行循环
		for(int ii = 1; ii<=100; ii++) {
        // 变量 i 与 3 进行求模（取余），如果不等于 0 ，则表示不能被 3 整除
        if (ii % 3 != 0) {
            summ = summ + ii; // 累加求和
        }
    }
		System.out.println("1到100之间不能被3整除的数之和为：" + summ);

        //4-10 选择题 B
        //4-11
        // 保存累加值
        int sumA = 0;
        // 从1循环到10
        for (int s = 1; s <= 10; s++) {
            // 每次循环时累加求和
            sumA = sumA + s;

            // 判断累加值是否大于20，如果满足条件则退出循环
            if (sumA>20) {

                System.out.print("当前的累加值为:" + sumA);
                break;
                //退出循环
            }
        }
        //4-12
        int sumz = 0; // 保存累加值
        for (int iz = 1; iz <= 10; iz++) {
            // 如果i为奇数,结束本次循环，进行下一次循环
            if (    iz%2==1         ) {
                continue;
            }
            sumz = sumz + iz;
        }
        System.out.print("1到10之间的所有偶数的和为：" + sumz);
        //4-13 选择题 B
        //4-14
        System.out.println();
        System.out.println("打印直角三角形:");
        // 外层循环控制行数
        for (int im = 1;  im<=3;im++  ) {
            // 内层循环控制每行的*号数
            // 内层循环变量的最大值和外层循环变量的值相等
            for (int jm = 1; jm <= im; jm++) {
                System.out.print("*");
            }
            // 每打印完一行后进行换行
            System.out.println();
        }
        //4-15
            int numa = 999;
            int count = 0;

            if(numa>=0 && numa<=999){
                while(numa!=0){
                    count++;
                    numa/=10;
                }
                System.out.println("它是个"+count+"位的数！");
            }else{
                System.out.println("输入有误!");
            }
            //5-1
            // 变量保存成绩
            int scores = 53;
            // 变量保存加分次数
            int counts = 0;
            //打印输出加分前成绩
            System.out.println("加分前成绩："+scores);
            // 只要成绩小于60，就循环执行加分操作，并统计加分次数
            do{
                scores++;
                counts++;
            }while(scores<60);
            //打印输出加分后成绩，以及加分次数
            System.out.println("加分后成绩："+scores);
            System.out.println("共加了："+counts);
            //6-1
            // 定义一个数组，保存五名学生的成绩
            int[] scoress = { 78, 93, 97, 84, 63 };
            // 输出数组中的第二个成绩
            System.out.println("数组中的第2个成绩为：" +  scoress[1]          );
            //6-2 选择题 D
            //6-3
            // 定义一个长度为5的字符串数组，保存考试科目信息
            String[] subjects =  new String[5];                  ;
            // 分别为数组中的元素赋值
            subjects[0] = "Oracle";
            subjects[1] = "PHP";
            subjects[2] = "Linux";
            subjects[3] = "Java";
            subjects[4] = "HTML";
            System.out.println("数组中第4个科目为："+subjects[3]);
            //6-4 选择题 B
            //6-5
            // 定义一个长度为 3 的字符串数组，并赋值初始值
            String[] hobbys = { "sports", "game", "movie" };
            System.out.println("循环输出数组中元素的值：");
            // 使用循环遍历数组中的元素
            for(int v=0;v< hobbys.length ;v++){
                System.out.println(hobbys[v]);
            }
            //6-6
            // 定义一个整型数组，并赋初值
            int[] numss = new int[] { 61, 23, 4, 74, 13, 148, 20 };
            int max = numss[0]; // 假定最大值为数组中的第一个元素
            int min = numss[0]; // 假定最小值为数组中的第一个元素
            double suml = 0;// 累加值
            double avgl = 0;// 平均值
            for (int l = 0; l < numss.length; l++) { // 循环遍历数组中的元素
                // 如果当前值大于max，则替换max的值
                if(numss[l]>max){
                    max=numss[l];
                }
                // 如果当前值小于min，则替换min的值
                if(numss[l]<min){
                    min=numss[l];
                }
                // 累加求和
                sum=sum+numss[l];
            }
            // 求平均值
            avg=suml/numss.length;
            System.out.println("数组中的最大值：" + max);
            System.out.println("数组中的最小值：" + min);
            System.out.println("数组中的平均值：" + avgl);


        //7-1
            //创建String数组，并为每一个元素赋值。赋值内容为第几周+学习内容
            String[] contentList = new String[35];
            contentList[0] = "【第1周】环境搭建与语法入门";
            contentList[1] = "【第2周】Java语法之循环、数组与方法";
            contentList[2] = "【第3周】面向对象之封装与继承";
            contentList[3] = "【第4周】面向对象之单例模式与多态";
            contentList[4] = "【第5周】常用工具类（上）";
            contentList[5] = "【第6周】常用工具类（下）";
            contentList[6] = "【第7周】常用工具类（下）";
            contentList[7] = "【第8周】前端基础之HTML与CSS";
            contentList[8] = "【第9周】前端基础之JavaScript与综合案例";
            contentList[9] = "【第10周】Java Web基础";
            contentList[10] = "【第11周】Java Web基础";
            contentList[11] = "【第12周】常用功能与过滤器";
            contentList[12] = "【第13周】监听器与项目实战";
            contentList[13] = "【第14周】监听器与项目实战";
            contentList[14] = "【第15周】MySQL基础";
            contentList[15] = "【第16周】MySQL基础";
            contentList[16] = "【第17周】Java数据库开发基础";
            contentList[17] = "【第18周】框架前置知识";
            contentList[18] = "【第19周】MyBatis基础";
            contentList[19] = "【第20周】MyBatis实现OA系统项目实战";
            contentList[20] = "【第21周】MyBatis实现OA系统项目实战";
            contentList[21] = "【第22周】Linux环境搭建与Redis应用";
            contentList[22] = "【第23周】Spring基础";
            contentList[23] = "【第24周】Spring基础";
            contentList[24] = "【第25周】Spring基础";
            contentList[25] = "【第26周】SSM开发社交网站";
            contentList[26] = "【第27周】Spring Boot电商项目实战";
            contentList[27] = "【第28周】Spring Boot电商项目实战";
            contentList[28] = "【第29周】面试";
            contentList[29] = "【第30周】多线程与分布式";
            contentList[30] = "【第31周】多线程与分布式";
            contentList[31] = "【第32周】Spring Cloud基础";
            contentList[32] = "【第33周】Spring Cloud电商实战";
            contentList[33] = "【第34周】Spring Cloud电商实战";
            contentList[34] = "【第35周】Zookeeper+Dubbo应用与面试";

            //提示信息
            System.out.print("您要开始第几周学习啦,直接输入数字吧:");
            //设置变量存储接收到的数据
            int  week = new Scanner(System.in).nextInt();
            //计算今天是几月(1-月第一周、4-月第4周)
            //计算今天是几月(1-月第一周、4-月第4周)
            int month = 0;
            if (week % 4 == 0) {
                month = week / 4;
                System.out.println("第" + month + "个月");
            } else {
                month = week / 4 + 1;
                System.out.println("第" + month + "个月");
            }
            //计算输入的周是这个月的第几周
            int thisWeek = week % 4;
            if (thisWeek == 0) {
                System.out.println("第4周");
            } else {
                System.out.println("第" + thisWeek + "周");
            }
            //提示信息
            System.out.println("以下是您本月的学习计划, √ 代表当周学习任务");
            System.out.println("=======================================");
            //利用for循环，找到数组中对应这个月的内容输出
            for (int z = (month - 1) * 4; z < month * 4; z++) {
                if (z == week - 1) {
                    //根据当前月第几周，在输出此行时，前面添加“√”
                    System.out.println("√" + contentList[z]);
                } else {
                    System.out.println(" \t" + contentList[z]);
                }
            }
        }
    }
