package thirdweek.game;

import java.util.HashSet;
import java.util.Set;

public class gameuser {
    protected int userid;
    protected String username;
    protected Set<pokerinfo> pokers;
    protected gameuser(int userid,String username){
        this.userid =userid;
        this.username =username;
        this.pokers = new HashSet<pokerinfo>();
    }

}
