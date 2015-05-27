/*
 * Copyright 2004-2008 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package recom.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ResponseUtil;

import recom.service.IndexService;

public class IndexAction {

	public long enrollment;
	public long talked;
	public long percentage;
	public long leftOver;

	@Resource
	protected IndexService indexService;

	/**
	 * ダッシュボードに表示するためのデータを取得し格納するメソッド.
	 *
	 * @return
	 */
	@Execute(validator = false)
	public String index() {

		enrollment = indexService.getEnrollment();
		if (enrollment != 0) {
			talked = indexService.getTalked();
			leftOver = enrollment - talked;
			percentage = talked * 100 / enrollment;
		} else {
			enrollment = 0;
			talked = 0;
			leftOver = 0;
			percentage = 0;

		}

		return "index.jsp";
		/**
		 * 衞藤
		 */
		/**
		 * リトライ
		 */
	}
	
	/**
	 * JSON形式でレスポンスを返す
	 */
	@Execute(validator = false)
	public String jasonIndex() {
	
		 Map<String, Object> responseData = new HashMap<String, Object>();
		 
		 //マップに登録者数を格納
		 enrollment = indexService.getEnrollment();
		 responseData.put("Enrollment", enrollment);
		 
		 //マップに話したことがある人の数を格納
		 talked = indexService.getTalked();
		 responseData.put("Talked", talked);
		 
		 //マップにまだ話したことがない人の数を格納
		 leftOver = enrollment - talked;
		 responseData.put("LeftOver", leftOver);
		 
		 //マップに会話率を格納
		 percentage = talked * 100 / enrollment;
		 responseData.put("Percentage", percentage);

		// JSONICライブラリ（http://jsonic.sourceforge.jp/）によりJSON形式へ変換
		String jsonText = JSON.encode(responseData);
		
		 ResponseUtil.write(jsonText, "application/json");
		
		return null;
	}

}
