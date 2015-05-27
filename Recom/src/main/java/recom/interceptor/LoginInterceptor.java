package recom.interceptor;

import javax.annotation.Resource;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;
import org.seasar.struts.annotation.Execute;

import recom.dto.LoginDto;


public class LoginInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;

	/**
	 * セッションに保持されているデータ.
	 */
	@Resource
	protected LoginDto loginDto;

	/**
	 * AbstractInterceptorを継承する際に、実装する必要のあるメソッド。
	 * 割り込ませる処理を記述。
	 */
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		// 両方の条件を満たしていない場合、Loginページへ飛ばす。
		return ( ! isExecuteMethod(invocation) || isLoggedIn()) ? invocation
				 .proceed() : "/login/?redirect=true";
	}

	/**
	 * 実行されたActionに@Executeがついていたかどうか。
	 * @param invocation
	 * @return アノテーションがついていればtrue
	 */
	private boolean isExecuteMethod(MethodInvocation invocation) {
		boolean result = invocation.getMethod().isAnnotationPresent(Execute.class);
		return result;
	}

	/**
	 * セッション上にDtoがあるか、あった場合その中にuserIDは保持されているか。
	 * @return 上記の条件を両方満たしていればtrue
	 */
	private boolean isLoggedIn() {
		boolean result = (loginDto != null && loginDto.userId != null);
		return result;
	}
}