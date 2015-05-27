package recom.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import recom.bean.RecomemberViewDto;
import recom.form.RecomemberListForm;
import recom.service.RecomemberListService;

public class RecomemberListAction {
	
	 public RecomemberViewDto recomemberViewDto;
	 
	 @ActionForm
	 @Resource
	 protected RecomemberListForm recomemberListForm;
	 
	 /** エンティティ操作クラス */
	 @Resource
	 protected RecomemberListService recomemberListService;
	 

	/**
	 * DBから一覧を取得し、一覧画面に遷移するメソッド.
	 * @return 遷移先のページ
	 */
	@Execute(validator = false)
	public String index() {
		
		// Dtoに入った一覧の呼び出し
		recomemberViewDto = recomemberListService.getAllRecomemberDto();
		
		return "RecomemberList.jsp";
	}
	
	
	/**
	 * 検索ワードに一致するレコードを取得するメソッド.
	 * @return 一覧画面
	 */
	@Execute(validator = false)
	public String RecomemberSearch(){
		
		recomemberViewDto = recomemberListService.getRecomemberSearchData(recomemberListForm.keyword);
		
		return "RecomemberList.jsp";
		
	}
}
