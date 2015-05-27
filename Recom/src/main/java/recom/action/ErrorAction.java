package recom.action;

import org.seasar.struts.annotation.Execute;

/**
 * @author andoharuka
 *
 */
public class ErrorAction {
	
	/**
	 * エラー画面に遷移するメソッド.
	 * @return エラー画面
	 */
	@Execute(validator = false)
	public String index(){
		return "error.jsp";
	}
	
	//編集＠安藤

	//コミット
}
