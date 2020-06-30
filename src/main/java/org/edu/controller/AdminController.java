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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	 * 게시물관리 상세보기 입니다.
	 * @throws Exception 
	 */
	@RequestMapping(value = "/admin/board/view", method = RequestMethod.GET)
	public String boardView(@RequestParam("bno") Integer bno,Locale locale, Model model) throws Exception {//Local=다국어지원,Model=데이터베이스와연동
		BoardVO boardVO = boardService.viewBoard(bno);
		model.addAttribute("boardVO", boardVO);//앞에는jsp에서쓸거
		return "admin/board/board_view";
	
	}
	
	/**
	 * 게시물관리 > 등록입니다.
	 * @throws Exception 
	 */
	@RequestMapping(value = "/admin/board/write", method = RequestMethod.GET)
	public String boardWrite(Locale locale, Model model) throws Exception {//Local=다국어지원,Model=데이터베이스와연동
		
		return "admin/board/board_write";
	}
	
	@RequestMapping(value = "/admin/board/write", method = RequestMethod.POST)
	public String boardWrite(BoardVO boardVO,Locale locale, Model model) throws Exception {//Local=다국어지원,Model=데이터베이스와연동
		//BoardVO클래스에 있는 boardVO변수를 오버로드해서 경로추가
		boardService.insertBoard(boardVO);//boardService에 인서트 메서드실행해서 get set이 이뤄지게끔함
		return "redirect:/admin/board/list";
	}
	
	/**
	 * 게시물관리 > 수정입니다.
	 * @throws Exception 
	 */
	@RequestMapping(value = "/admin/board/update", method = RequestMethod.GET)
	public String boardUpdate(@RequestParam("bno") Integer bno, Locale locale, Model model) throws Exception {//Local=다국어지원,Model=데이터베이스와연동
		BoardVO boardVO = boardService.viewBoard(bno);
		model.addAttribute("boardVO", boardVO);
		return "admin/board/board_update";
	}
	
	@RequestMapping(value = "/admin/board/update", method = RequestMethod.POST)
	public String boardUpdate(BoardVO boardVO,Locale locale, RedirectAttributes rdat) throws Exception {//Local=다국어지원,Model=데이터베이스와연동
		//BoardVO클래스에 있는 boardVO변수를 오버로드해서 경로추가
		boardService.updateBoardVO(boardVO);//boardService에 인서트 메서드실행해서 get set이 이뤄지게끔함
		rdat.addFlashAttribute("msg", "success");//redirect하는 곳에 success라는 msg 보내기 
		return "redirect:/admin/board/view?bno=" +boardVO.getBno();
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
	public String memberView(@RequestParam("user_id") String user_id,Locale locale, Model model) throws Exception {//Local=다국어지원,Model=데이터베이스와연동
		MemberVO memberVO = memberService.viewMember(user_id);// 하나의 아이디값 나오게
		model.addAttribute("memberVO", memberVO); // 속성부여
		return "admin/member/member_view";
	}
	
	/**
	 * 회원관리 > 등록입니다.
	 * @throws Exception 
	 */
	@RequestMapping(value = "/admin/member/write", method = RequestMethod.GET)
	public String memberWrite(Locale locale, Model model) throws Exception {//Local=다국어지원,Model=데이터베이스와연동
		
		return "admin/member/member_write";
	}
	
	 @RequestMapping(value = "/admin/member/write", method = RequestMethod.POST)
	   public String memberWrite(MemberVO memberVO, Locale locale, RedirectAttributes rdat) throws Exception {
	      memberService.insertMember(memberVO);
	      return "redirect:/admin/member/list";
	   }
	 
	 /**
		 * 회원관리 > 수정입니다.
		 * @throws Exception 
		 */
		@RequestMapping(value = "/admin/member/update", method = RequestMethod.GET)
		public String memberUpdate(@RequestParam("user_id") String user_id,Locale locale, Model model) throws Exception {//Local=다국어지원,Model=데이터베이스와연동
			//매개변수필요 user_id매개변수가 있어야지 select값을 불러올수있음
			MemberVO memberVO = memberService.viewMember(user_id);
			model.addAttribute("memberVO", memberVO);
			return "admin/member/member_update";
		}
		
		 @RequestMapping(value = "/admin/member/update", method = RequestMethod.POST)
		   public String memberUpdate(MemberVO memberVO, Locale locale, RedirectAttributes rdat) throws Exception {
		      memberService.updateMember(memberVO);
		      rdat.addFlashAttribute("msg", "success");//msg값을 보내줄수있음
		      return "redirect:/admin/member/view?user_id="+memberVO.getUser_id();
		   }
	 
	/**
	 * 관리자 홈입니다.
	 */
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {//Local=다국어지원,Model=데이터베이스와연동
		
		return "admin/home";
	}
}
