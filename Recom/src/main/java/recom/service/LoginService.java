package recom.service;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.service.S2AbstractService;

import recom.dto.LoginDto;
import recom.entity.User;

/**
 * @author andoharuka
 *
 */
public class LoginService extends S2AbstractService<User>{
	
	@Resource
	public LoginDto loginDto;
	
	public User getUserInfo(String loginId, String userPass) {
		// userIdからレコードを取得
		User userData = select().id(loginId).getSingleResult();
		
		if (userData == null) {
			// DBからユーザ情報が取得できなかった場合
			return null;
		
		} else if (userPass.equals(userData.userPass)) {
			// DBから取得したパスワードと入力されたパスワードが等しい場合
			return userData;
		
		}else{
		
			return null;
	 }
	}
	
		public LoginDto getLoginInfo(String loginId){
		
		User user = select().id(loginId).getSingleResult();
		
		//エンティティをDTOに詰める
		loginDto = createLoginDto(user);
		
		return loginDto;	
	}
	
	/**
	 * Dtoにレコードを詰め替える
	 */
	private LoginDto createLoginDto(User user){
		
		loginDto.userId = user.userId;
		loginDto.userPass = user.userPass;
		
		return loginDto;
		
	}

}
