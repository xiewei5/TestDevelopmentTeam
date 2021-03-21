package com.imooc.test;

public class Poker implements Comparable<Poker>{
    private String points;
    private String type;

    public Poker(){
    }
    public Poker(String points,String type){
        this.points=points;
        this.type=type;
    }
    public String getPoints(){
        return  this.points;
    }
    public void setPoints(String points){
        this.points=points;
    }
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type=type;
    }
    public Integer getPointsValue(String points){
        switch (points){
            case "A":return 12;
            case "2":return 13;
            case "3":return 1;
            case "4":return 2;
            case "5":return 3;
            case "6":return 4;
            case "7":return 5;
            case "8":return 6;
            case "9":return 7;
            case "10":return 8;
            case "J":return 9;
            case "Q":return 10;
            case "K":return 11;
        }
        return -1;
    }
    public Integer getTypeValue(String type){
        switch (type){
            case "黑桃":return 4;
            case "红心":return 3;
            case "梅花":return 2;
            case "方片":return 1;
        }
        return -1;
    }

    @Override
    public int compareTo(Poker p){
        int num=getPointsValue(this.points).compareTo(getPointsValue(p.points));
        if(num==0){
            return getTypeValue(this.type).compareTo(getTypeValue(p.type));
        }
        return num;
    }

    @Override
    public String toString(){
        return type+points;
    }
}
