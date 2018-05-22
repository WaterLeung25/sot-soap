package soap.rank;

/**
 * Created by water on 9/12/2017.
 */
public class UserArchive {
    private String username;
    private int score;

    public String getUsername() {
        return username;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public UserArchive(String username, int score){
        this.username = username;
        this.score = score;
    }

}
