package recom.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

import recom.entity.Recomember;

/**
 * @author andoharuka
 *
 */
@Component(instance = InstanceType.SESSION)
public class RecomemberDeleteDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public RecomemberDeleteDto(){}
	
		public Integer recomId;
		public String empName;
		public String empPhone;
		public String birthYear;
		public String birthMonth;
		public String birthDay;
		public String favFood;
		public String empNote;
		public Integer talkFlag;
		public Integer deleteFlag;
	
	public RecomemberDeleteDto(Recomember recom){
		this.recomId = recom.recomId;
		this.empName = recom.empName;
		this.empPhone = recom.empPhone;
		this.birthYear = recom.birthYear;
		this.birthMonth = recom.birthMonth;
		this.birthDay = recom.birthDay;
		this.favFood = recom.favFood;
		this.empNote = recom.empNote;
		this.talkFlag = recom.talkFlag;
		this.deleteFlag = recom.deleteFlag;
	}
		
}

