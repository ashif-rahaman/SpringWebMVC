/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ashif
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController {

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postHome(Model model, @RequestParam Map<String, String> paramValues) {

        String username = paramValues.get("username");
        String password = paramValues.get("password");

        boolean isUsernameEmpty = "".equals(username), isPasswordEmpty = "".equals(password);

        if (!(isPasswordEmpty || isUsernameEmpty)) {

            model.addAttribute("username", username);
            model.addAttribute("password", password);

            return "home";
        }

        if (isUsernameEmpty && isPasswordEmpty) {

            model.addAttribute("errorMessage", "Username & password is empty!");
        } else if (isPasswordEmpty) {

            model.addAttribute("errorMessage", "Password is empty!");
        } else if (isUsernameEmpty) {

            model.addAttribute("errorMessage", "Username is empty!");
        }

        return "index";
    }
}
