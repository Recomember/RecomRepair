package recom.action;

import javax.annotation.Resource;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import recom.dto.RecomemberDeleteDto;
import recom.form.RecomemberDeleteForm;
import recom.service.RecomemberDeleteService;

/**
 * @author andoharuka
 * 削除用アクションクラス.
 */
public class RecomemberDeleteAction {
	
	@Resource
	public RecomemberDeleteDto recomemberDeleteDto;

	@ActionForm
	@Resource
	protected RecomemberDeleteForm recomemberDeleteForm;
	
	@Resource
	protected RecomemberDeleteService recomemberDeleteService;
	
	/**
	 * 1件分のレコードを呼び出し、削除確認画面に遷移するメソッド.
	 * @return 削除確認画面
	 */
	@Execute(validator = false)
	public String index() {
		
		//Dtoに入った、IDをキーにして取得した1件分のレコードの呼び出し
		recomemberDeleteDto = recomemberDeleteService.getDeleteDto(recomemberDeleteForm.recomId);
				
		return "RecomemberDeleteConfirm.jsp";
	}
	
	/**
	 * deleteFlagを1に変更してデーターベースを更新し、
	 * 削除完了画面に遷移するメソッド.
	 * @return 削除完了画面
	 */
	@Execute(validator = false)
	@RemoveSession(name = "recomemberDeleteDto")
	public String RecomemberDeleteComplete(){
		
		Integer recomId = recomemberDeleteDto.recomId;
		String empName = recomemberDeleteDto.empName;
		String empPhone = recomemberDeleteDto.empPhone;
		String birthYear = recomemberDeleteDto.birthYear;
		String birthMonth = recomemberDeleteDto.birthMonth;
		String birthDay = recomemberDeleteDto.birthDay;
		String favFood = recomemberDeleteDto.favFood;
		String empNote = recomemberDeleteDto.empNote;
		Integer talkFlag = recomemberDeleteDto.talkFlag;
		Integer deleteFlag = recomemberDeleteDto.deleteFlag;
		
		recomemberDeleteService.update(recomId, empName, empPhone, birthYear, birthMonth, birthDay, favFood, empNote, talkFlag, deleteFlag);
		
		return "RecomemberDeleteComplete.jsp";
	}
	
}