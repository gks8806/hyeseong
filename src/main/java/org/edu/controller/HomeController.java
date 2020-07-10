package org.edu.controller;

import java.text.DateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.edu.service.IF_MemberService;
import org.edu.vo.MemberVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication; //Authentication은 인증 정보를 의미하는 인터페이스다
import org.springframework.security.core.GrantedAuthority;//GrantedAuthority를 ​​"허가"또는 "권리"라고 생각하십시오. 이러한 "권한"은 (보통) 문자열로 표현됩니다 (getAuthority() 메소드 사용). 이러한 문자열을 통해 사용 권한을 식별하고 유권자가 무언가에 대한 액세스 권한을 부여할지 여부를 결정할 수 있습니다.
import org.springframework.security.core.context.SecurityContextHolder;//모든 접근 주체는 Authentication을 생성한다.이것은 SecuriyContext에 접근 주체(Authentication)와 인증정보(GrantedAuthority)을 담겨져 사용된다.현재 로그인한 사용자 정보를 가지고 있는 바스켓(?)이라 생각하면 될 듯 하다.ThreadLocal에 보관되며, SecurityContextHolder를 통해 접근할 수 있다.
import org.springframework.security.core.userdetails.UserDetails;//아이디,암호 체크
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Inject
	private IF_MemberService memberService; 
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * 스프링 시큐리티 security-context.xml설정한 로그인 처리 결과 화면
	 * @throws Exception 
	 */
	
	@RequestMapping(value = "/login_success", method = RequestMethod.GET)
		public String login_success(Locale locale,HttpServletRequest request, RedirectAttributes rdat) throws Exception {
			logger.info("Welcome login_success! The client locale is {}.", locale);
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			
			String userid = "";//유저아이디
			String levels = "";//ROLE_ANONYMOUS
			Boolean enabled = false;
			Object principal = authentication.getPrincipal();//Principal 구현
			if (principal instanceof UserDetails) {
				//인증이 처리되는 로직(아이디,암호를 스프링 시큐리티에 던져주고 인증은 스프링에서 알아서 해줌)
				enabled = ((UserDetails)principal).isEnabled();
			}
			HttpSession session = request.getSession(); //세션을 초기화 시켜줌.
			if (enabled) { //인증처리가 완료된 사용자의 권한체크(아래)
				Collection<? extends GrantedAuthority>  authorities = authentication.getAuthorities();
				if(authorities.stream().filter(o -> o.getAuthority().equals("ROLE_ANONYMOUS")).findAny().isPresent())
				{levels = "ROLE_ANONYMOUS";}
				if(authorities.stream().filter(o -> o.getAuthority().equals("ROLE_USER,")).findAny().isPresent())
				{levels = "ROLE_USER,";}
				if(authorities.stream().filter(o -> o.getAuthority().equals("ROLE_ADMIN")).findAny().isPresent())
				{levels = "ROLE_ADMIN";}
				userid =((UserDetails)principal).getUsername();
				
				//로그인 세션 저장
				session.setAttribute("session_enabled", enabled);//인증확인
				session.setAttribute("session_userid", userid);//사용자아이디
				session.setAttribute("session_levels", levels);//사용자권한
				
				//=========== 삳단은 스프링시큐리티에서 기본제공하는 세션 변수처리
				//=========== 하단은 우리가 추가하는 세션 변수처리
				//회원이름 구하기 추가
				String username = "";//이름
				MemberVO memberVO = memberService.viewMember(userid);
				session.setAttribute("session_username", memberVO.getUser_name());//사용자명
	        	}
			rdat.addFlashAttribute("msg", "로그인");//result 데이터를 숨겨서 전송
			return "redirect:/";//새로고침 자동 등록 방지를 위해서 아래처럼 처리
		}
	
	
	/**
	 * 로그인 페이지 파일 입니다.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		
		return "login";
	}
	
	/**
	 * slide 페이지 파일 입니다.
	 */
	@RequestMapping(value = "/sample/slide", method = RequestMethod.GET)
	public String slide(Locale locale, Model model) {
		
		return "sample/slide";
	}
	/**
	 * contactus 페이지 파일 입니다.
	 */
	@RequestMapping(value = "/sample/contactus", method = RequestMethod.GET)
	public String contactus(Locale locale, Model model) {
		
		return "sample/contactus";
	}
	/**
	 * blog 페이지 파일 입니다.
	 */
	@RequestMapping(value = "/sample/blog", method = RequestMethod.GET)
	public String blog(Locale locale, Model model) {
		
		return "sample/blog";
	}
	/**
	 * work 페이지 파일 입니다.
	 */
	@RequestMapping(value = "/sample/work", method = RequestMethod.GET)
	public String work(Locale locale, Model model) {
		
		return "sample/work";
	}
	/**
	 * weare 페이지 파일 입니다.
	 */
	@RequestMapping(value = "/sample/weare", method = RequestMethod.GET)
	public String weare(Locale locale, Model model) {
		
		return "sample/weare";
	}
	
	/**
	 * html5테스트 파일 입니다.
	 */
	@RequestMapping(value = "/sample/HTMLTEST", method = RequestMethod.GET)
	public String HTMLTEST(Locale locale, Model model) {
		
		return "sample/HTMLTEST";
	}
	
	/**
	 * 샘플 파일 홈 입니다.
	 */
	@RequestMapping(value = "/sample", method = RequestMethod.GET)
	public String sample(Locale locale, Model model) {
		
		return "sample/home";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
