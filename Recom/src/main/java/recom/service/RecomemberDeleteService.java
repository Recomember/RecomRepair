/**
 * 
 */
package recom.service;

import java.sql.Timestamp;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.service.S2AbstractService;

import recom.constants.RecomConstants;
import recom.dto.RecomemberDeleteDto;
import recom.entity.Recomember;

/**
 * @author andoharuka
 * レコメンバー削除用サービスクラス.
 */
public class RecomemberDeleteService extends S2AbstractService<Recomember>{
	
	@Resource
	public RecomemberDeleteDto recomemberDeleteDto;
	
	//取得した1レコードを
	//データ型Recomember,リスト名deleteRecomemberDataに格納
	public RecomemberDeleteDto getDeleteDto(Integer recomId) {
		
		
		//Idをキーにして１レコード取得する
		Recomember recomemberDeleteData = select().id(recomId).getSingleResult();
		
		//取得したレコードを新しく作ったrecomemberDeleteDtoに詰め替える.
		//entityをDtoに詰める
		RecomemberDeleteDto recomemberDeleteDto = createDeleteDto(recomemberDeleteData);
		
		return recomemberDeleteDto;
			
	}
	
	public Recomember findByRecomId(Integer recomId){
		Recomember recomemberDeleteData = select().id(recomId).getSingleResult();
		return recomemberDeleteData;
	}
 
		/**
		 * Dtoにレコードを詰め替える
		 */
		private RecomemberDeleteDto createDeleteDto(Recomember recomemberDeleteData){
			
			// エンティティをDTOに詰め替える
			recomemberDeleteDto.recomId = recomemberDeleteData.recomId;
			recomemberDeleteDto.empName = recomemberDeleteData.empName;
			recomemberDeleteDto.empPhone = recomemberDeleteData.empPhone;
			recomemberDeleteDto.birthYear = recomemberDeleteData.birthYear;
			recomemberDeleteDto.birthYear = recomemberDeleteData.birthMonth;
			recomemberDeleteDto.birthDay = recomemberDeleteData.birthDay;
			recomemberDeleteDto.talkFlag = recomemberDeleteData.talkFlag;
			recomemberDeleteDto.favFood = recomemberDeleteData.favFood;
			recomemberDeleteDto.empNote = recomemberDeleteData.empNote;
			recomemberDeleteDto.deleteFlag = recomemberDeleteData.deleteFlag;
			
			return recomemberDeleteDto;
	}
		

		public int update(Integer recomId, String empName, String empPhone, String birthYear, String birthMonth, String birthDay, String favFood, String empNote, Integer talkFlag, Integer deleteFlag){
			
			Recomember entity = findByRecomId(recomId);
			entity.empName = empName;
			entity.empPhone = empPhone;
			entity.birthYear = birthYear;
			entity.birthMonth = birthMonth;
			entity.birthDay = birthDay;
			entity.favFood = favFood;
			entity.empNote = empNote;
			entity.talkFlag = talkFlag;
			entity.deleteFlag = RecomConstants.DELETED;
			entity.updateDate = new Timestamp(System.currentTimeMillis());
			
			return update(entity);
			
		}
		 

}



