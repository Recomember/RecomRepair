/**
 * 
 */
package recom.form;

import org.seasar.struts.annotation.Maxbytelength;
import org.seasar.struts.annotation.Required;

/**
 * @author andoharuka
 * ログイン処理に使用する変数
 */
public class LoginForm {
	
	@Required
	@Maxbytelength(maxbytelength = 30)
	public String userId;
	
	@Required
	@Maxbytelength(maxbytelength = 10)
	public String userPass;
	
}
