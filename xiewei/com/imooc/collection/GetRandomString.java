package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GetRandomString {
    public GetRandomString(){}
    public static final String fullChar="1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public String getRndString(int len){
        StringBuffer retStr=new StringBuffer();
        Random rnd=new Random();
        int r=rnd.nextInt(len);
        while (true){
            if(r!=0){
                break;
            }else {
                r=rnd.nextInt(len);
            }

        }
        //System.out.println(r);
        for(int i=0;i<r;i++){
            retStr.append(fullChar.charAt(rnd.nextInt(fullChar.length())));
        }
        System.out.println(retStr.toString());
        return retStr.toString();
    }
    public static void main(String[] args) {
        GetRandomString gs=new GetRandomString();
        List<String> ls=new ArrayList<String>();
        for(int i=0;i<10;i++){
            ls.add(gs.getRndString(10));
        }
        for(String s:ls){
            System.out.println(s);
        }

    }
}
