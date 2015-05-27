package recom.form;

import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

/**
 * @author andoharuka
 *
 */
public class RecomemberDeleteForm {
	
	public Integer recomId;
	
	@Required
	@Maxlength(maxlength = 40)
	public String newName;
	
	@Mask(mask ="^[0-9]+$")
	@Maxlength(maxlength = 11)
	public String newPhone;
	
	public String year;
	
	public String month;
	
	public String day;
	
	@Maxlength(maxlength = 400)
	public String note;
	
	public int talkFlag;
	
	public Integer deleteFlag;
	
	public String regisrationDate;
	
	public String updateDate;
	
	public String food;
	
}
