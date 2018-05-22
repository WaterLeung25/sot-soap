package soap.register;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by water on 9/8/2017.
 */
@WebService(endpointInterface = "soap.register.Register")
public class GameRegister implements Register{

    List<User> users = new ArrayList<>();

    @Override
    public String register (String username, String password){
        boolean exist = false;

        for (User u : users){
            if(u.getUsername().equals(username)){
                exist = true;
                System.out.println("Registration fell");
            }
        }

        if(exist==false){
            User newUser = new User(username, password);
            users.add(newUser);
            System.out.println("A new user is added to the system");
            return newUser.getUsername();
        }
        return "exist";
    }



}
