package soap.register;

import javax.jws.WebMethod;
import javax.jws.WebService;



/**
 * Created by water on 9/8/2017.
 */
@WebService
public interface Register {
    @WebMethod
    public String register(String username, String password);

}
