package recom.service;

import java.sql.Timestamp;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.service.S2AbstractService;

import recom.dto.RecomemberDto;
import recom.entity.Recomember;

/**
 * @author andoharuka
 * 編集機能用サービスクラス.
 */
public class RecomemberEditService extends S2AbstractService<Recomember>{
	
	@Resource
	public RecomemberDto recomemberDto;
	
	/**
	 * userIdを使ってレコードを取得し、DTOへ格納してアクションへ返すメソッド.
	 * @param userId
	 * @return recomemberDto
	 */
	public RecomemberDto getEditDto(Integer userId){
		
		//Idをキーにして１レコード取得する
		Recomember recomemberEditData = select().id(userId).getSingleResult();
		
		//取得したレコードを新しく作ったrecomemberDeleteDtoに詰め替える.
		//entityをDtoに詰める
		RecomemberDto recomemberDto = createEditDto(recomemberEditData);		
		
		return recomemberDto;
	}
	
	public Recomember findById(Integer recomId){
		Recomember recomemberEditData = select().id(recomId).getSingleResult();
		return recomemberEditData;
	}
	
	/**
	 * エンティティからDTOにレコードを詰め替えるメソッド.
	 * @param recomemberEditData
	 * @return
	 */
	public RecomemberDto createEditDto(Recomember recomemberEditData){
	
		recomemberDto.recomId = recomemberEditData.recomId;
		recomemberDto.empName = recomemberEditData.empName;
		recomemberDto.empPhone = recomemberEditData.empPhone;
		recomemberDto.birthYear = recomemberEditData.birthYear;
		recomemberDto.birthMonth = recomemberEditData.birthMonth;
		recomemberDto.birthDay = recomemberEditData.birthDay;
		recomemberDto.talkFlag = recomemberEditData.talkFlag;
		recomemberDto.favFood = recomemberEditData.favFood;
		recomemberDto.empNote = recomemberEditData.empNote;
		recomemberDto.deleteFlag = recomemberEditData.deleteFlag;
		
		return recomemberDto;
	}
	

	
	/**
	 * エンティティに更新した値を格納するメソッド.
	 * 
	 * @param recomId
	 * @param empName
	 * @param empPhone
	 * @param birthYear
	 * @param favFood
	 * @param empNote
	 * @param talkFlag
	 * @param deleteFlag
	 * @return エンティティ
	 */
	public int update(Integer recomId, String empName, String empPhone, String birthYear, String birthMonth, String birthDay, String favFood, String empNote, Integer talkFlag, Integer deleteFlag){
		
		Recomember entity = findById(recomId);
		entity.empName = empName;
		entity.empPhone = empPhone;
		entity.birthYear = birthYear;
		entity.birthMonth = birthMonth;
		entity.birthDay = birthDay;
		entity.favFood = favFood;
		entity.empNote = empNote;
		entity.talkFlag = talkFlag;
		entity.deleteFlag = deleteFlag;
		entity.updateDate = new Timestamp(System.currentTimeMillis());
		
		return update(entity);

	}

}
