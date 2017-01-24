package wsHolaMundo;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by jl.jasso on 21/01/2017.
 */

@WebService
public interface HolaMundo {

    @WebMethod
    public String getHolaMundo(String s);
}
