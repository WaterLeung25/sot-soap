package soap.rank;


import soap.game_result.GameResultService;
import soap.game_result.Result;
import soap.register.GameRegisterService;
import soap.register.Register;

import javax.jws.WebService;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by water on 9/12/2017.
 */
@WebService(endpointInterface = "soap.rank.Rank")
public class GameRank implements soap.rank.Rank{
    List<UserArchive> users = new ArrayList<>();

    GameRegisterService registerService = new GameRegisterService();
    Register register = registerService.getGameRegisterPort();

    GameResultService gameResultService = new GameResultService();
    Result result = gameResultService.getGameResultPort();

    @Override
    public String getNewUser(String user, String pw, int score){
        String u = register.register(user, pw);
        if (u.equals("exist")){
            return "The username already exist";
        }
        UserArchive newUser = new UserArchive(u, score);
        users.add(newUser);
        return "Registration is successful! " + newUser.getUsername() + ", score: " + newUser.getScore();
    }
    @Override
    public int updateWinArchive(String user, int score){
        int s = result.win(score);
        for (UserArchive u : users){
            if (u.getUsername().equals(user)){
                u.setScore(s);
            }
        }
        return s;
    }

    @Override
    public int updateLoseArchive(String user, int score){
        int s = result.lose(score);
        for (UserArchive u : users){
            if (u.getUsername().equals(user)){
                u.setScore(s);
            }
        }
        return s;
    }

    @Override
    public List<String> createRank(){
        UserArchive temp;
        for (int i = 0; i < users.size(); i++){
            for (int j = 0; j < (users.size() - i - 1); j++) {
                if ((users.get(j).getScore()) < (users.get(j + 1).getScore())){
                    temp = users.get(j);
                    users.set(j, users.get(j+1));
                    users.set(j+1, temp);
                }
            }
        }
        List<String> rank = new ArrayList<>();
        int num = 1;
        String s;
        for (UserArchive u : users){
            s = num + ". " + u.getUsername() + ", score:" + u.getScore();
            rank.add(s);
            num++;
        }
        return rank;
    }

//    @Override
//    public List<UserArchive> getUsers (){
//        return users;
//    }

}
