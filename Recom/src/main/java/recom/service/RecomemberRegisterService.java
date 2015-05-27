package recom.service;

import org.seasar.extension.jdbc.service.S2AbstractService;

import recom.constants.RecomConstants;
import recom.entity.Recomember;

/**
 * @author andoharuka
 *
 */
public class RecomemberRegisterService extends S2AbstractService<Recomember>{
	
	
	public int insert(String empName, String empPhone, String birthYear, String birthMonth, String birthDay, String favFood, String empNote, Integer talkFlag, Integer deleteFlag){
				
		Recomember entity = new Recomember();
		entity.empName = empName;
		entity.empPhone = empPhone;
		entity.birthYear = birthYear;
		entity.birthMonth = birthMonth;
		entity.birthDay = birthDay;
		entity.favFood = favFood;
		entity.empNote = empNote;
		entity.talkFlag = talkFlag;
		entity.deleteFlag = RecomConstants.UNDELETED;
		
		return insert(entity);
		
	}

}
