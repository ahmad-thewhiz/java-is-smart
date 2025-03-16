package com.ahmad.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName() {
        return "pls javva";
    }

    @RequestMapping("/")
    public String home() {
        System.out.println("Home Page");
        return "index";
    }

//    @RequestMapping("add")
//    public String add(HttpServletRequest request, HttpSession session) {
//
//        int num1 = Integer.parseInt(request.getParameter("num1"));
//        int num2 = Integer.parseInt(request.getParameter("num2"));
//        int res=num1+num2;
//
//        session.setAttribute("res", res);
//
//        System.out.println("sum: " + res);
//
//        return "result.jsp";
//    }

//    @RequestMapping("add")
//    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) { // the variable names must match if not using RequestParam
//        int res = num1 + num2;
//        mv.addObject("res", res);
//        mv.setViewName("result");
//        return mv;
//    }

    @RequestMapping("addAlien")
    public String add(@ModelAttribute Alien alien) { // the variable names must match if not using RequestParam


        return "result";
    }
}
