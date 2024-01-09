package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.awt.*;
import java.util.Date;
import java.util.List;
@WebService(serviceName ="BanqueWS" )
public class banqueService {
    @WebMethod(operationName = "ConversionEuroToDH")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt * 11;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code,Math.random()*60000,new Date());
    }
    public List<Compte>compteList(){
        return List.of(
                new Compte(1,Math.random()*60000,new Date()),
                new Compte(2,Math.random()*60000,new Date()),
                new Compte(3,Math.random()*60000,new Date())
        );
    }
}
