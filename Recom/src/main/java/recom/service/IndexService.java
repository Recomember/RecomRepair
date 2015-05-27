package recom.service;

import org.seasar.extension.jdbc.service.S2AbstractService;
import org.seasar.extension.jdbc.where.SimpleWhere;

import recom.entity.Recomember;

/**
 * @author andoharuka
 *
 */
public class IndexService extends S2AbstractService<Recomember>{
	
	/**
	 * エンティティから削除フラグが立っていない登録者の件数を取得する.
	 * @return
	 */
	public long getEnrollment(){
		
		long enrollment = select()
				.where(
						new SimpleWhere()
						.eq("deleteFlag", 0))
				.getCount();
		
		return enrollment;
		
	}
	
	/**
	 * エンティティから削除フラグが立っていない、かつ
	 * トークフラグが立っている登録者の件数を取得する.
	 * @return
	 */
	public long getTalked(){
		
		long talked = select()
				.where(
						new SimpleWhere()
						.eq("deleteFlag", 0)
						.eq("talkFlag", 1))
				.getCount();
		
		return talked;
	}
	
	
}
