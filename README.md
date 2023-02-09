# SimpleWord



**1. 프로젝트 목표 및 요구사항**

   번역과 동시에 단어를 저장하여 공부할 수 있는 서비스 구현
  
**2. 진행 기간**

  2022.12.16 ~ 2022.12.25
  
**3. 주요 개발자원 (S/W)**
<table border="1">
		<tr>
			<th>구 분</th>
			<th>용 도</th>
			<th>명칭 및 버전</th>
		</tr>
		<tr align="center">
			<td>OS</td>
			<td>개발 PC</td>
			<td>Windows 10</td>
		</tr>
		<tr align="center">
			<td>WAS</td>
			<td>WEB/WAS</td>
			<td>Apach Tomcat 9</td>
		</tr>
		<tr align="center">
			<td>미들웨어</td>
			<td>DB</td>
			<td>OracleXE</td>
		</tr>
		<tr align="center">
			<td rowspan="3">사용 언어</td>
			<td>백 앤드</td>
			<td>java jdk 1.8 , jsp/servlet 3.1</td>
		</tr>
		<tr align="center">
			<td>개발 프레임 워크</td>
			<td>spring framework 5.0.2 , Spring Boot 2.7.7</td>
		</tr>
		<tr align="center">
			<td>프론트 앤드</td>
			<td>HTML5 , CSS3 , JAVASCRIPT, JAVA</td>
		</tr>
		<tr align="center">
			<td rowspan="2">소프트웨어 개발도구</td>
			<td>개발도구</td>
			<td>STS</td>
		</tr>
		<tr align="center">
			<td>DB</td>
			<td>SQLD</td>
		</tr>
		<tr align="center">
			<td>형상 관리및 협업</td>
			<td>소스 관리 및 버전관리</td>
			<td>Git hub , Git</td>
		</tr>
		<tr align="center">
			<td rowspan="13">사용 라이브러리 및 API</td>
			<td>관리</td>
			<td>Maven</td>
		</tr>
		<tr align="center">
			<td>db</td>
			<td>Mybatis-3.5.3</td>
		</tr>
		<tr align="center">
			<td>로그</td>
			<td>Spring AOP , Log4j</td>
		</tr>
		<tr align="center">
			<td>디자인</td>
			<td>Bootstrap , JQuery UI</td>
		</tr>
		<tr align="center">
			<td>보안</td>
			<td>Spring Security-5.0.8</td>
		</tr>
		<tr align="center">
			<td>데이터 전송</td>
			<td>Ajax , JSON</td>
		</tr>
		<tr align="center">
			<td>화면 UI</td>
			<td>JQuery-3.5.2</td>
		</tr>
    <tr align="center">
			<td>APO</td>
			<td>카카오 로그인, 네이버 번역 및 언어감지</td>
		</tr>
	</table>
  
**4. 담당 기능**
  * 사용자 회원가입, 로그인 기능 
  * 카카오 소셜로그인 기능 구현
  * 네이버 번역, 언어감지 API를 사용하여 번역 기능 구현
  * 변역 된 내용을 바탕으로 단어장 검색 및 저장 기능 구현
  * 단어장 검색 기능 구현
  
**5. 느낀 점** <br/>

* 어려웠던 점 <br/>
📌 API 사용 시 문서에 대한 이해도가 낮았고, 낯선 코드뿐이어서 어떻게 반영해야 할지 고민이 됬었다. <br/>
✔ 검색과 학습을 통하여 코드를 이해했고, 기능에 맞게 수정하여 적용했다. <br/><br/>
📌 언어를 다루는 프로젝트이다 보니 언어의 특성과 규칙성을 고려해야됬고 테이블이 영어단어와 한글 단어로 나뉘어있었기 때문에 데이터를 저장할 때 언어분류를 어떻게 해야 할지 감이 잡히지 않아 난감했다. <br/>
✔ 번역 기능에서 사용했던 언어 감지 API를 재사용하여 검색한 단어의 언어를 분류했고 SQL 문을 분리하여 언어에 따라 데이터가 저장될 수 있게 하였고, 수많은 시행착오를 겪으며 언어의 규칙성을 이해했고 입력한 글과 번역된 글을 쪼개어 개수가 일치하면 저장할 수 있게 기능을 구현하였다.

* 배운 점 <br/>
💡 비동기 통신 기능에 대한 이해(Ajax의 콜백함수를 이용한 중첩 Ajax 등) <br/>
💡 기능 요구사항 파악에 대한 심층적 이해 <br/>
💡 API 활용 및 API 사용에 대한 역량 습득 <br/>
💡 협업 툴에 대한 이해 및 활용(Git 관련) <br/>
💡 요구사항 기반 DB 설계 및 테이블 정규화 <br/>

**6. 시연 영상** <br/>
[![Video Label](http://img.youtube.com/vi/RpYz32goPp8/0.jpg)](https://youtu.be/RpYz32goPp8?t=0s)
