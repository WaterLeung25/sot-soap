package soap.game_result;

import javax.jws.WebService;

/**
 * Created by water on 9/12/2017.
 */
@WebService(endpointInterface = "soap.game_result.Result")
public class GameResult implements soap.game_result.Result{
    @Override
    public int lose(int score){
        score -= 10;
        System.out.println("The user lose a game");
        return score;
    }
    @Override
    public int win(int score){
        score += 10;
        System.out.println("The user win a game");
        return score;
    }

}
