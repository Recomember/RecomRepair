package recom.action;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.Execute;

public class LogoutAction {

	@Execute(validator = false)
	@RemoveSession(name = "loginDto")
	public String index() {
        return "/login/";
	}
	
	
	
}
