package org.edu.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.edu.service.IF_BoardService;
import org.edu.service.IF_MemberService;
import org.edu.vo.BoardVO;
import org.edu.vo.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
	
	@Inject
	private IF_BoardService boardService;
	
	@Inject
	private IF_MemberService memberService;
	
	/**
	 * 게시물관리 리스트 입니다.
	 * @throws Exception 
	 */
	
	@RequestMapping(value = "/admin/board/list", method = RequestMethod.GET)
	public String boardList(Locale locale, Model model) throws Exception {//Local=다국어지원,Model=데이터베이스와연동
				List<BoardVO> list = boardService.selectBoard();
				//모델 클래스를 통해 jsp화면으로 boardService에서 셀렉트한 list값을 boardList변수명으로 보낸다
				//model {list -> memberList -> jsp}
				model.addAttribute("boardList", list);
				return "admin/board/board_list";
	
	}
	
	/**
	 * 회원관리 리스트 입니다.
	 * @throws Exception 
	 */
	@RequestMapping(value = "/admin/member/list", method = RequestMethod.GET)//value:url
	public String memberList(Locale locale, Model model) throws Exception {//Local=다국어지원,Model=데이터베이스와연동
		//모델 클래스를 통해 jsp화면으로 memberService에서 셀렉트한 list값을 memberList변수명으로 보낸다
		//model {list -> memberList -> jsp}
		List<MemberVO> list = memberService.selectMember();
		model.addAttribute("memberList", list);
		return "admin/member/member_list";
	}
	
	/**
	 * 회원관리 상세보기 입니다.
	 * @throws Exception 
	 */
	@RequestMapping(value = "/admin/member/view", method = RequestMethod.GET)
	public String memberView(Locale locale, Model model) throws Exception {//Local=다국어지원,Model=데이터베이스와연동
	
		return "admin/member/member_view";
	}
	/**
	 * 관리자 홈입니다.
	 */
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {//Local=다국어지원,Model=데이터베이스와연동
		
		return "admin/home";
	}
}
