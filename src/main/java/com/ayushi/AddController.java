package com.ayushi;
import org.springframework.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value= "/firstadd")
public class AddController {
	@GetMapping(value = "/add")
	public String add()
	{
		System.out.println("hellooo");
		return "display.jsp";
	}

}
