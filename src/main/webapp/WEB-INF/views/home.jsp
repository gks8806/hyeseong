<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8" />
<title>HTML5 기본구조</title>
</head>
<body>
	<header>
		<div class="hyeseong">
			<h1>Hello world!</h1>
			<nav id="gnb"></nav>
			<ul>
				<li>메뉴1</li>
				<li>메뉴2</li>
				<li>메뉴3</li>
			</ul>
		</div>
	</header>
	<section class="banner_slider">
		<div id="slider" class="nivoSlider">
			<img src="http://edu19.dothome.co.kr/metro/image/alp1.jpg"
				title="슬라이드1">
		</div>
	</section>
	<section id="contens" class="hyeseong">
		<article id="main">
			<P>The time on the server is ${serverTime}.</P>
		</article>
	</section>
	<footer>
		<p class="hyeseong">주소: 충남 천안시 성정동 롯데마트 4층 하이마트 매장내임</p>

	</footer>



</body>
</html>
