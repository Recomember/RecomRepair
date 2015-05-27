package recom.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import recom.dto.LoginDto;
import recom.entity.User;
import recom.form.LoginForm;
import recom.service.LoginService;

public class LoginAction {
	
	/** アクションフォーム　*/
	@ActionForm
	@Resource
	protected LoginForm loginForm;
	
	/** 認証情報を格納するセッションスコープのDTO */
	@Resource
	protected LoginDto loginDto;
	
	/** ユーザ情報を検索するためのサービス */
	@Resource
	protected LoginService loginService;
	
	public String loginErrorMessages;	
	
	
	/** ログイン画面を表示する実行メソッド */
	@Execute(validator = false)
	public static String index(){
		return "login.jsp";
			
	}
	
	/** ログインボタンがクリックされた時に呼び出されるメソッド */
	@Execute(validator = true, input = "login.jsp")
	public String login(){
		
		// 入力されたユーザー情報
		String loginId = loginForm.userId;
		String loginPass = loginForm.userPass;
		
		//ログイン画面で入力されたユーザ名でユーザを検索
		User user = loginService.getUserInfo(loginId, loginPass);
		
		if (user == null){
			loginErrorMessages = "入力されたユーザー名またはパスワードに誤りがあります。";
			return "login.jsp";
		}
		
		//DTOにログイン情報を持たせる
		loginDto = loginService.getLoginInfo(loginId);
		
		return "/index?redirect=true";
	
  }
}
	
	

