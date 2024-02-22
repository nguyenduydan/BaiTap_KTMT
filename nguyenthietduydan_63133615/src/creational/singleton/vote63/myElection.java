package creational.singleton.vote63;

import java.util.ArrayList;
import java.util.List;

//Singleton
public class myElection {
    private static myElection instance;
    private int biden =0, trump =0;

    List<String> users_voted = new ArrayList<>();
    protected myElection(){}

    public static myElection getInstance(){
        if(instance == null)
                instance = new myElection();
        return instance;
    }

    private boolean isVoted(String user){
        for(String x: users_voted){
            if (user == x.toString())
                return true;
        }
        return false;
    }
    public void vote(Candiate c, String user){
        if (!isVoted(user)){
            if(c == Candiate.DONAL_TRUMP){
                trump++;
            }else if(c == Candiate.JOE_BIDEN){
                biden++;
            }
            users_voted.add(user); //thêm user vào
        }
    }

    public void inKQ(){
        System.out.println("Donal Trump: "+trump);
        System.out.println("Joe Biden: "+biden);
    }
}
