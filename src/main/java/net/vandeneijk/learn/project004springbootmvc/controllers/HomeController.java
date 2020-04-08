/**
 * Created by Robert van den Eijk on 6-4-2020.
 */

package net.vandeneijk.learn.project004springbootmvc.controllers;

import net.vandeneijk.learn.project004springbootmvc.models.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute
    public void modelData(Model model) { // This method is called before @RequestMapping annotated methods. A Model is created and the attribute is added.
        model.addAttribute("name", "Aliens");
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String getHomePage() {
        System.out.println("Home page requested.");
        return "index";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int numA, @RequestParam("num2") int numB, Model model) {
        int num3 = numA + numB;
        model.addAttribute("num3", num3);

        return "result";
    }

    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute Alien alien) { // Optionally, you can type "@ModelAttribute("myAlien") Alien alien" and use "myAlien" in result.jsp instead of "alien".

        return "result";
    }
}
