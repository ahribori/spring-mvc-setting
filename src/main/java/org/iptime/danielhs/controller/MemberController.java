package org.iptime.danielhs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iptime.danielhs.model.MemberDAO;
import org.iptime.danielhs.model.MemberVO;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MemberController extends MultiActionController {
	private MemberDAO memberDAO;

	public MemberController(MemberDAO memberDAO) {
		super();
		this.memberDAO = memberDAO;
	}

	public ModelAndView findMemberById(HttpServletRequest request,
			HttpServletResponse response, MemberVO vo) {
		vo = memberDAO.findMemberById(vo.getId());
		ModelAndView mv=new ModelAndView();
		if(vo==null){
			mv.setViewName("findbyid_fail");
		}else{
			mv.setViewName("findbyid_ok");
			mv.addObject("info",vo);
		}
		return mv;
	}
	public ModelAndView register(HttpServletRequest request,
			HttpServletResponse response, MemberVO vo) {
		memberDAO.register(vo);
		return new ModelAndView("redirect:views/register_result.jsp");
	}
	public ModelAndView findByAddress(HttpServletRequest request,
			HttpServletResponse response) {
		List<MemberVO> list=memberDAO.findByAddress(request.getParameter("address"));
		return new ModelAndView("findbyaddress_result","list",list);
	}
}






