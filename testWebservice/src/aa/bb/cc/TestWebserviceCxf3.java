package aa.bb.cc;

import javax.jws.WebService;

@WebService(targetNamespace = "http://cc.bb.aa/", endpointInterface = "aa.bb.cc.Fly", portName = "TestWebserviceCxf3Port", serviceName = "TestWebserviceCxf3Service")
public class TestWebserviceCxf3 implements Fly {
	public String shoot(String bird) {
		return bird + " is desd.";
	}
}
