package creational.singleton.vote63;

public class mainVote {
    public static void main(String[] args) {
       Users u1 = new Users("Đan");
       Users u2 = new Users("Phúc");
       Users u3 = new Users("Thành");

       u1.vote(Candiate.JOE_BIDEN);
       u2.vote(Candiate.DONAL_TRUMP);
       u3.vote(Candiate.JOE_BIDEN);

       myElection.getInstance().inKQ();
    }
}
