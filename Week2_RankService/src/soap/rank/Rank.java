package soap.rank;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by water on 9/12/2017.
 */
@WebService
public interface Rank {

    @WebMethod
    public String getNewUser(String user, String pw, int score);
    @WebMethod
    public int updateWinArchive(String user, int score);
    @WebMethod
    public int updateLoseArchive(String user, int score);
    @WebMethod
    public List<String> createRank();
//    @WebMethod
//    public List<UserArchive> getUsers();

}
