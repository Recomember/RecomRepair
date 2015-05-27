package recom.action;

import javax.annotation.Resource;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import recom.dto.RecomemberDto;
import recom.form.RecomemberForm;
import recom.service.RecomemberRegisterService;

/**
 * @author andoharuka
 * 登録のアクションクラス
 */
public class RecomemberRegisterAction {
	 
	 @Resource
	 public RecomemberDto recomemberDto;

	 @ActionForm
	 @Resource
	 protected RecomemberForm recomemberForm;
	 
	 @Resource
	 protected RecomemberRegisterService recomemberRegisterService;
		
	/**
	 * 登録画面に遷移するメソッド
	 * @return 遷移先のページ
	 */
	@Execute(validator = false)
	public String index() {
		return "RecomemberRegister.jsp";
	}
	
	/**
	 * 登録内容を確認画面にセットし、
	 * 確認画面に遷移するメソッド
	 * @return　遷移先のページ
	 */
	@Execute(validator = true ,input = "RecomemberRegister.jsp")
	public String RecomemberRegisterConfirm() {	
		
		recomemberDto.empName = recomemberForm.newName;
		recomemberDto.empPhone = recomemberForm.newPhone;
		recomemberDto.birthYear = recomemberForm.year;
		recomemberDto.birthMonth = recomemberForm.month;
		recomemberDto.birthDay = recomemberForm.day;
		recomemberDto.favFood = recomemberForm.food;
		recomemberDto.empNote = recomemberForm.note;
		recomemberDto.talkFlag = recomemberForm.talkFlag;
		recomemberDto.deleteFlag = recomemberForm.deleteFlag;
		
		return "RecomemberRegisterConfirm.jsp";
	}
	
	/**
	 * データベースにデータを登録し、
	 * 登録完了画面に遷移するメソッド
	 * @return　遷移先のページ
	 */
	@Execute(validator = false)
	@RemoveSession(name = "recomemberDto")
	public String RecomemberRegisterComplete() {
		String empName = recomemberDto.empName;
		String empPhone = recomemberDto.empPhone;
		String birthYear = recomemberDto.birthYear;
		String birthMonth = recomemberDto.birthMonth;
		String birthDay = recomemberDto.birthDay;
		String favFood = recomemberDto.favFood;
		String empNote = recomemberDto.empNote;
		Integer talkFlag = recomemberDto.talkFlag;
		Integer deleteFlag = recomemberDto.deleteFlag;
		
		recomemberRegisterService.insert(empName,empPhone,birthYear,birthMonth,birthDay,favFood,empNote,talkFlag,deleteFlag);
		
		return "RecomemberRegisterComplete.jsp";
	}
	
}
