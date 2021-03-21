package com.imooc.test;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String userId;
    private String userName;
    List<Poker> cardList;

    public Player(){}
    public Player(String userId,String userName){
        this.userId=userId;
        this.userName=userName;
        this.cardList=new ArrayList<Poker>();
    }
    public String getUserId(){
        return this.userId;
    }
    public void setUserId(String userId){
        this.userId=userId;
    }
    public String getUserName(){
        return this.userName;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
}
