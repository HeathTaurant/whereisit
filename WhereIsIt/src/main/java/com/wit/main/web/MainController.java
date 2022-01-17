package com.wit.main.web;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.wit.main.service.MainService;
import com.wit.main.service.MainVO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@Resource(name="mainService")
	private MainService mainService;


	@RequestMapping("/main")
	public String main (@ModelAttribute MainVO vo, HttpServletRequest request, Model model, HttpSession session) {
		try {
			System.out.println("main Controller Start");
			int result = 0;
			LocalDateTime now = LocalDateTime.now();
			String nowtime = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
			vo.setDBC_NOWTIME(nowtime);
			result = mainService.updateDBCheckList(vo);
			List<MainVO> DBList = mainService.getDBCheckList();
			vo.setDBC_LASTCON(nowtime);
			result = mainService.updateDBCheckList(vo);
			model.addAttribute("mainList", DBList);
			System.out.println("main Controller end call page");
			System.out.println(DBList);
		}
		catch(Exception e)
		{
			System.out.println(":::::::" + e);
		}
		
		return "main";
	}
	
}
