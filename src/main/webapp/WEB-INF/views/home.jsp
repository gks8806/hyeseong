<!doctype html>
<html lang="ja">
<head>
	<!-- Required meta tags -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<!-- Bootstrap CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<!-- 외부 플러그인 CSS -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fullPage.js/2.9.7/jquery.fullpage.css">
	<!-- 사용자가 추가한 CSS -->
	<link rel="stylesheet" href="css/style.css">
	<title>부트스트랩4.0으로 홈페이지 만들기</title>
	<style>
	/* 가로 슬라이드 네비 위치 및 색상 
	* --------------------------------------- */
	.fp-slidesNav.bottom{bottom: 125px; text-align:center;}
	#fp-nav span, .fp-slidesNav span{background: white!important;}
	</style>
</head>
<body>
<!-- Menu -->
<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
	<a class="navbar-brand" href="/" >포트폴리오</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle Navigation">
		<span class="navbar-toggler-icon"></span>
	</button>	
	<div class="collapse navbar-collapse" id="navbarCollapse">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item menu_header active">
				<a class="nav-link" href="#header">Home</a>
			</li>
			<li class="nav-item menu_section1">
				<a class="nav-link" href="#section1">보유기술</a>
			</li>
			<li class="nav-item menu_section2">
				<a class="nav-link" href="#section2">관심분야</a>
			</li>
			<li class="nav-item menu_footer">
				<a class="nav-link" href="#footer">자격증 및 작업내역</a>
			</li>
			<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">클라우드프로젝트</a>
					<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
					<li><a href="https://github.com/miniplugin/kimilguk" target="blank">Git소스바로가기(형상관리)</a></li>
					<li class="dropdown">
					<a class="dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">헤로쿠클라우드</a>
					<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
					<li class="dropdown">
						<a class="dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">포트폴리오</a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
						<li><a href="http://kimilguk.herokuapp.com/" target="blank">스프링 웹프로젝트</a></li>
						<li><a href="http://kimilguk.herokuapp.com/sample" target="blank">원페이지 웹프로젝트</a></li>
						<li><a href="http://kimilguk.herokuapp.com/sample/slide" target="blank">슬라이드 웹프로젝트</a></li>
						</ul>
					</li>
					</ul>
					</li>
					</ul>
			</li>
			<li class="nav-item">
					<div id="google_translate_element"></div>
					<script type="text/javascript">
					function googleTranslateElementInit() {
						new google.translate.TranslateElement({pageLanguage: 'ko', includedLanguages: 'en,ja,vi,zh-CN,zh-TW,de,es,fr,la,pt,ru,th', layout: google.translate.TranslateElement.InlineLayout.SIMPLE}, 'google_translate_element');
					}
					</script>
					<script type="text/javascript" src="https://translate.google.com/translate_a/element.js?cb=googleTranslateElementInit"></script>
					<style>
						.goog-te-gadget {font-family:helvetica,meiryo,gulim,AppleGothic,sans-serif;}
						.goog-te-menu2 {margin-top:5px; border:1px solid #dcdcdc !important;}
						.goog-te-menu2-item div, .goog-te-menu2-item:link div, .goog-te-menu2-item:visited div, .goog-te-menu2-item:active div {color:#000 !important;}
					</style>
			</li>
		</ul>
	</div>	
</nav>
<div class="language"><!-- active 클래스명 -->
	<div class="language-current">
			<span class="flag flag-ko-KR"></span>
			<span class="language-name">Korean</span>
	</div>
	<svg xmlns="http://www.w3.org/2000/svg" version="1.1" class="language-triangle">
		<polygon points="0,0 8,0 4, 6">
	</polygon></svg>
	<div class="submenu languages">
			<ul>
				<li><a href="#/en/"><span class="flag flag-en-US"></span><span class="language-name">English</span></a></li>
				<li><a href="#/zh/"><span class="flag flag-zh-CN"></span><span class="language-name">Chinese</span></a></li>
				<li><a href="#/ja/"><span class="flag flag-ja-JP"></span><span class="language-name">Japanese</span></a></li>
				<li><a href="#/vi/"><span class="flag flag-vi-VN"></span><span class="language-name">Vietnamese</span></a></li>
			</ul>
	</div>
</div>
<!-- 1페이지 스크롤 영역 Start -->
<div id="fullpage">
	<!-- 헤더 -->
	<div class="header section" data-anchor="header">
		<div class="container">
			<div class="slide active">
				<div class="row">
					<div class="d-none d-md-block col-md-5 col-sm-5">
						<img src="images/symu-panel-1.png" class="cover-image float-right">
					</div>
					<div class="col-md-7 col-sm-7">
						<h3><span class="highlight">스프링 웹프로젝트 - 오픈소스</span></h3>
						<p>작업자: 한혜성 &nbsp;&nbsp; &nbsp;&nbsp; 등록일:2020.07.27</p>          
						<p>《사용기술》 스프링프레임웍, Hsql(Mysql호환), RestAPI </p>
						<p>Git저장소소스: https://gks8806.github.io/WebContent</p>
						<p>▶ 결과물 바로가기: <a href="https://hyeseong.herokuapp.com/" target="blank">https://hyeseong.herokuapp.com/</a></p>
						</span>
					</div>
				</div>
			</div>
			<div class="slide">
				<div class="row">
					<div class="d-none d-md-block col-md-5 col-sm-5">
						<img src="images/symu-panel-3.png" class="cover-image float-right">
					</div>
					<div class="col-md-7 col-sm-7">
						<h3><span class="highlight">반응형 웹프로젝트 - 오픈소스</span></h3>
						<p>작업자: 한혜성 &nbsp;&nbsp; &nbsp;&nbsp; 등록일:2020.06.27</p>          
						<p>《사용기술》 부트스트랩, JQuery(자바스크립트) </p>
						<p>Git저장소소스: https://github.com/gks8806/hyeseong</p>
						<p>▶ 결과물 바로가기: <a href="http://hyeseong.herokuapp.com/sample" target="blank">http://hyeseong.herokuapp.com/sample</a></p>
						</span>
					</div>
				</div>
			</div>
			<div class="slide">
				<div class="row">
					<div class="d-none d-md-block col-md-5 col-sm-5">
						<img src="images/symu-panel-2.png" class="cover-image float-right">
					</div>
					<div class="col-md-7 col-sm-7">
						<h3><span class="highlight">슬라이드 웹프로젝트 - 오픈소스</span></h3>
						<p>작업자: 한혜성 &nbsp;&nbsp; &nbsp;&nbsp; 등록일:2020.05.27</p>          
						<p>《사용기술》 부트스트랩, JQuery(자바스크립트) </p>
						<p>Git저장소소스: https://github.com/gks8806/hyeseong</p>
						<p>▶ 결과물 바로가기: <a href="http://hyeseong.herokuapp.com/sample/slide" target="blank">http://hyeseong.herokuapp.com/sample/slide</a></p>
						</span>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- 1 번 섹션 -->
	<div class="section" data-anchor="section1">
		<div class="container">
			<div class="row">
				<div class="col-md-5">
				  <h2 class="mb-5">Skills</h2>
		          <div class="subheading mb-3">Programming Languages &amp; Tools</div>
		          <ul class="list-inline list-icons">
		            <li class="list-inline-item">
		              <link rel="stylesheet" href="https://cdn.rawgit.com/konpa/devicon/df6431e323547add1b4cf45992913f15286456d3/devicon.min.css">
		              <i class="devicon-java-plain-wordmark"></i>
		            </li>
		            <li class="list-inline-item">
		             <link rel="stylesheet" href="https://cdn.rawgit.com/konpa/devicon/df6431e323547add1b4cf45992913f15286456d3/devicon.min.css">
		            <i class="devicon-python-plain-wordmark"></i>
		            </li>
		            <li class="list-inline-item">
		             <link rel="stylesheet" href="https://cdn.rawgit.com/konpa/devicon/df6431e323547add1b4cf45992913f15286456d3/devicon.min.css">
		             <i class="devicon-html5-plain-wordmark"></i>
		            </li>
		            <li class="list-inline-item">
		              <link rel="stylesheet" href="https://cdn.rawgit.com/konpa/devicon/df6431e323547add1b4cf45992913f15286456d3/devicon.min.css">
		              <i class="devicon-android-plain-wordmark"></i>
		            </li>
		            <li class="list-inline-item">
		            <link rel="stylesheet" href="https://cdn.rawgit.com/konpa/devicon/df6431e323547add1b4cf45992913f15286456d3/devicon.min.css">
		            <i class="devicon-django-line-wordmark"></i>
		            </li>
		            <li class="list-inline-item">
		             <link rel="stylesheet" href="https://cdn.rawgit.com/konpa/devicon/df6431e323547add1b4cf45992913f15286456d3/devicon.min.css">
		            <i class="devicon-linux-plain"></i>
		            </li>
		            <li class="list-inline-item">
		              <link rel="stylesheet" href="https://cdn.rawgit.com/konpa/devicon/df6431e323547add1b4cf45992913f15286456d3/devicon.min.css">
		              <i class="devicon-mysql-plain-wordmark"></i>
		            </li>
		            <li class="list-inline-item">
		             <link rel="stylesheet" href="https://cdn.rawgit.com/konpa/devicon/df6431e323547add1b4cf45992913f15286456d3/devicon.min.css">
		              <i class="devicon-php-plain"></i>
		            </li>
		            <li class="list-inline-item">
		             <link rel="stylesheet" href="https://cdn.rawgit.com/konpa/devicon/df6431e323547add1b4cf45992913f15286456d3/devicon.min.css">
		            <i class="devicon-visualstudio-plain"></i>
		            </li>
		            <li class="list-inline-item">
		              <link rel="stylesheet" href="https://cdn.rawgit.com/konpa/devicon/df6431e323547add1b4cf45992913f15286456d3/devicon.min.css">
		              <i class="devicon-github-plain"></i>
		            </li>
		            <li class="list-inline-item">
		            <link rel="stylesheet" href="https://cdn.rawgit.com/konpa/devicon/df6431e323547add1b4cf45992913f15286456d3/devicon.min.css">
		            <i class="devicon-apache-plain-wordmark"></i>
		            </li>
		          </ul>
          		<div class="subheading mb-3">Interests and positions</div>
		          <ul class="fa-ul mb-0">
		            <li>
		              <i class="fa-li fa fa-check"></i>
		                Team project planning</li>
		            <li>
		              <i class="fa-li fa fa-check"></i>
		                Computer Algorithm</li>
		              <i class="fa-li fa fa-check"></i>
		              Web backend Development <br>&amp; Server construction
		              <li>
		              <i class="fa-li fa fa-check"></i>
		                Network programming</li>
		                <li>
		              <i class="fa-li fa fa-check"></i>
		                Android application development</li>
		              <i class="fa-li fa fa-check"></i>
		              Digital Forensic
		            <li>
		              <i class="fa-li fa fa-check"></i>
		               etc.. I like most of the software field!</li>
		          </ul>
				</div>
				<div class="col-md-7">
					<img src="images/symu-panel-1.png">
				</div>
			</div>
		</div>
	</div>

	<!-- 2번 섹션. 흰 배경 -->
	<div class="section" data-anchor="section2">
		<div class="container">
			<div class="row">
				<div class="col-md-7">
					<img src="images/symu-panel-2.png">
				</div>
				<div class="col-md-5">
					<h2 class="mb-5">INTERESTS</h2>
					<p>IT 외에도 게임이나 영화 같은 취미가 있습니다. 주로 실내 활동을 즐기지 만 축구와 같은 스포츠를 즐깁니다. 스포츠 중에서 나는 축구를 가장 좋아하지만 잘 할 수는 없습니다.
					제가 가장 좋아하는 취미는 게임입니다. RPG부터 FPS까지 다양한 게임을 즐깁니다.</p>
					<p>프로그램 개발할 때는 쉽고 빠르게 휴식을 취하고 즐길 수 있기 때문에 게임보다 더 좋은 것은 없습니다. 저는 보통 IT 공부를 가장 많이하지만 다음으로 게임을 합니다.</p>				
				</div>
			</div>
		</div>
	</div>

	<!-- 푸터 -->
	<footer class="footer section" data-anchor="footer">
		<div class="container">
			<div class="row">
			  <h2 class="col-md-7">Certifications &amp; Works</h2>
	          <ul class="fa-ul col-md-5 text-left">
	            <li>
	              <i class="fa-li fa fa-trophy text-warning"></i>
	              <strong>클라우드파스타용 스프링프로젝트</strong>   http://hyeseong-mysql.paas-ta.org/</li>
	            <li>
	              <i class="fa-li fa fa-trophy text-warning"></i>
	              <strong>클라우드파스타용 전자정부프로젝트</strong>  http://hyeseong-egov.paas-ta.org/</li>
	              <span>- 관지가관리기능 메뉴추가 : 마이바티스사용</span>
	            <li>
	              <i class="fa-li fa fa-trophy text-warning"></i>
	              <strong>클라우드헤로쿠용 스프링프로젝트(로딩시간이 길어요!!)</strong>   https://hyeseong.herokuapp.com/</li>
	          </ul>
			</div>
		</div>
	</footer>
</div>
<!-- 1페이지 스크롤 영역 Start -->

<!-- 아래페이지 이동 버튼 -->
<button id="moveDown" class="btn btn-outline-primary"><i class="arrow down"></i></button>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<!-- 외부 플러그인 js  -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/fullPage.js/2.9.7/jquery.fullpage.js"></script>
<!-- 사용자 지정 js Start -->
<script>
	$(function($){ //서브메뉴 클릭유지 스크립트
		$('.dropdown-menu a.dropdown-toggle').on('click', function(e) {
		if (!$(this).next().hasClass('show')) {
			$(this).parents('.dropdown-menu').first().find('.show').removeClass("show");
		}
		var $subMenu = $(this).next(".dropdown-menu");
		$subMenu.toggleClass('show');

		$(this).parents('li.nav-item.dropdown.show').on('hidden.bs.dropdown', function(e) {
			$('.dropdown-submenu .show').removeClass("show");
		});

		return false;
		});
	})
</script>
<script>
$("#fullpage").fullpage({    //기존
		anchors: ['header', 'section1', 'section2', 'footer'],
		navigationTooltips: ['header', 'section1', 'section2', 'footer'],
		sectionsColor: ['#0798ec','#7baabe','#4bbfc3','#0d121b'],
		navigation: true,
		//loopBottom: true,
		responsiveWidth: 767, //반응형 가로크기 기준
		afterResponsive: function(isResponsive){ //반응형 일때 사용할 액션
			if(isResponsive) {//기존클래스는 d-none d-md-block -> d-none-kim19 으로 변경.
				$(".d-none-kim19").addClass('d-none');
				$("#moveDown").addClass('d-none');
			}else{
				$(".d-none-kim19").removeClass('d-none');
				$("#moveDown").removeClass('d-none');
			}
		},
		afterLoad: function(section_name, section_num){ // 마지막 페이지 도착 확인, onLeave: //페이지 이동 후 확인
			$('.nav-item').removeClass("active");
			$('.menu_' + section_name).addClass("active");
				//alert(section_name);alert(section_num);//디버그
				if(section_name=="footer"){
					$("#moveDown").addClass('d-none');
				}else{
					$("#moveDown").removeClass('d-none');
				}
		},
		slidesNavigation: true,
		afterRender: function () {
            setInterval(function () {
                $.fn.fullpage.moveSlideRight();
            }, 4000);
        },
}); //기존
/* 아래페이지 이동 버튼 */
 $(function(){ //3.x 버전은 더이상 오픈소스가 아니라서, 2.x로 변경
    $('#moveDown').click(function (event) {
        event.preventDefault();
        $.fn.fullpage.moveSectionDown();
    });
});
/* 상단메뉴 선택 버튼 */
$('.nav-item').click(function (event) {
	$('.nav-item').removeClass("active");
	$(this).addClass("active");	
});
/* 언어선택 버튼 */
$('.language').click(function (event) {
	event.preventDefault();
	$(this).toggleClass("active");
});
$("body").click(function(e){
	if(e.target.className == "language-current" || ((e.target.className).indexOf("flag") != -1) || e.target.className == "language-name") { 
				//alert("don't hide");  
		}
		else {
			$('.language').removeClass('active');
		}
});
</script>
<!-- 사용자 지정 js End -->
</body>
</html>
