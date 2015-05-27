<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>削除確認</title>
</head>
<body>
<h1>削除しますか？</h1>
<s:form>
<table border=1>
		 <tr><th>名前</th><th>電話番号</th><th>誕生　年</th><th>月</th><th>日</th><th>好きな食べ物のジャンル</th><th>話したこと</th><th>ノート</th></tr>
            <tr><td><input type="hidden" value="${recomemberDeleteDto.recomId}"  name="recomId" >
            <label>${recomemberDeleteDto.empName}</label></td>
            <td><label>${recomemberDeleteDto.empPhone}</label></td>
            <td><label>${recomemberDeleteDto.birthYear}</label></td>
            <td><label>${recomemberDeleteDto.birthMonth}</label></td>
            <td><label>${recomemberDeleteDto.birthDay}</label></td>
            <td><label>${recomemberDeleteDto.favFood}</label></td>
            <td><label>${recomemberDeleteDto.talkFlag == 1 ? 'ある' : 'ない'} </label></td>
            <td><label>${recomemberDeleteDto.empNote} </label></td>
            </tr>
	</table>


<input type="button" value="戻る" onClick="history.go(-1);">
<input type="submit" name="RecomemberDeleteComplete" value="完了">
</s:form>
</body>
</html>