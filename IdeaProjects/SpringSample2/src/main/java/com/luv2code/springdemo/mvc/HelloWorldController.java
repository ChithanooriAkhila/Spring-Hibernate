package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
        public String showForm () {
            return "helloworld-form";
        }
        @RequestMapping("/processForm")
        public String processForm () {
            return "helloworld";
        }
        @RequestMapping("/processFormVersionTwo")
        public String processFormVersionTwo (HttpServletRequest request, Model model){
            String theName = request.getParameter("StudentName");
            String result = "Yo! " + theName.toUpperCase();
            model.addAttribute("message", result);
            return "helloworld";
        }
        @RequestMapping("/processFormVersionThree")
        public String processFormVersionThree (
                @RequestParam("studentName") String myName, Model model){
            myName = myName.toUpperCase();
            String result = "Hey from v3! " + myName;
            model.addAttribute("message", result);
            return "helloworld";
        }
}
