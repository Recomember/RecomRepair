package recom.interceptor;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;

/**
 * @author andoharuka
 *
 */
public class ErrorInterceptor extends AbstractInterceptor{

	private static final long serialVersionUID = 1L;
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		try {
			return invocation.proceed();
			
		} catch(Exception ex) {
			//エラー画面に遷移
			return "/error/";
		}
		
	}
}
