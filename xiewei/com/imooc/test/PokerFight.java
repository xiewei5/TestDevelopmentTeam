package com.imooc.test;

import java.util.*;
import java.util.function.ToLongFunction;

public class PokerFight {
    String[] points={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] types={"黑桃","红心","梅花","方片"};
    List<Poker> cardList;
    List<Player> playerList;

    public PokerFight(){
        this.cardList= new ArrayList<Poker>();
        this.playerList = new ArrayList<Player>();

    }

    void createPokers(){
        System.out.println("-----------创建扑克牌---------------");

        List<Poker> list =new ArrayList<Poker>();
        for(String pts :points){
            for(String tp:types){
                cardList.add(new Poker(pts,tp));
            }
        }
        System.out.println("---------扑克牌创建成功--------------");
        for(Poker p:cardList){
            System.out.print(p.toString()+" ");
        }
        System.out.println("\n");
    }

    void flushPokers(){
        System.out.println("-----------开始洗牌---------------");
        Collections.shuffle(cardList);
        for(Poker p:cardList){
            System.out.print(p.toString()+" ");
        }
        System.out.println("\n-----------洗牌结束---------------");
    }

    void pickPokers(){
        System.out.println("-----------开始发牌---------------");
        for(int i=0;i<cardList.size();){
            if(i+playerList.size()>cardList.size()){
                break;
            }
            for(Player p:playerList){
                //System.out.println(cardList.get(i));
                p.cardList.add(cardList.get(i));
                //System.out.println(i);
                System.out.println("玩家："+p.getUserName()+" 拿到："+cardList.get(i));
                i++;
            }
        }
        System.out.println("-----------发牌结束---------------");
    }

    public String inputName() {
        System.out.println("输入姓名:");
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
    public String inputID() {
        System.out.println("输入ID:");
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    void createPlayers(Integer pNum){
        if(pNum>0&&pNum<52){
            for(int i=0;i<pNum;i++){
                playerList.add(new Player(inputID(),inputName()));
            }
            String pn="";
            for (Player player : playerList) {
                pn=pn+" "+player.getUserName();
            }
            System.out.println("----欢迎玩家 :"+pn);
        }
    }

    void game(){
        System.out.println("-----------游戏开始---------------");
        Poker luckyCard = new Poker("0","方片");
        Player winner=new Player();
        for(Player p:playerList){
            List<Poker> list=p.cardList;
            Collections.sort(p.cardList);
            System.out.println("玩家："+p.getUserName()+" 拿到的牌（排序后的）：");
            System.out.println(p.cardList);
            Poker pr=list.get(list.size()-1);
            if(luckyCard.compareTo(pr)<0){
                luckyCard=pr;
                winner=p;
            }
        }
        System.out.println("-----------玩家:"+winner.getUserName()+"获胜----------");
    }

    public static void main(String[] args) {
        PokerFight pf=new PokerFight();
        pf.createPokers();
        pf.flushPokers();
        pf.createPlayers(4);
        pf.pickPokers();
        pf.game();
    }
}
