package com.alamin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1" ) int i,@RequestParam("t2" ) int j){
		//int i=Integer.parseInt(request.getParameter("t1"));
		//int j=Integer.parseInt(request.getParameter("t2"));
		
		int result=i+j;
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result",result);
		
		return mv;
	}
}