package com.srikar.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.srikar.springmvc.dao.FeedbackDAO;
import com.srikar.springmvc.entity.Feedback;
//Message
@Controller
public class IndexController {

	@Autowired
	FeedbackDAO fDAO;
	
	
	@RequestMapping("/")
	public String home(){
		return "index.jsp";
	}
	
	@RequestMapping("/feedback")
	public String feedback(){
		return "feedback.jsp";
	}
	
	@RequestMapping("/addFeedback")
	public String addFeedback(@ModelAttribute Feedback feedback){
		
		fDAO.addFeedback(feedback);
		return "welcome.jsp";
	}
	
	@RequestMapping("/getFeedback")
	public ModelAndView getFeedback(){
		ModelAndView mv = new ModelAndView("allFeedback.jsp");
		fDAO.getFeedbacks();
		mv.addObject("feedbacks",fDAO.getFeedbacks());
		return mv;
	}
}
