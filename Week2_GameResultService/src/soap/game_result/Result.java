package soap.game_result;


import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by water on 9/12/2017.
 */
@WebService
public interface Result {
    @WebMethod
    public int lose(int score);
    @WebMethod
    public int win(int score);
}
