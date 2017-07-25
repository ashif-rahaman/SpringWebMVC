/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ashif
 */
@Controller
public class IndexController {

    @RequestMapping(value = "")
    public String getRootMethod() {

        return "index";
    }

    @RequestMapping(value = "/{url1}/{url2}", method = RequestMethod.GET)
    public String getMethod1(Model model,
            @PathVariable Map<String, String> urls) {

        String url1 = urls.get("url1");
        String url2 = urls.get("url2");

        try {
            model.addAttribute("messege1", url1);
            model.addAttribute("messege2", url2);
        } catch (Exception e) {

            model.addAttribute("eMessege", e.toString());
        }

        return "index";
    }
}
