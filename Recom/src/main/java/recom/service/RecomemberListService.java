package recom.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.seasar.extension.jdbc.service.S2AbstractService;
import org.seasar.extension.jdbc.where.ComplexWhere;
import org.seasar.extension.jdbc.where.SimpleWhere;

import recom.bean.RecomemberViewDto;
import recom.dto.RecomemberDto;
import recom.entity.Recomember;

/**
 * @author andoharuka
 *
 */
public class RecomemberListService extends S2AbstractService<Recomember>{


	/**
	 * テーブルを検索し、取得されたデータをEntityからDtoへ詰め替えるメソッド.
	 * @return
	 */
  	public RecomemberViewDto getAllRecomemberDto() {
		
		// 一覧表示用にテーブルのdeleteFlagが0のレコードを取得し、
		// データ型Recomember,リスト名recomemberDataに格納
		List<Recomember> recomemberData = select()
					.where(
							new SimpleWhere()
							.eq("deleteFlag", 0))
					.getResultList();
		
		/**
		 * selectメソッドで取得したエンティティを
		 * 新しく作ったrecomemberViewDtoに詰め替える。
		 */
		RecomemberViewDto recomemberViewDto = createDto(recomemberData);	
		return recomemberViewDto;
	}
  	
  	/**
	 * Dtoのリストに詰め替える。
	 */
	 private RecomemberViewDto createDto(List<Recomember> recomemberData) {
		
		// DTOのインスタンス化
		// DTOが持つリストのインスタンス化
		 RecomemberViewDto recomemberViewDto = new RecomemberViewDto();
		 
		 // For
		 for(Recomember recom : recomemberData ){
			 
		 	// HOGE(Bean)のインスタンス化
			 RecomemberDto recomemberDto
			 	= new RecomemberDto(recom);
			 
		    // HOGEにrecomemberDataの情報を移す（必要に応じて画面に表示させるデータも詰める）
			 recomemberViewDto.recomembers.add(recomemberDto);
	
		 }
		return recomemberViewDto;
	 }
  	
  	
  	/**
  	 * 検索ワードをエンティティから検索するメソッド.
  	 * @return
  	 */
	 public RecomemberViewDto getRecomemberSearchData(String keyword){

		 /** 検索ワードをスペースを区切り文字として分割し、リストに格納する */
		String[] keywordLine = keyword.split("　", 0);
			
		List<Recomember> searchData;
		RecomemberViewDto recomemberViewDto = new RecomemberViewDto();
		Map<Integer, Recomember> recomemberMap = new TreeMap<Integer, Recomember>();
		
		
		for (String keywordList : keywordLine){
		 
		 searchData = select()
  				.where(
  					new ComplexWhere()
  						.contains("empName", keywordList)
  						.or().contains("empNote", keywordList)
  					, new SimpleWhere()
  						.eq("deleteFlag", 0)
  						).getResultList();	
		
		 for(Recomember mapin : searchData){
			 recomemberMap.put(mapin.recomId , mapin);
			 
		 }
		
		 recomemberViewDto = createSearchDto(recomemberMap);
  		
		}
		return recomemberViewDto;
  	}
  	
  	/**
	 * Dtoのリストに詰め替える。
	 */
	 private RecomemberViewDto createSearchDto(Map<Integer, Recomember> recomemberMap) {
		
		// DTOのインスタンス化
		// DTOが持つリストのインスタンス化
		 RecomemberViewDto recomemberViewDto = new RecomemberViewDto();
		 
		 // For
		 for(Recomember recom : recomemberMap.values() ){
			 
		 	// HOGE(Bean)のインスタンス化
			 RecomemberDto recomemberDto
			 	= new RecomemberDto(recom);
			 
		    // HOGEにrecomemberDataの情報を移す（必要に応じて画面に表示させるデータも詰める）
			 recomemberViewDto.recomembers.add(recomemberDto);
	
		 }
		return recomemberViewDto;
	 }
	
	
	
}
