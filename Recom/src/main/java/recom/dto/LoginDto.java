package recom.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

import recom.entity.User;

/**
 * @author andoharuka
 * ユーザーの情報をデータベースへ送るDtoクラス.
 */
@Component(instance = InstanceType.SESSION)
public class LoginDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public LoginDto() {}
	
	public String userId;
	public String userPass;
	
	public LoginDto(User user){
		
		this.userId = user.userId;
		this.userPass = user.userPass;

	}
}