<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>編集画面</title>
</head>
<body>
<h1>編集ページ</h1>
<h2>
<a href='${f:url("/index")}'>TOP</a>
<a href='${f:url("/recomemberRegister")}'>登録</a>
<a href='${f:url("/recomemberList")}'>一覧</a>
</h2>
<h3>
Recomemberを編集します。<br>
<s:form>
名前 <input type="text" name="newName" value="${recomemberDto.empName}" required><br>
電話番号<input type="text" name="newPhone" value="${recomemberDto.empPhone}"><br>
誕生日
	<html:select property="year" value="${recomemberDto.birthYear}">
	<html:option value="" >----</html:option>
    <html:option value="1901">1901</html:option>
    <html:option value="1902">1902</html:option>
    <html:option value="1903">1903</html:option>
    <html:option value="1904">1904</html:option>
    <html:option value="1905">1905</html:option>
    <html:option value="1906">1906</html:option>
    <html:option value="1907">1907</html:option>
    <html:option value="1908">1908</html:option>
    <html:option value="1909">1909</html:option>
    <html:option value="1910">1910</html:option>
    <html:option value="1911">1911</html:option>
    <html:option value="1912">1912</html:option>
    <html:option value="1913">1913</html:option>
    <html:option value="1914">1914</html:option>
    <html:option value="1915">1915</html:option>
    <html:option value="1916">1916</html:option>
    <html:option value="1917">1917</html:option>
    <html:option value="1918">1918</html:option>
    <html:option value="1919">1919</html:option>
    <html:option value="1920">1920</html:option>
    <html:option value="1921">1921</html:option>
    <html:option value="1922">1922</html:option>
    <html:option value="1923">1923</html:option>
    <html:option value="1924">1924</html:option>
    <html:option value="1925">1925</html:option>
    <html:option value="1926">1926</html:option>
    <html:option value="1927">1927</html:option>
    <html:option value="1928">1928</html:option>
    <html:option value="1929">1929</html:option>
    <html:option value="1930">1930</html:option>
    <html:option value="1931">1931</html:option>
    <html:option value="1932">1932</html:option>
    <html:option value="1933">1933</html:option>
    <html:option value="1934">1934</html:option>
    <html:option value="1935">1935</html:option>
    <html:option value="1936">1936</html:option>
    <html:option value="1937">1937</html:option>
    <html:option value="1938">1938</html:option>
    <html:option value="1939">1939</html:option>
    <html:option value="1940">1940</html:option>
    <html:option value="1941">1941</html:option>
    <html:option value="1942">1942</html:option>
    <html:option value="1943">1943</html:option>
    <html:option value="1944">1944</html:option>
    <html:option value="1945">1945</html:option>
    <html:option value="1946">1946</html:option>
    <html:option value="1947">1947</html:option>
    <html:option value="1948">1948</html:option>
    <html:option value="1949">1949</html:option>
    <html:option value="1950">1950</html:option>
    <html:option value="" >----</html:option>
    <html:option value="1951">1951</html:option>
    <html:option value="1952">1952</html:option>
    <html:option value="1953">1953</html:option>
    <html:option value="1954">1954</html:option>
    <html:option value="1955">1955</html:option>
    <html:option value="1956">1956</html:option>
    <html:option value="1957">1957</html:option>
    <html:option value="1958">1958</html:option>
    <html:option value="1959">1959</html:option>
    <html:option value="1960">1960</html:option>
    <html:option value="1961">1961</html:option>
    <html:option value="1962">1962</html:option>
    <html:option value="1963">1963</html:option>
    <html:option value="1964">1964</html:option>
    <html:option value="1965">1965</html:option>
    <html:option value="1966">1966</html:option>
    <html:option value="1967">1967</html:option>
    <html:option value="1968">1968</html:option>
    <html:option value="1969">1969</html:option>
    <html:option value="1970">1970</html:option>
    <html:option value="1971">1971</html:option>
    <html:option value="1972">1972</html:option>
    <html:option value="1973">1973</html:option>
    <html:option value="1974">1974</html:option>
    <html:option value="1975">1975</html:option>
    <html:option value="1976">1976</html:option>
    <html:option value="1977">1977</html:option>
    <html:option value="1978">1978</html:option>
    <html:option value="1979">1979</html:option>
    <html:option value="1980">1980</html:option>
    <html:option value="1981">1981</html:option>
    <html:option value="1982">1982</html:option>
    <html:option value="1983">1983</html:option>
    <html:option value="1984">1984</html:option>
    <html:option value="1985">1985</html:option>
    <html:option value="1986">1986</html:option>
    <html:option value="1987">1987</html:option>
    <html:option value="1988">1988</html:option>
    <html:option value="1989">1989</html:option>
    <html:option value="1990">1990</html:option>
    <html:option value="1991">1991</html:option>
    <html:option value="1992">1992</html:option>
    <html:option value="1993">1993</html:option>
    <html:option value="1994">1994</html:option>
    <html:option value="1995">1995</html:option>
    <html:option value="1996">1996</html:option>
    <html:option value="1997">1997</html:option>
    <html:option value="1998">1998</html:option>
    <html:option value="1999">1999</html:option>
    <html:option value="2000">2000</html:option>
    <html:option value="2001">2001</html:option>
    <html:option value="2002">2002</html:option>
    <html:option value="2003">2003</html:option>
    <html:option value="2004">2004</html:option>
    <html:option value="2005">2005</html:option>
    <html:option value="2006">2006</html:option>
    <html:option value="2007">2007</html:option>
    <html:option value="2008">2008</html:option>
    <html:option value="2009">2009</html:option>
    <html:option value="2010">2010</html:option>
</html:select>年
<html:select property="month" value="${recomemberDto.birthMonth}">
    <html:option value="" >----</html:option>
    <html:option value="1">1</html:option>
    <html:option value="2">2</html:option>
    <html:option value="3">3</html:option>
    <html:option value="4">4</html:option>
    <html:option value="5">5</html:option>
    <html:option value="6">6</html:option>
    <html:option value="7">7</html:option>
    <html:option value="8">8</html:option>
    <html:option value="9">9</html:option>
    <html:option value="10">10</html:option>
    <html:option value="11">11</html:option>
    <html:option value="12">12</html:option>
</html:select>月
<html:select property="day" value="${recomemberDto.birthDay}">
    <html:option value="">----</html:option>
    <html:option value="1">1</html:option>
    <html:option value="2">2</html:option>
    <html:option value="3">3</html:option>
    <html:option value="4">4</html:option>
    <html:option value="5">5</html:option>
    <html:option value="6">6</html:option>
    <html:option value="7">7</html:option>
    <html:option value="8">8</html:option>
    <html:option value="9">9</html:option>
    <html:option value="10">10</html:option>
    <html:option value="11">11</html:option>
    <html:option value="12">12</html:option>
    <html:option value="13">13</html:option>
    <html:option value="14">14</html:option>
    <html:option value="15">15</html:option>
    <html:option value="16">16</html:option>
    <html:option value="17">17</html:option>
    <html:option value="18">18</html:option>
    <html:option value="19">19</html:option>
    <html:option value="20">20</html:option>
    <html:option value="21">21</html:option>
    <html:option value="22">22</html:option>
    <html:option value="23">23</html:option>
    <html:option value="24">24</html:option>
    <html:option value="25">25</html:option>
    <html:option value="26">26</html:option>
    <html:option value="27">27</html:option>
    <html:option value="28">28</html:option>
    <html:option value="29">29</html:option>
    <html:option value="30">30</html:option>
    <html:option value="31">31</html:option>
 </html:select>日



<br>
好きな食べ物のジャンル
	<html:select property="food" value="${recomemberDto.favfood}">
  		<html:option value="">選択してください</html:option>
  		<html:option value="和食">和食</html:option>
  		<html:option value="洋食">洋食</html:option>
  		<html:option value="中華">中華</html:option>
	</html:select><br>
話したこと
	<html:select property="talkFlag" value="${recomemberDto.talkFlag}">
  		<html:option value="">選択してください</html:option>
  		<html:option value="1">ある</html:option>
  		<html:option value="0">ない</html:option>
	</html:select><br>
<br>
ノート
	<TEXTAREA cols="40" rows="6" wrap="off" name="note">${recomemberDto.empNote}</TEXTAREA><br>

</h3>

<a href='${f:url("/recomemberList")}'>一覧</a>
<input type="submit" name="RecomemberEditConfirm" value="確認">
<input type="hidden" value="${recomemberDto.recomId}"  name="recomId" >
<input type="hidden" value="${recomemberDto.deleteFlag}" name="deleteFlag">
</s:form>
<br>
<a href='${f:url("/logout")}'>ログアウト</a>
</body>
</html>