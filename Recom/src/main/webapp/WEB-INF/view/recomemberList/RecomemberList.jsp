<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recom list</title>
</head>
<body><center>

<h1>一覧ページ</h1>
<h2>
<a href='${f:url("/index")}'>TOP</a>
<a href='${f:url("/recomemberRegister")}'>登録</a>
<a href='${f:url("/recomemberList")}'>一覧</a>
</h2>

	<s:form method="POST" action="/recomemberList">
	<input type="text" name="keyword">
	<input type="submit" name="RecomemberSearch" value="検索">
	</s:form>
<br>
	<table border=1>
	<tr><th>名前</th><th>電話番号</th><th>誕生 年</th><th>月</th><th>日</th><th>好きな食べ物のジャンル</th><th>話したこと</th><th>ノート</th><th></th></tr>
	<c:forEach var="recom" items="${recomemberViewDto.recomembers}">
	
	<s:form method="POST" action="/recomemberEdit">
	
	         <tr><td><input type="hidden" value="${f:h(recom.recomId)}"  name="recomId" >
             		 　　${recom.empName}</td>
             <td><label>${recom.empPhone}</label></td>
             <td><label>${recom.birthYear}</label></td>
             <td><label>${recom.birthMonth}</label></td>
             <td><label>${recom.birthDay}</label></td>
             <td><label>${recom.favFood}</label></td>
             <td><label>${recom.talkFlag == 1 ? 'ある' : 'ない'}</label></td>
             <td><label>${recom.empNote}
             </label></td>
				
             <td><label><input type="submit" name="index" value="編集"></label>	
			
     </s:form>
     <s:form method="POST" action="/recomemberDelete">
    
             <input type="hidden" value="${f:h(recom.recomId)}"  name="recomId" > 
             <input type="submit" name="index" value="削除"></tr>    
             
            </s:form> 
    </c:forEach>
	</table>
	

<br>
<a href='${f:url("/logout")}'>ログアウト</a>
</body>
<footer>All rights reserved by Team15</footer></center>
</html>