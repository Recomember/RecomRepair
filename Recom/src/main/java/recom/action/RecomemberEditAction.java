package recom.action;

import javax.annotation.Resource;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import recom.dto.RecomemberDto;
import recom.form.RecomemberEditForm;
import recom.service.RecomemberEditService;

/**
 * 編集機能用アクションクラス
 * @author andoharuka
 */
public class RecomemberEditAction {

	@ActionForm
	@Resource
	protected RecomemberEditForm recomemberEditForm;

	@Resource
	public RecomemberDto recomemberDto;
	
	@Resource
	protected RecomemberEditService recomemberEditService;
	
	
	/**
	 * 編集画面に遷移するためのメソッド.
	 * @return 編集ページ
	 */
	@Execute(validator = false)
	public String index() {
		// IDをキーに１レコード取得
		recomemberDto = recomemberEditService.getEditDto(recomemberEditForm.recomId);
		
		return "RecomemberEdit.jsp";
	}
	
	/**
	 * 編集確認画面に遷移するためのメソッド.
	 * @return 編集確認画面
	 */
	@Execute(validator = true, input = "RecomemberEdit.jsp")
	public String RecomemberEditConfirm() {
		
		recomemberDto.recomId = recomemberEditForm.recomId;
		recomemberDto.empName = recomemberEditForm.newName;
		recomemberDto.empPhone = recomemberEditForm.newPhone;
		recomemberDto.birthYear = recomemberEditForm.year;
		recomemberDto.birthMonth = recomemberEditForm.month;
		recomemberDto.birthDay = recomemberEditForm.day;
		recomemberDto.favFood = recomemberEditForm.food;
		recomemberDto.empNote = recomemberEditForm.note;
		recomemberDto.talkFlag = recomemberEditForm.talkFlag;
		recomemberDto.deleteFlag = recomemberEditForm.deleteFlag;
		
		return "RecomemberEditConfirm.jsp";
	}
	
	
	/**
	 * 登録内容を編集した値を変更してデータベースを更新し、
	 * 編集完了画面に遷移するためのメソッド.
	 * @return 編集完了画面
	 */
	@Execute(validator = false)
	@RemoveSession(name = "recomemberDto")
	public String RecomemberEditComplete(){
		
		Integer recomId = recomemberDto.recomId;
		String empName = recomemberDto.empName;
		String empPhone = recomemberDto.empPhone;
		String birthYear = recomemberDto.birthYear;
		String birthMonth = recomemberDto.birthMonth;
		String birthDay = recomemberDto.birthDay;
		String favFood = recomemberDto.favFood;
		String empNote = recomemberDto.empNote;
		Integer talkFlag = recomemberDto.talkFlag;
		Integer deleteFlag = recomemberDto.deleteFlag;
		
		recomemberEditService.update(recomId, empName, empPhone, birthYear, birthMonth, birthDay, favFood, empNote, talkFlag, deleteFlag);
		
		return "RecomemberEditComplete.jsp";
	}
	
}