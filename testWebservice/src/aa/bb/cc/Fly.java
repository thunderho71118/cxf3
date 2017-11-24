package aa.bb.cc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "Fly", targetNamespace = "http://cc.bb.aa/")
public interface Fly {

	@WebMethod(operationName = "shoot", action = "urn:Shoot")
	String shoot(@WebParam(name = "arg0") String bird);

}