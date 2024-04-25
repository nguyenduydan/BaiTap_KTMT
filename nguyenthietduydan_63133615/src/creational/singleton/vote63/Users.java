package creational.singleton.vote63;

public class Users {
    String name;

    public Users(String name) {
        this.name = name;
    }

    public void vote(Candiate c){

        myElection.getInstance().vote(c,name);
    }
}
